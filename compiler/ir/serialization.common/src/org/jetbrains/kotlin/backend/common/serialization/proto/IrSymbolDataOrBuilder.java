// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

public interface IrSymbolDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.backend.common.serialization.proto.IrSymbolData)
    org.jetbrains.kotlin.protobuf.MessageLiteOrBuilder {

  /**
   * <code>required int64 symbol_code = 1;</code>
   *
   * <pre>
   * [63..8 - id_sig index | 7..0 - symbol_kind]
   * </pre>
   */
  boolean hasSymbolCode();
  /**
   * <code>required int64 symbol_code = 1;</code>
   *
   * <pre>
   * [63..8 - id_sig index | 7..0 - symbol_kind]
   * </pre>
   */
  long getSymbolCode();
}