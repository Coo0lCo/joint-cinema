// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FFmpegService.proto

package scbc.liyongjie.serviceffmpegapi.rpc;

public interface ResultResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string result = 1;</code>
   * @return The result.
   */
  java.lang.String getResult();
  /**
   * <code>string result = 1;</code>
   * @return The bytes for result.
   */
  com.google.protobuf.ByteString
      getResultBytes();

  /**
   * <code>int32 status = 2;</code>
   * @return The status.
   */
  int getStatus();

  /**
   * <code>string codeMsg = 3;</code>
   * @return The codeMsg.
   */
  java.lang.String getCodeMsg();
  /**
   * <code>string codeMsg = 3;</code>
   * @return The bytes for codeMsg.
   */
  com.google.protobuf.ByteString
      getCodeMsgBytes();
}