package main

fun main(args: Array<String>) {

  // arrayOf(...格納したい要素)で配列を作る
  var data = arrayOf(1, 2, 3)

  // 明示的に型を宣言してみた。 Javaでいうジェネリクスのように表現される
  // Javaの配列と違い、getterやsetter、sizeプロパティ、イテレーターを持っているので、Listのように扱えそう
  var strData: Array<String> = arrayOf("a", "b", "c")

  // プリミティブな配列を作れる。(例だと実体はIntArray。特徴としては、ボクシングが発生しない)
  var numData = intArrayOf(10, 20, 30)

  // 要素がnullの配列を作る
  // Nullable型を明示的に宣言しないといけない
  var data2: Array<String?> = arrayOfNulls(5)

  //Arrayコンストラクタで、動的な配列を生成することができる
  // Array(要素数, {ラムダ式})
  var dynamicData = Array(5, { i -> i * 3 })  // [0, 3, 6, 9, 12]

  // 配列へのアクセスはJavaの配列っぽくも、Listっぽくもできるっぽい
  var data3 = arrayOf(1, 2, 3)
  data3[0] = 99
  data3.set(0, 99)

  // データの取り出しも同じく、Javaの配列っぽくも、Listっぽくもできちゃうみたい
  var num = data3[0]
  num = data3.get(1)


  // forEachメソッドを使えば、ラムダ式で順番に要素を取れる
  var data4 = arrayOf(10, 20, 30, 40, 50)

  // 引数が一つであれば、itが暗黙的に要素を受け取る
  // 以下のforEachメソッドの意味は同じ
  data4.forEach { i -> println(i) }
  data4.forEach { println(it) }

}