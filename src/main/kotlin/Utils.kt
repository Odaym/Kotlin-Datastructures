infix fun String.example(block: () -> Unit) {
    println("\n\n\n\n---Example of $this---\n")
    println("OUTPUT:")
    block()
    println("\n\n")
}