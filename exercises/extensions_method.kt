import java.util.*

fun main(args: Array<String>) {
    var t: Int = 5.Cong(9)
    println("t = $t")

    var a: Int = 7
    if (a.isPrime()) {
        println("$a la so nguyen to")
    } else {
        println("$a khong la so nguyen to")
    }

    var ns = Calendar.getInstance()
    ns.set(Calendar.YEAR, 1995)
    ns.set(Calendar.MONTH, 2)
    ns.set(Calendar.DAY_OF_MONTH, 15)

    var sinhvien: SinhVien = SinhVien()
    sinhvien.NamSinh = ns.time

    println("Tuoi sinh vien: " + sinhvien.Tuoi())
}

fun Int.Cong(a: Int): Int {
    return this + a
}

fun Int.isPrime(): Boolean {
    var dem: Int = 0
    for (i in 1..this) {
        if (this % i == 0) {
            dem++
        }
    }
    return dem == 2
}

class SinhVien {
    private var ma: Int = 0
    private var ten: String? = null
    private var namSinh: Date? = null

    public var Ma: Int
    get() {
        return ma
    }
    set(value) {
        ma = value
    }

    public var Ten: String?
    get() {
        return ten
    }
    set(value) {
        ten = value
    }

    public var NamSinh: Date?
    get() {
        return namSinh
    }
    set(value) {
        namSinh = value
    }

    constructor()

    constructor(ma: Int, ten: String?, namSinh: Date?) {
        this.ma = ma
        this.ten = ten
        this.namSinh = namSinh
    }
}

fun SinhVien.Tuoi(): Int {
    var cal = Calendar.getInstance()
    var yearNow: Int = cal.get(Calendar.YEAR)

    cal.time = this.NamSinh
    var yearOld: Int = cal.get(Calendar.YEAR)

    return yearNow - yearOld
}
