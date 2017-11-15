fun main(args: Array<String>) {
    var tinhTong: TinhTong = TinhTong()

    println("Tinh tong cua 2 so: " + tinhTong.tong(1, 2))
    println("Tinh tong cua 3 so: " + tinhTong.tong(1, 2, 3))

    var parameterList: ParameterList = ParameterList()
    parameterList.printNumber(1)
    parameterList.printNumber(2, 3)
    parameterList.printNumber(4, 5, 6)
}

class TinhTong {
    public fun tong(a: Int, b: Int): Int {
        return a + b
    }

    public fun tong(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
}

class ParameterList {
    public fun printNumber(vararg numbers: Int) {
        for (i in numbers) {
            print("$i ")
        }
        println("\n")
    }
}
