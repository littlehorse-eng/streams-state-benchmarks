// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package benchmark.speedb.proto;

public interface WorkflowMetricsQueryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:streamspeedb.WorkflowMetricsQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp latest_window_start = 1;</code>
   * @return Whether the latestWindowStart field is set.
   */
  boolean hasLatestWindowStart();
  /**
   * <code>.google.protobuf.Timestamp latest_window_start = 1;</code>
   * @return The latestWindowStart.
   */
  com.google.protobuf.Timestamp getLatestWindowStart();
  /**
   * <code>.google.protobuf.Timestamp latest_window_start = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLatestWindowStartOrBuilder();

  /**
   * <code>int32 num_windows = 2;</code>
   * @return The numWindows.
   */
  int getNumWindows();
}
