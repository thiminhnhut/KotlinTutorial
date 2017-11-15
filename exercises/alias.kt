fun main(args: Array<String>) {
    var phansoA = PhanSo()
    phansoA.setPhanSo(1, 2)

    var phansoB = PhanSo()
    phansoB.setPhanSo(3, 4)

    phansoA = phansoB
    println("Tu so cua phan so A: " + phansoA.tuSo)

    phansoA.tuSo = 5
    println("Tu so cua phan so B: " + phansoB.tuSo)

    var phansoC = phansoA.copy()
    phansoC.tuSo = 6
    println("Tu so cua phan so C: " + phansoC.tuSo)

    // Thay doi phan so C thi khong anh huong den phan so A, B
    println("Tu so cua phan so A: " + phansoA.tuSo)
    println("Tu so cua phan so B: " + phansoB.tuSo)
}


class PhanSo: Cloneable {
    var tuSo: Int = 1
    var mauSo: Int = 1

    fun setPhanSo(tu: Int, mau: Int) {
        tuSo = tu
        mauSo = mau
    }

    fun copy(): PhanSo {
        var ps: PhanSo = clone() as PhanSo
        return ps
    }
}
