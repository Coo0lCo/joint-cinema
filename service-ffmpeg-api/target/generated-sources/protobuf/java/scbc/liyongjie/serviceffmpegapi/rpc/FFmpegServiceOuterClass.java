// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FFmpegService.proto

package scbc.liyongjie.serviceffmpegapi.rpc;

public final class FFmpegServiceOuterClass {
  private FFmpegServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegBuildDASHServiceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegBuildDASHServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegBuildThumbnailServiceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegBuildThumbnailServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegCalculateDurationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegCalculateDurationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_scbc_liyongjie_serviceffmpegapi_rpc_ResultResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_scbc_liyongjie_serviceffmpegapi_rpc_ResultResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023FFmpegService.proto\022#scbc.liyongjie.se" +
      "rviceffmpegapi.rpc\"G\n\035FFmpegBuildDASHSer" +
      "viceRequest\022\022\n\noriginPath\030\001 \001(\t\022\022\n\ntarge" +
      "tPath\030\002 \001(\t\"L\n\"FFmpegBuildThumbnailServi" +
      "ceRequest\022\022\n\noriginPath\030\001 \001(\t\022\022\n\ntargetP" +
      "ath\030\002 \001(\t\"4\n\036FFmpegCalculateDurationRequ" +
      "est\022\022\n\noriginPath\030\001 \001(\t\"A\n\016ResultRespons" +
      "e\022\016\n\006result\030\001 \001(\t\022\016\n\006status\030\002 \001(\005\022\017\n\007cod" +
      "eMsg\030\003 \001(\t2\335\003\n\rFFmpegService\022\223\001\n\026ffmpegB" +
      "uildDASHService\022B.scbc.liyongjie.service" +
      "ffmpegapi.rpc.FFmpegBuildDASHServiceRequ" +
      "est\0323.scbc.liyongjie.serviceffmpegapi.rp" +
      "c.ResultResponse\"\000\022\235\001\n\033ffmpegBuildThumbn" +
      "ailService\022G.scbc.liyongjie.serviceffmpe" +
      "gapi.rpc.FFmpegBuildThumbnailServiceRequ" +
      "est\0323.scbc.liyongjie.serviceffmpegapi.rp" +
      "c.ResultResponse\"\000\022\225\001\n\027ffmpegCalculateDu" +
      "ration\022C.scbc.liyongjie.serviceffmpegapi" +
      ".rpc.FFmpegCalculateDurationRequest\0323.sc" +
      "bc.liyongjie.serviceffmpegapi.rpc.Result" +
      "Response\"\000B\'\n#scbc.liyongjie.serviceffmp" +
      "egapi.rpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegBuildDASHServiceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegBuildDASHServiceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegBuildDASHServiceRequest_descriptor,
        new java.lang.String[] { "OriginPath", "TargetPath", });
    internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegBuildThumbnailServiceRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegBuildThumbnailServiceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegBuildThumbnailServiceRequest_descriptor,
        new java.lang.String[] { "OriginPath", "TargetPath", });
    internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegCalculateDurationRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegCalculateDurationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegCalculateDurationRequest_descriptor,
        new java.lang.String[] { "OriginPath", });
    internal_static_scbc_liyongjie_serviceffmpegapi_rpc_ResultResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_scbc_liyongjie_serviceffmpegapi_rpc_ResultResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_scbc_liyongjie_serviceffmpegapi_rpc_ResultResponse_descriptor,
        new java.lang.String[] { "Result", "Status", "CodeMsg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
