package main

fun main(args: List<String>) {
  // val命令にて変数を宣言することによって、定数化ができる
  val author = "cilmeSource"
//	 author = "c11me"  // 再代入できない


  //  ただし、配列などの「内容の書き換え」はできるので注意
  val ary2 = arrayOf("a", "b", "c")
  ary2[0] = "c"
  val list = mutableListOf("d", "e", "f")
  list[0] = "a"

  // もちろん再代入はできない
  val ary = arrayOf(10, 20, 30)
  // ary = arrayOf(40, 50, 60)
}
  // constを付けてval命令をすることで、コンパイル時定数にできる
  // Javaでいる static final的なものだと認識してます
  // ただのvalとの違いは、、、直接定数へアクセスされることくらい？
  // ※順に学びながら書いているので、あえて下に記述してます
  const val str = ""