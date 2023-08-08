package lists

fun range(a: Int, b: Int): List<Int> {
    val tabRange: MutableList<Int> = mutableListOf()

    for (i in a .. b) {
        tabRange += i
    }
    return tabRange
}