fun <T> codificacaoRunLength(lista: List<T>): List<Pair<Int, T>> {
    if (lista.isEmpty()) return emptyList()

    return lista.drop(1).fold(mutableListOf(Pair(1, lista[0]))) { acc: MutableList<Pair<Int, T>>, elemento ->
        val ultimo = acc.last()
        if (elemento == ultimo.second) {
            // Atualiza o último par com contagem incrementada
            acc[acc.lastIndex] = Pair(ultimo.first + 1, ultimo.second)
        } else {
            // Adiciona novo par
            acc.add(Pair(1, elemento))
        }
        acc
    }
}

fun main() {
    val texto = "aaaabccaadeeee".toList()
    val resultado = codificacaoRunLength(texto)
    println(resultado)
}
