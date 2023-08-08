package lists

fun lengthSort(tab: List<List<Char>>): List<List<Char>> {
    return tab.sortedBy { it.count() }
}