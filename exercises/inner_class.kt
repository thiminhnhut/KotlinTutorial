fun main(args: Array<String>) {
    val demo = Outer().Inner().foo()
    println(demo)
}

class Outer {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}
