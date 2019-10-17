package main

fun main(args: Array<String>) {

  // いろんな型 (Javaとだいたい似たような感じ)

  var flg: Boolean = true

  var bi: Byte = 10
  var short: Short = 100
  var int: Int = 1000
  var long: Long = 10000

  // Floatは明示的にF入れないとコンパイルエラーになる
  var float: Float = 10.1F
  var double: Double = 100.1

  var char: Char = 'a'
  var str: String = "abc"

  // 宣言した型と異なる型の値は入れられない
  //下記のコードはコメントアウトするとコンパイルエラーとなる
  // str = 100

  // 明示的な型変換
  var a: Long = int.toLong()

  // 型を省略して入れることも可能(型推論)
  var mozi = "もじ"  // 文字列ならString型へ変換
  var num = 100  // 整数ならInt型へ変換
  var doubleNum = 20.0  // 小数点のある数値ならDouble型へ変換


  // Any型なら、どんな型でも入れられちゃう
  var any: Any = 100
  any = "hoge"
  any = 100.1F
  // でも、nullは無理
  //any = null
}