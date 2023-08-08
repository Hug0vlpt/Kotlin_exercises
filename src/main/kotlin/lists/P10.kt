package lists

fun encode(tab: List<List<Char>>): List<Pair<Int, Char>> {
    return tab.map { Pair(it.count(), it[0]) }
}