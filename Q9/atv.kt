interface Tree<out T>

data class Node<out T>(
    val value: T,
    val left: Tree<T> = End,
    val right: Tree<T> = End
) : Tree<T> {
    override fun toString(): String {
        val children = if (left == End && right == End) "" else " $left $right"
        return "N($value$children)"
    }
}

val End = object : Tree<Nothing> {
    override fun toString() = "."
}

fun <T> height(root: Tree<T>): Int = when (root) {
    End -> 0
    is Node -> 1 + maxOf(height(root.left), height(root.right))
    else -> 0
}

fun main() {
    val tree = Node(10,
        Node(20,
            Node(40,
                Node(70),
                Node(80)
            ),
            Node(50)
        ),
        Node(30,
            Node(60,
                End,
                Node(90)
            ),
            Node(100)
        )
    )
    println("Tree: $tree")
    println("Height of the tree: ${height(tree)}")  // Output: 4
}
