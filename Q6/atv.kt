fun Int.ehPrimo(): Boolean {
    if (this < 2) return false
    for (i in 2..kotlin.math.sqrt(this.toDouble()).toInt()) {
        if (this % i == 0) return false
    }
    return true
}

fun main() {
    println(7.ehPrimo())   
    println(10.ehPrimo())  
    println(2.ehPrimo())   
    println(1.ehPrimo())   
}
