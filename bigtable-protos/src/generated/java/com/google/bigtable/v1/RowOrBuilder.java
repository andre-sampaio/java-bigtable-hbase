// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v1/bigtable_data.proto

package com.google.bigtable.v1;

public interface RowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v1.Row)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bytes key = 1;</code>
   *
   * <pre>
   * The unique key which identifies this row within its table. This is the same
   * key that's used to identify the row in, for example, a MutateRowRequest.
   * May contain any non-empty byte string up to 16KiB in length.
   * </pre>
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <code>repeated .google.bigtable.v1.Family families = 2;</code>
   *
   * <pre>
   * May be empty, but only if the entire row is empty.
   * The mutual ordering of column families is not specified.
   * </pre>
   */
  java.util.List<com.google.bigtable.v1.Family> 
      getFamiliesList();
  /**
   * <code>repeated .google.bigtable.v1.Family families = 2;</code>
   *
   * <pre>
   * May be empty, but only if the entire row is empty.
   * The mutual ordering of column families is not specified.
   * </pre>
   */
  com.google.bigtable.v1.Family getFamilies(int index);
  /**
   * <code>repeated .google.bigtable.v1.Family families = 2;</code>
   *
   * <pre>
   * May be empty, but only if the entire row is empty.
   * The mutual ordering of column families is not specified.
   * </pre>
   */
  int getFamiliesCount();
  /**
   * <code>repeated .google.bigtable.v1.Family families = 2;</code>
   *
   * <pre>
   * May be empty, but only if the entire row is empty.
   * The mutual ordering of column families is not specified.
   * </pre>
   */
  java.util.List<? extends com.google.bigtable.v1.FamilyOrBuilder> 
      getFamiliesOrBuilderList();
  /**
   * <code>repeated .google.bigtable.v1.Family families = 2;</code>
   *
   * <pre>
   * May be empty, but only if the entire row is empty.
   * The mutual ordering of column families is not specified.
   * </pre>
   */
  com.google.bigtable.v1.FamilyOrBuilder getFamiliesOrBuilder(
      int index);
}
