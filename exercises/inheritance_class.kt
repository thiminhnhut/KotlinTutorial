fun main(args: Array<String>) {
    var an = NhanVienChinhThuc()
    var binh = NhanVienThoiVu()

    var luongAn = an.tinhLuong(20)
    println("Luong cua An: " + luongAn)

    var luongBinh = binh.tinhLuong(3)
    println("Luong cua Binh: " + luongBinh)

    var child = Child()
    child.bar()
    child.foo()
}


abstract class NhanVien {
    protected var ma: Int = 0
    protected var ten: String = ""
    public abstract fun tinhLuong(ngayCong: Int): Double
}

class NhanVienChinhThuc: NhanVien() {
    override fun tinhLuong(ngayCong: Int): Double {
        if (ngayCong >= 22) {
            return 10000000.0
        } else {
            return 10000000.0 - 500000*(22 - ngayCong)
        }
    }
}

class NhanVienThoiVu: NhanVien() {
    override fun tinhLuong(ngayCong: Int): Double {
        return 150000.0 * ngayCong
    }
}

interface MyInterface {
    fun foo() {
        println("MyInterface")
    }
    fun bar()
}

class Child : MyInterface {
    override fun bar() {
        println("Child inheritance MyInterface")
    }
}
