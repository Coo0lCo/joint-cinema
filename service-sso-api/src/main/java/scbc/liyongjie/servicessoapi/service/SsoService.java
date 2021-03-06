package scbc.liyongjie.servicessoapi.service;

import org.springframework.stereotype.Service;
import scbc.liyongjie.servicessoapi.dao.StoreHouseMapper;
import scbc.liyongjie.servicessoapi.dao.UserPoMapper;
import scbc.liyongjie.servicessoapi.enums.PrefixEnum;
import scbc.liyongjie.servicessoapi.exception.PasswordException;
import scbc.liyongjie.servicessoapi.exception.UnRegisteredException;
import scbc.liyongjie.servicessoapi.po.UserPo;
import scbc.liyongjie.servicessoapi.pojo.SsoPoJo;
import scbc.liyongjie.servicessoapi.pojo.UserPoJo;
import scbc.liyongjie.servicessoapi.util.JwtUtils;
import scbc.liyongjie.servicessoapi.util.PBKDF2Utils;
import scbc.liyongjie.servicessoapi.util.RedisUtil;
import scbc.liyongjie.servicessoapi.util.UUIDUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;
import java.util.UUID;

/**
 * @Author:SCBC_LiYongJie
 * @time:2022/3/5
 *         任务主要有两个:
 *              1.密码校验
 *              2.生成jwt token 并存入redis + header
 */

@Service
public class SsoService {

    @Resource
    private RedisUtil redisUtil;

    @Resource
    private UserPoMapper userPoMapper;

    @Resource
    private HttpServletResponse httpServletResponse;

    @Resource
    private StoreHouseMapper storeHouseMapper;

    public UserPoJo sso(SsoPoJo ssoPoJo){
        //检查是否注册
        isExist(ssoPoJo.getNumber());

        //dao查询数据库返回Po实体
        UserPo userPo = userPoMapper.selectByPrimaryKey(ssoPoJo.getNumber());

        //比对校验密码是否上输入正确
        check(ssoPoJo.getPassword(),userPo.getPwdshash(),userPo.getPwdsalt());

        //检查是否在线，在线则使其失效
        isOnline(ssoPoJo.getNumber());

        //将jwt token添加至header
        httpServletResponse.addHeader(PrefixEnum.TOKEN.getPrefix(), cacheToken(ssoPoJo.getNumber()));
        httpServletResponse.addHeader("Access-Control-Expose-Headers","token");

        return buildUserPoJo(ssoPoJo.getNumber(),userPo.getName(),userPo.getAvatar(),storeHouseMapper.selectByPrimaryKey(ssoPoJo.getNumber()).getStorehouse());
    }

    private UserPoJo buildUserPoJo(String number,String nickname,String avatar,String storehouseUUID){
        UserPoJo userPoJo = new UserPoJo();
        userPoJo.setAvatar(avatar);
        userPoJo.setNumber(number);
        userPoJo.setNickname(nickname);
        userPoJo.setStorehouseUUID(storehouseUUID);
        return userPoJo;
    }

    /**
     * 检查用户是否在线，在线则使其token失效
     * @param number    number
     */
    private void isOnline(String number) {
        if (redisUtil.hasKey(PrefixEnum.NUMBER.getPrefix()+number)){
            String token = redisUtil.get(PrefixEnum.NUMBER.getPrefix()+number);
            redisUtil.delete(PrefixEnum.NUMBER.getPrefix()+number,PrefixEnum.TOKEN.getPrefix()+token);
        }
    }

    /**
     * 判断该手机号是否注册
     * @param number number
     */
    private void isExist(String number) {
        if (Objects.isNull(userPoMapper.selectByPrimaryKey(number)))
            throw new UnRegisteredException();
    }

    /**
     * 校验密码是否正确
     * @param pwd   输入密码
     * @param pwdHash   数据库存储的密码Hash+salt=result
     * @param pwdSalt   数据库存储的随机salt
     */
    private void check(String pwd,String pwdHash ,String pwdSalt){
        if (!PBKDF2Utils.check(pwd,pwdHash,pwdSalt))
            throw new PasswordException();
    }

    /**
     * redis缓存jwt token 并返回 jwt
     * @param number number
     * @return  返回jwt token
     */
    private String cacheToken(String number){

        //生成jwt+secret(采用jug生成)
        String secret = UUIDUtils.getUUID();
        String jwt = JwtUtils.creatJwt(number,secret);

        //redis双向绑定  token <--> number
        redisUtil.set(PrefixEnum.TOKEN.getPrefix()+jwt, secret);
        redisUtil.set(PrefixEnum.NUMBER.getPrefix()+number, jwt);

        return jwt;
    }

}
