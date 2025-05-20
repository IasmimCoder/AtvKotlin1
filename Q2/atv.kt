fun <T> penultimo(list: List<T>): T {
    if (list.size < 2) {
        throw NoSuchElementException("Tamanho mínimo de 2 elementos na lista")
    }
    return list[list.size - 2]
}

fun main() {
    println(penultimo(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)))
}
