// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FFmpegService.proto

package scbc.liyongjie.serviceffmpegapi.rpc;

/**
 * Protobuf type {@code scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest}
 */
public final class FFmpegBuildThumbnailServiceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest)
    FFmpegBuildThumbnailServiceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FFmpegBuildThumbnailServiceRequest.newBuilder() to construct.
  private FFmpegBuildThumbnailServiceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FFmpegBuildThumbnailServiceRequest() {
    originPath_ = "";
    targetPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FFmpegBuildThumbnailServiceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FFmpegBuildThumbnailServiceRequest(
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

            originPath_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            targetPath_ = s;
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
    return scbc.liyongjie.serviceffmpegapi.rpc.FFmpegServiceOuterClass.internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegBuildThumbnailServiceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return scbc.liyongjie.serviceffmpegapi.rpc.FFmpegServiceOuterClass.internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegBuildThumbnailServiceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest.class, scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest.Builder.class);
  }

  public static final int ORIGINPATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object originPath_;
  /**
   * <code>string originPath = 1;</code>
   * @return The originPath.
   */
  @java.lang.Override
  public java.lang.String getOriginPath() {
    java.lang.Object ref = originPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      originPath_ = s;
      return s;
    }
  }
  /**
   * <code>string originPath = 1;</code>
   * @return The bytes for originPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOriginPathBytes() {
    java.lang.Object ref = originPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      originPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGETPATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object targetPath_;
  /**
   * <code>string targetPath = 2;</code>
   * @return The targetPath.
   */
  @java.lang.Override
  public java.lang.String getTargetPath() {
    java.lang.Object ref = targetPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      targetPath_ = s;
      return s;
    }
  }
  /**
   * <code>string targetPath = 2;</code>
   * @return The bytes for targetPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTargetPathBytes() {
    java.lang.Object ref = targetPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      targetPath_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(originPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, originPath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, targetPath_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(originPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, originPath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, targetPath_);
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
    if (!(obj instanceof scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest)) {
      return super.equals(obj);
    }
    scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest other = (scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest) obj;

    if (!getOriginPath()
        .equals(other.getOriginPath())) return false;
    if (!getTargetPath()
        .equals(other.getTargetPath())) return false;
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
    hash = (37 * hash) + ORIGINPATH_FIELD_NUMBER;
    hash = (53 * hash) + getOriginPath().hashCode();
    hash = (37 * hash) + TARGETPATH_FIELD_NUMBER;
    hash = (53 * hash) + getTargetPath().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest parseFrom(
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
  public static Builder newBuilder(scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest prototype) {
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
   * Protobuf type {@code scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest)
      scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return scbc.liyongjie.serviceffmpegapi.rpc.FFmpegServiceOuterClass.internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegBuildThumbnailServiceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return scbc.liyongjie.serviceffmpegapi.rpc.FFmpegServiceOuterClass.internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegBuildThumbnailServiceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest.class, scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest.Builder.class);
    }

    // Construct using scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest.newBuilder()
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
      originPath_ = "";

      targetPath_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return scbc.liyongjie.serviceffmpegapi.rpc.FFmpegServiceOuterClass.internal_static_scbc_liyongjie_serviceffmpegapi_rpc_FFmpegBuildThumbnailServiceRequest_descriptor;
    }

    @java.lang.Override
    public scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest getDefaultInstanceForType() {
      return scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest build() {
      scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest buildPartial() {
      scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest result = new scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest(this);
      result.originPath_ = originPath_;
      result.targetPath_ = targetPath_;
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
      if (other instanceof scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest) {
        return mergeFrom((scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest other) {
      if (other == scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest.getDefaultInstance()) return this;
      if (!other.getOriginPath().isEmpty()) {
        originPath_ = other.originPath_;
        onChanged();
      }
      if (!other.getTargetPath().isEmpty()) {
        targetPath_ = other.targetPath_;
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
      scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object originPath_ = "";
    /**
     * <code>string originPath = 1;</code>
     * @return The originPath.
     */
    public java.lang.String getOriginPath() {
      java.lang.Object ref = originPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        originPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string originPath = 1;</code>
     * @return The bytes for originPath.
     */
    public com.google.protobuf.ByteString
        getOriginPathBytes() {
      java.lang.Object ref = originPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        originPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string originPath = 1;</code>
     * @param value The originPath to set.
     * @return This builder for chaining.
     */
    public Builder setOriginPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      originPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string originPath = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOriginPath() {
      
      originPath_ = getDefaultInstance().getOriginPath();
      onChanged();
      return this;
    }
    /**
     * <code>string originPath = 1;</code>
     * @param value The bytes for originPath to set.
     * @return This builder for chaining.
     */
    public Builder setOriginPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      originPath_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object targetPath_ = "";
    /**
     * <code>string targetPath = 2;</code>
     * @return The targetPath.
     */
    public java.lang.String getTargetPath() {
      java.lang.Object ref = targetPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string targetPath = 2;</code>
     * @return The bytes for targetPath.
     */
    public com.google.protobuf.ByteString
        getTargetPathBytes() {
      java.lang.Object ref = targetPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string targetPath = 2;</code>
     * @param value The targetPath to set.
     * @return This builder for chaining.
     */
    public Builder setTargetPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      targetPath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string targetPath = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetPath() {
      
      targetPath_ = getDefaultInstance().getTargetPath();
      onChanged();
      return this;
    }
    /**
     * <code>string targetPath = 2;</code>
     * @param value The bytes for targetPath to set.
     * @return This builder for chaining.
     */
    public Builder setTargetPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      targetPath_ = value;
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


    // @@protoc_insertion_point(builder_scope:scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest)
  }

  // @@protoc_insertion_point(class_scope:scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest)
  private static final scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest();
  }

  public static scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FFmpegBuildThumbnailServiceRequest>
      PARSER = new com.google.protobuf.AbstractParser<FFmpegBuildThumbnailServiceRequest>() {
    @java.lang.Override
    public FFmpegBuildThumbnailServiceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FFmpegBuildThumbnailServiceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FFmpegBuildThumbnailServiceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FFmpegBuildThumbnailServiceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public scbc.liyongjie.serviceffmpegapi.rpc.FFmpegBuildThumbnailServiceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

