package lists

//using map like P12
fun duplicate(tab: List<Char>): List<Char> {
    val tabDup: List<MutableList<Char>> = tab.map {
        val char = it
        MutableList(2) { char }
    }

    return tabDup.flatten()
}