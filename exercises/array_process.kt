import java.util.*
fun main(args: Array<String>) {
    var Mang: IntArray = IntArray(10)

    var rd = Random()
    for (i in Mang.indices) {
        Mang[i] = rd.nextInt(100)
    }

    println("Mang sau khi da nhap va duyet theo tung gia tri")
    for (i in Mang) {
        print("$i\t")
    }
    println()

    println("Mang sau khi da nhap va duyet theo tung vi tri")
    for (i in Mang.indices) {
        print("${Mang[i]}\t")
    }
    println()

    println("So phan tu cua mang: ${Mang.size}")
    println("So lon nhat trong mang: ${Mang.max()}")
    println("So lon nhat trong mang: ${Mang.min()}")
    println("Tong cac phan tu trong mang: ${Mang.sum()}")
    println("Trung binh cong cua cac phan tu trong mang: ${Mang.average()}")

    println("Sap xep mang theo thu tu tang dan: ")
    Mang.sort()
    for (i in Mang) {
        print("$i\t")
    }
    println()

    println("Sap xep mang theo thu tu giam dan: ")
    Mang.sortDescending()
    for (i in Mang) {
        print("$i\t")
    }
    println()

    println("Dao nguoc cac phan tu trong mang: ")
    Mang.reverse()
    for (i in Mang) {
        print("$i\t")
    }
    println()

    println("Loc cac phan tu la so chan trong mang")
    var dsChan = Mang.filter{x->x%2 == 0}
    for (i in dsChan) {
        print("$i\t")
    }
    println()

    println("Loc cac phan tu la so le trong mang")
    var dsLe = Mang.filter{x->x%2 == 1}
    for (i in dsLe) {
        print("$i\t")
    }
    println()

    println("Loc cac phan tu thoa dieu kien cho truoc")
    var dsLocTheoDieuKien = Mang.filter{x->x > 50}
    for (i in dsLocTheoDieuKien) {
        print("$i\t")
    }
    println()

    println("Kiem tra mot phan tu co thuoc mang hay khong: " + Mang.contains(12))
    println("Dem so phan tu la so chan trong mang: ${Mang.count {x->x%2 == 0}}")
    println("Dem so phan tu la so le trong mang: ${Mang.count {x->x%2 == 1}}")
}
