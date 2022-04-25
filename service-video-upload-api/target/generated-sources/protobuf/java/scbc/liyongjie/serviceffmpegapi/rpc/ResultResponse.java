// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FFmpegService.proto

package scbc.liyongjie.serviceffmpegapi.rpc;

/**
 * Protobuf type {@code scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse}
 */
public final class ResultResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse)
    ResultResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResultResponse.newBuilder() to construct.
  private ResultResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResultResponse() {
    result_ = "";
    codeMsg_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResultResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResultResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            result_ = s;
            break;
          }
          case 16: {

            status_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            codeMsg_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return scbc.liyongjie.serviceffmpegapi.rpc.FFmpegServiceOuterClass.internal_static_scbc_liyongjie_serviceffmpegapi_rpc_ResultResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return scbc.liyongjie.serviceffmpegapi.rpc.FFmpegServiceOuterClass.internal_static_scbc_liyongjie_serviceffmpegapi_rpc_ResultResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse.class, scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private volatile java.lang.Object result_;
  /**
   * <code>string result = 1;</code>
   * @return The result.
   */
  @java.lang.Override
  public java.lang.String getResult() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      result_ = s;
      return s;
    }
  }
  /**
   * <code>string result = 1;</code>
   * @return The bytes for result.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResultBytes() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      result_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_;
  /**
   * <code>int32 status = 2;</code>
   * @return The status.
   */
  @java.lang.Override
  public int getStatus() {
    return status_;
  }

  public static final int CODEMSG_FIELD_NUMBER = 3;
  private volatile java.lang.Object codeMsg_;
  /**
   * <code>string codeMsg = 3;</code>
   * @return The codeMsg.
   */
  @java.lang.Override
  public java.lang.String getCodeMsg() {
    java.lang.Object ref = codeMsg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      codeMsg_ = s;
      return s;
    }
  }
  /**
   * <code>string codeMsg = 3;</code>
   * @return The bytes for codeMsg.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCodeMsgBytes() {
    java.lang.Object ref = codeMsg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      codeMsg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(result_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, result_);
    }
    if (status_ != 0) {
      output.writeInt32(2, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codeMsg_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, codeMsg_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(result_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, result_);
    }
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(codeMsg_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, codeMsg_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse)) {
      return super.equals(obj);
    }
    scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse other = (scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse) obj;

    if (!getResult()
        .equals(other.getResult())) return false;
    if (getStatus()
        != other.getStatus()) return false;
    if (!getCodeMsg()
        .equals(other.getCodeMsg())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getResult().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    hash = (37 * hash) + CODEMSG_FIELD_NUMBER;
    hash = (53 * hash) + getCodeMsg().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse)
      scbc.liyongjie.serviceffmpegapi.rpc.ResultResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return scbc.liyongjie.serviceffmpegapi.rpc.FFmpegServiceOuterClass.internal_static_scbc_liyongjie_serviceffmpegapi_rpc_ResultResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return scbc.liyongjie.serviceffmpegapi.rpc.FFmpegServiceOuterClass.internal_static_scbc_liyongjie_serviceffmpegapi_rpc_ResultResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse.class, scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse.Builder.class);
    }

    // Construct using scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      result_ = "";

      status_ = 0;

      codeMsg_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return scbc.liyongjie.serviceffmpegapi.rpc.FFmpegServiceOuterClass.internal_static_scbc_liyongjie_serviceffmpegapi_rpc_ResultResponse_descriptor;
    }

    @java.lang.Override
    public scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse getDefaultInstanceForType() {
      return scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse.getDefaultInstance();
    }

    @java.lang.Override
    public scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse build() {
      scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse buildPartial() {
      scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse result = new scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse(this);
      result.result_ = result_;
      result.status_ = status_;
      result.codeMsg_ = codeMsg_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse) {
        return mergeFrom((scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse other) {
      if (other == scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse.getDefaultInstance()) return this;
      if (!other.getResult().isEmpty()) {
        result_ = other.result_;
        onChanged();
      }
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      if (!other.getCodeMsg().isEmpty()) {
        codeMsg_ = other.codeMsg_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object result_ = "";
    /**
     * <code>string result = 1;</code>
     * @return The result.
     */
    public java.lang.String getResult() {
      java.lang.Object ref = result_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        result_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string result = 1;</code>
     * @return The bytes for result.
     */
    public com.google.protobuf.ByteString
        getResultBytes() {
      java.lang.Object ref = result_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        result_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string result = 1;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string result = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = getDefaultInstance().getResult();
      onChanged();
      return this;
    }
    /**
     * <code>string result = 1;</code>
     * @param value The bytes for result to set.
     * @return This builder for chaining.
     */
    public Builder setResultBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      result_ = value;
      onChanged();
      return this;
    }

    private int status_ ;
    /**
     * <code>int32 status = 2;</code>
     * @return The status.
     */
    @java.lang.Override
    public int getStatus() {
      return status_;
    }
    /**
     * <code>int32 status = 2;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object codeMsg_ = "";
    /**
     * <code>string codeMsg = 3;</code>
     * @return The codeMsg.
     */
    public java.lang.String getCodeMsg() {
      java.lang.Object ref = codeMsg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        codeMsg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string codeMsg = 3;</code>
     * @return The bytes for codeMsg.
     */
    public com.google.protobuf.ByteString
        getCodeMsgBytes() {
      java.lang.Object ref = codeMsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        codeMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string codeMsg = 3;</code>
     * @param value The codeMsg to set.
     * @return This builder for chaining.
     */
    public Builder setCodeMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      codeMsg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string codeMsg = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCodeMsg() {
      
      codeMsg_ = getDefaultInstance().getCodeMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string codeMsg = 3;</code>
     * @param value The bytes for codeMsg to set.
     * @return This builder for chaining.
     */
    public Builder setCodeMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      codeMsg_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse)
  }

  // @@protoc_insertion_point(class_scope:scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse)
  private static final scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse();
  }

  public static scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResultResponse>
      PARSER = new com.google.protobuf.AbstractParser<ResultResponse>() {
    @java.lang.Override
    public ResultResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResultResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResultResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResultResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public scbc.liyongjie.serviceffmpegapi.rpc.ResultResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

