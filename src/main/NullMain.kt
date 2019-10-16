package main

fun main(args: Array<String>) {
  // kotlinの場合、デフォルトのままでは変数にnullを入れられない
  // 下記のコードはコメントアウトすると、コンパイルエラーとなる
//	var str:String = ""
//	str = null

  // もしあえてnullを許容した変数が必要な場合、
  // 型の後方に?を付けることで、nullを代入することができる(null許容型またはNullable型)
  var num: Int? = 100

  num = null

  // Any?型なら、nullも含めたどんな型でも入れられちゃう
  var any: Any? = null
  any = "fuga"
  any = 100
  any = false

  // Nullable型のメンバーにアクセスするには、セーフコール演算子(?.)が必要
  var nullableStr:String? = "abcd"
  var nullableStr2:String? = null

  println(nullableStr?.length)  // 4
  // オブジェクトがnullの場合はアクセスしない
  println(nullableStr2?.length)  // null

  // 非Null型へ強制的に変換するには、!!演算子を使う
  // もし非Null型に変換できない場合、NullPointerExceptionが発生してしまう
  println(nullableStr2!!.length)  // ヌルポ
}