package scbc.liyongjie.servicevideoapi.service;

import org.springframework.stereotype.Service;
import scbc.liyongjie.servicevideoapi.dao.ShareVideoMapper;
import scbc.liyongjie.servicevideoapi.dao.VideoMapper;
import scbc.liyongjie.servicevideoapi.exception.ShareRepeatException;
import scbc.liyongjie.servicevideoapi.po.ShareVideo;
import scbc.liyongjie.servicevideoapi.po.Video;
import scbc.liyongjie.servicevideoapi.pojo.ShareVideoPoJo;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @Author:SCBC_LiYongJie
 * @time:2022/3/16
 */

@Service
public class ShareVideoService {

    @Resource
    private SimpleDateFormat simpleDateFormat;

    @Resource
    private ShareVideoMapper shareVideoMapper;

    @Resource
    private VideoMapper videoMapper;

    public void doShare(String number, String providerNumber, String videoUUID) {
        ShareVideo shareVideo = shareVideoMapper.selectByPrimaryKey(number,videoUUID,providerNumber);
        if (!Objects.isNull(shareVideo))
            throw new ShareRepeatException();
        shareVideoMapper.insert(buildShareVideo(number,providerNumber,videoUUID));
    }

    private ShareVideo buildShareVideo(String number, String providerNumber, String videoUUID){
        ShareVideo shareVideo = new ShareVideo();
        shareVideo.setDate(simpleDateFormat.format(new Date()));
        shareVideo.setNumber(number);
        shareVideo.setUuid(videoUUID);
        shareVideo.setProviderNumber(providerNumber);
        return shareVideo;
    }

    public List<ShareVideoPoJo> getShareVideo(String number) {
        List<ShareVideo> shareVideos = shareVideoMapper.selectByNumber(number);
        List<ShareVideoPoJo> shareVideoPoJoList = new ArrayList<>();
        for (ShareVideo shareVideo : shareVideos){
            Video video = videoMapper.selectByPrimaryKey(shareVideo.getUuid());
            if (!Objects.isNull(video)){
                ShareVideoPoJo videoPoJo = new ShareVideoPoJo();
                videoPoJo.setName(video.getName());
                videoPoJo.setProvider(shareVideo.getProviderNumber());
                videoPoJo.setSize(video.getSize());
                videoPoJo.setThumbnail(video.getThumbnail());
                videoPoJo.setUuid(shareVideo.getUuid());
                videoPoJo.setUrl(video.getUrl());
                shareVideoPoJoList.add(videoPoJo);
            }
        }
        return shareVideoPoJoList;
    }

}
