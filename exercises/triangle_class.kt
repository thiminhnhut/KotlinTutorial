fun main(args: Array<String>) {
    var tg1: TamGiac = TamGiac(3.0, 4.0, 5.0)
    println(tg1)
    println("Chu vi tam giac 1: " + tg1.chuVi())
    println("Dien tich tam giac 1: " + tg1.dienTich())

    var tg2: TamGiac = TamGiac()
    tg2.A = 4.0
    tg2.B = 5.0
    tg2.C = 3.0
    println(tg2)
    println("Chu vi tam giac 2: " + tg2.chuVi())
    println("Dien tich tam giac 2: " + tg2.dienTich())
}

class TamGiac {
    private var a: Double = 0.0
    private var b: Double = 0.0
    private var c: Double = 0.0

    public var A: Double
    get() {
        return a
    }
    set(value) {
        a = value
    }

    public var B: Double
    get() {
        return b
    }
    set(value) {
        b = value
    }

    public var C: Double
    get() {
        return c
    }
    set(value) {
        c = value
    }

    constructor()
    constructor(a: Double, b: Double, c: Double) {
        this.a = a
        this.b = b
        this.c = c
    }

    override fun toString(): String {
        return "Canh A = $a - Canh B = $b - Canh C = $c"
    }

    public fun chuVi(): Double {
        return a + b + c
    }

    private fun nuaChuVi(): Double {
        return chuVi()/2.0
    }

    public fun dienTich(): Double {
        var p: Double = nuaChuVi()
        return Math.sqrt(p*(p-a)*(p-b)*(p-c))
    }
}
