package main

fun main(srgs:Array<String>){

  var i:Int = 600
  var j:Int = i
  // 非null型→Nullable型への代入は可能
  var nullableInt:Int? = i

  // 同じ値だし、参照先も同じ
  println(i == j)
  println(i === j)

  // 同じ値だが、基本型→Nullable型へ代入時にボクシング発生するため、
  // 参照先は別になる(別のオブジェクトになる)
  println(i == nullableInt)
  println(i === nullableInt)  // false


  // Nullable型→非Null型への代入は不可
  // nullが入る可能性があるため
  // i = nullableInt
}