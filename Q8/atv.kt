fun Int.ehPrimo(): Boolean {
    if (this < 2) return false
    for (i in 2..kotlin.math.sqrt(this.toDouble()).toInt()) {
        if (this % i == 0) return false
    }
    return true
}

fun listaPrimosNoIntervalo(intervalo: IntRange): List<Int> {
    return intervalo.filter { it.ehPrimo() }
}

fun main() {
    val primos = listaPrimosNoIntervalo(7..31)
    println(primos)  
}
