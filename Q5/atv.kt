fun <T> decodificaRunLength(listaCodificada: List<Pair<Int, T>>): List<T> {
    val resultado = mutableListOf<T>()

    for ((quantidade, elemento) in listaCodificada) {
        repeat(quantidade) {
            resultado.add(elemento)
        }
    }

    return resultado
}

fun main() {
    val listaCodificada = listOf(
        Pair(4, 'a'), 
        Pair(1, 'b'), 
        Pair(2, 'c'), 
        Pair(2, 'a'), 
        Pair(1, 'd'), 
        Pair(4, 'e')
    )
    
    val listaDecodificada = decodificaRunLength(listaCodificada)
    println(listaDecodificada)
}
