package cn.scbc.servicevideouploadapi.result;

/**
 * @Author:SCBC_LiYongJie
 * @time:2022/1/29
 */

public class Result<T> {

    private Integer status;
    private String codeMsg;
    private T data;

    public Result() {

    }
    
    public Result(T data) {
        this.data = data;
        codeMsg = null;
        status = 1;
    }

    public Result(String codeMsg , Integer status){
        this.status = status;
        this.codeMsg = codeMsg;
        this.data = null;
    }

    public static Result<String> uploadSuccess(){
        return new Result<>("upload success");
    }

    public static Result<String> mergeChunkSuccess(){
        return new Result<>("chunkMerge in progress......");
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCodeMsg() {
        return codeMsg;
    }

    public void setCodeMsg(String codeMsg) {
        this.codeMsg = codeMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
