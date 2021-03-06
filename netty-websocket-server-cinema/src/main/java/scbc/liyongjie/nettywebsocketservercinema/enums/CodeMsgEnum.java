package scbc.liyongjie.nettywebsocketservercinema.enums;

/**
 * @Author:SCBC_LiYongJie
 * @time:2022/1/30
 */


public enum CodeMsgEnum {

    ;

    private final Integer status;
    private final String codeMsg;

    CodeMsgEnum(Integer status, String codeMsg) {
        this.status = status;
        this.codeMsg = codeMsg;
    }

    public Integer getStatus() {
        return status;
    }

    public String getCodeMsg() {
        return codeMsg;
    }

}
