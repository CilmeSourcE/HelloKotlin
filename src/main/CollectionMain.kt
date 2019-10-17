package main

fun main(args: Array<String>) {

  // Listの生成
  var list = listOf("a", "b", "c")
  println(list)  // [a, b, c]

  // Setの生成
  var set = setOf("A", "B", "B", "C")
  println(set)

  // Mapの生成
  var map = mapOf("First" to 1, "Second" to 2, "Third" to 3)
  println(map)

}