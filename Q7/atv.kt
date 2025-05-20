fun mdc(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val resto = x % y
        x = y
        y = resto
    }
    return x
}

fun main() {
    println(mdc(36, 63))  
    println(mdc(48, 18)) 
}
