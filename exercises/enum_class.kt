fun main(args: Array<String>) {
    var sv1 = SinhVien()
    sv1.DiemTrungBinh = 8.0
    println(sv1.XepLoaiHocTap())
}

enum class XepLoai {
    XuatSac, Gioi, Kha, TrungBinh, Yeu, Kem
}

class SinhVien {
    var Ma: Int = 0
    var Ten: String = ""
    var DiemTrungBinh: Double = 0.0

    public fun XepLoaiHocTap(): XepLoai {
        if (DiemTrungBinh >= 9) {
            return XepLoai.XuatSac
        }

        if (DiemTrungBinh >= 8) {
            return XepLoai.Gioi
        }

        if (DiemTrungBinh >= 7) {
            return XepLoai.Kha
        }

        if (DiemTrungBinh >= 5) {
            return XepLoai.TrungBinh
        }

        if (DiemTrungBinh >= 3) {
            return XepLoai.Yeu
        }

        return XepLoai.Kem
    }
}
