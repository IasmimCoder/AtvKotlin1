fun <T> ehPalindromo(lista: List<T>): Boolean {
    return lista == lista.reversed()
}

fun main() {
    println(ehPalindromo(listOf(5, 6, 1, 6, 5))) // Deve imprimir: true
    println(ehPalindromo(listOf(1, 2, 3)))       // Deve imprimir: false
}