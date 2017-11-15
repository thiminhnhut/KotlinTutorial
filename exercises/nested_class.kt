fun main(args : Array<String>) {
    val demo = Outer.Nested().foo()
    println(demo)
}

/**
 * Nested class (ben trong Outer class) khong the truy xuat duoc cac data member cua Outer class (class ben ngoai cua Nested class)
 */
class Outer {
    private val bar : Int = 1
    class Nested {
        fun foo() = 123
    }
}
