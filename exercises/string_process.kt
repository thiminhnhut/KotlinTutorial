// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/
fun main(args: Array<String>) {
    var s: String = "Hello world"

    println("Do dai cua chuoi: " + s.length) // Do dai 11
    println("Vi tri dau tien cua ky tu l: " + s.indexOf("l")) // Vi tri 2
    println("Vi tri cuoi cung cua ky tu l: " + s.lastIndexOf("l")) // Vi tri 9
    println("Kiem tra world thuoc chuoi s hay khong: " + s.contains("world")) // true
    println("Trich xuat chuoi con: " + s.substring(6)) // world
    println("Trich xuat chuoi con: " + s.substring(1, 5)) // ello
    println("Thay the chuoi: " + s.replace("Hello", "Hi")) // Hi world
    println("Thay the chuoi: " + s.replaceFirst("l", "L")) // HeLlo world

    var s2: String = "      Hello world     "
    println("Xoa bo khoang trang ben trai: " + s2.trimStart()) // "Hello world     "
    println("Xoa bo khoang trang ben phai: " + s2.trimEnd()) // "      Hello world"
    println("Xoa bo khoang trang ca 2 ben: " + s2.trim()) // "Hello world"

    println("So sanh chuoi: " + s.compareTo("Hello world")) // 0
    println("So sanh chuoi: " + s.compareTo("hello world", ignoreCase = true)) // 0

    println("Noi chuoi: " + s.plus("!")) // Hello world!
    println("Tach chuoi: " + s.split(" ")) // [Hello, world]
    println("Tach chuoi: " + s.split("")) // [H, e, l, l, o, , w, o, r, l, d]

    println("Chuyen doi thanh chuoi IN HOA: " + s.toUpperCase()) // HELLO WORLD
    println("Chuyen doi thanh chuoi thuong: " + s.toLowerCase()) // hello world
}
