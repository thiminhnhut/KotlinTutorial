fun main(args: Array<String>) {
    var n: Int = 5
    for (i in 1..n) {
        print("$i\t")
    } // 1 2 3 4 5
    println()

    for (i in 1 until n) {
        print("$i\t")
    } // 1 2 3 4
    println()

    var m: Int = 10
    for (i in 1..m step 2) {
        print("$i\t")
    } // 1 3 5 7 9
    println()

    for (i in n downTo 1) {
        print("$i\t")
    } // 5 4 3 2 1
    println()

    for (i in m downTo 1 step 2) {
        print("$i\t")
    } // 10 8 6 4 2
    println()

    var dsNumber: IntArray = intArrayOf(2, 3, 5, 7, 9, 11)
    for (item in dsNumber) {
        print("$item\t")
    } // 2 3 5 7 9 11

    for (item in dsNumber.indices) {
        println("Vi tri thu $item co gia tri: " + dsNumber[item])
    }

    println()
    for ((item, value) in dsNumber.withIndex()) {
        println("Vi tri thu $item co gia tri: $value")
    }
}
