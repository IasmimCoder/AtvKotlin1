fun <T> last(list: List<T>): T {
     return list.last()
}

fun main() {
    println(last(listOf(1, 1, 2, 3, 5, 8)))
}