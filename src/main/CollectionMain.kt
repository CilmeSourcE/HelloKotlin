package main

fun main(args: Array<String>) {

  //=====================
  // List, Set, Mapは読み取り専用である
  //=====================

  // Listの生成
  var list = listOf("a", "b", "c")
  // Setの生成
  var set = setOf("A", "B", "B", "C")

  // Mapの生成
  // mapOf(キー to 値, ...)
  var map = mapOf("First" to 1, "Second" to 2, "Third" to 3)

  //======================
  // 変更可能なCollectionを生成するには、
  // mutableXxxxOf関数を使う
  //======================

  var mutableList = mutableListOf(100, 500, 1000)
  mutableList[0] = 0
  mutableList.set(0, 20)

  //===========================
  // mutableでないCollectionは読み取り専用だが、
  // 不変オブジェクトではない
  //============================
  var data = mutableListOf(1, 2, 3)
  var data2: List<Int> = data

  println(data2) // [1, ,2, 3]

  data[0] = 99
  // mutableListを代入した場合、
  // 参照先で内容が変わってるため、data2の内容も変わってしまう
  println(data2) // [99, 2, 3]


}