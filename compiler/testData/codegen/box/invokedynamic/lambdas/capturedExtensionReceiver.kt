// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
// LAMBDAS: INDY

class C(val x: String)

fun C.test() = { x }

fun box() = C("OK").test()()