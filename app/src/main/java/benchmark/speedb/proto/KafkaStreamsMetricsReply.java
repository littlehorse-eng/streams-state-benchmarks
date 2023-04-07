// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package benchmark.speedb.proto;

/**
 * Protobuf type {@code streamspeedb.KafkaStreamsMetricsReply}
 */
public final class KafkaStreamsMetricsReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:streamspeedb.KafkaStreamsMetricsReply)
    KafkaStreamsMetricsReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KafkaStreamsMetricsReply.newBuilder() to construct.
  private KafkaStreamsMetricsReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KafkaStreamsMetricsReply() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KafkaStreamsMetricsReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KafkaStreamsMetricsReply(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              metrics_ = com.google.protobuf.MapField.newMapField(
                  MetricsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            metrics__ = input.readMessage(
                MetricsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            metrics_.getMutableMap().put(
                metrics__.getKey(), metrics__.getValue());
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
    return benchmark.speedb.proto.Model.internal_static_streamspeedb_KafkaStreamsMetricsReply_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetMetrics();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return benchmark.speedb.proto.Model.internal_static_streamspeedb_KafkaStreamsMetricsReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            benchmark.speedb.proto.KafkaStreamsMetricsReply.class, benchmark.speedb.proto.KafkaStreamsMetricsReply.Builder.class);
  }

  public static final int METRICS_FIELD_NUMBER = 1;
  private static final class MetricsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                benchmark.speedb.proto.Model.internal_static_streamspeedb_KafkaStreamsMetricsReply_MetricsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> metrics_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetMetrics() {
    if (metrics_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          MetricsDefaultEntryHolder.defaultEntry);
    }
    return metrics_;
  }

  public int getMetricsCount() {
    return internalGetMetrics().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; metrics = 1;</code>
   */

  @java.lang.Override
  public boolean containsMetrics(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetMetrics().getMap().containsKey(key);
  }
  /**
   * Use {@link #getMetricsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getMetrics() {
    return getMetricsMap();
  }
  /**
   * <code>map&lt;string, string&gt; metrics = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getMetricsMap() {
    return internalGetMetrics().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; metrics = 1;</code>
   */
  @java.lang.Override

  public java.lang.String getMetricsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetMetrics().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; metrics = 1;</code>
   */
  @java.lang.Override

  public java.lang.String getMetricsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetMetrics().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetMetrics(),
        MetricsDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetMetrics().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      metrics__ = MetricsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, metrics__);
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
    if (!(obj instanceof benchmark.speedb.proto.KafkaStreamsMetricsReply)) {
      return super.equals(obj);
    }
    benchmark.speedb.proto.KafkaStreamsMetricsReply other = (benchmark.speedb.proto.KafkaStreamsMetricsReply) obj;

    if (!internalGetMetrics().equals(
        other.internalGetMetrics())) return false;
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
    if (!internalGetMetrics().getMap().isEmpty()) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMetrics().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static benchmark.speedb.proto.KafkaStreamsMetricsReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static benchmark.speedb.proto.KafkaStreamsMetricsReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static benchmark.speedb.proto.KafkaStreamsMetricsReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static benchmark.speedb.proto.KafkaStreamsMetricsReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static benchmark.speedb.proto.KafkaStreamsMetricsReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static benchmark.speedb.proto.KafkaStreamsMetricsReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static benchmark.speedb.proto.KafkaStreamsMetricsReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static benchmark.speedb.proto.KafkaStreamsMetricsReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static benchmark.speedb.proto.KafkaStreamsMetricsReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static benchmark.speedb.proto.KafkaStreamsMetricsReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static benchmark.speedb.proto.KafkaStreamsMetricsReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static benchmark.speedb.proto.KafkaStreamsMetricsReply parseFrom(
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
  public static Builder newBuilder(benchmark.speedb.proto.KafkaStreamsMetricsReply prototype) {
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
   * Protobuf type {@code streamspeedb.KafkaStreamsMetricsReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:streamspeedb.KafkaStreamsMetricsReply)
      benchmark.speedb.proto.KafkaStreamsMetricsReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return benchmark.speedb.proto.Model.internal_static_streamspeedb_KafkaStreamsMetricsReply_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMetrics();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableMetrics();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return benchmark.speedb.proto.Model.internal_static_streamspeedb_KafkaStreamsMetricsReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              benchmark.speedb.proto.KafkaStreamsMetricsReply.class, benchmark.speedb.proto.KafkaStreamsMetricsReply.Builder.class);
    }

    // Construct using benchmark.speedb.proto.KafkaStreamsMetricsReply.newBuilder()
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
      internalGetMutableMetrics().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return benchmark.speedb.proto.Model.internal_static_streamspeedb_KafkaStreamsMetricsReply_descriptor;
    }

    @java.lang.Override
    public benchmark.speedb.proto.KafkaStreamsMetricsReply getDefaultInstanceForType() {
      return benchmark.speedb.proto.KafkaStreamsMetricsReply.getDefaultInstance();
    }

    @java.lang.Override
    public benchmark.speedb.proto.KafkaStreamsMetricsReply build() {
      benchmark.speedb.proto.KafkaStreamsMetricsReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public benchmark.speedb.proto.KafkaStreamsMetricsReply buildPartial() {
      benchmark.speedb.proto.KafkaStreamsMetricsReply result = new benchmark.speedb.proto.KafkaStreamsMetricsReply(this);
      int from_bitField0_ = bitField0_;
      result.metrics_ = internalGetMetrics();
      result.metrics_.makeImmutable();
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
      if (other instanceof benchmark.speedb.proto.KafkaStreamsMetricsReply) {
        return mergeFrom((benchmark.speedb.proto.KafkaStreamsMetricsReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(benchmark.speedb.proto.KafkaStreamsMetricsReply other) {
      if (other == benchmark.speedb.proto.KafkaStreamsMetricsReply.getDefaultInstance()) return this;
      internalGetMutableMetrics().mergeFrom(
          other.internalGetMetrics());
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
      benchmark.speedb.proto.KafkaStreamsMetricsReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (benchmark.speedb.proto.KafkaStreamsMetricsReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> metrics_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMetrics() {
      if (metrics_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MetricsDefaultEntryHolder.defaultEntry);
      }
      return metrics_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableMetrics() {
      onChanged();;
      if (metrics_ == null) {
        metrics_ = com.google.protobuf.MapField.newMapField(
            MetricsDefaultEntryHolder.defaultEntry);
      }
      if (!metrics_.isMutable()) {
        metrics_ = metrics_.copy();
      }
      return metrics_;
    }

    public int getMetricsCount() {
      return internalGetMetrics().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; metrics = 1;</code>
     */

    @java.lang.Override
    public boolean containsMetrics(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetMetrics().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMetricsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMetrics() {
      return getMetricsMap();
    }
    /**
     * <code>map&lt;string, string&gt; metrics = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getMetricsMap() {
      return internalGetMetrics().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; metrics = 1;</code>
     */
    @java.lang.Override

    public java.lang.String getMetricsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetMetrics().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; metrics = 1;</code>
     */
    @java.lang.Override

    public java.lang.String getMetricsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetMetrics().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearMetrics() {
      internalGetMutableMetrics().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; metrics = 1;</code>
     */

    public Builder removeMetrics(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableMetrics().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableMetrics() {
      return internalGetMutableMetrics().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; metrics = 1;</code>
     */
    public Builder putMetrics(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableMetrics().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; metrics = 1;</code>
     */

    public Builder putAllMetrics(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableMetrics().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:streamspeedb.KafkaStreamsMetricsReply)
  }

  // @@protoc_insertion_point(class_scope:streamspeedb.KafkaStreamsMetricsReply)
  private static final benchmark.speedb.proto.KafkaStreamsMetricsReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new benchmark.speedb.proto.KafkaStreamsMetricsReply();
  }

  public static benchmark.speedb.proto.KafkaStreamsMetricsReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KafkaStreamsMetricsReply>
      PARSER = new com.google.protobuf.AbstractParser<KafkaStreamsMetricsReply>() {
    @java.lang.Override
    public KafkaStreamsMetricsReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KafkaStreamsMetricsReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KafkaStreamsMetricsReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KafkaStreamsMetricsReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public benchmark.speedb.proto.KafkaStreamsMetricsReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

