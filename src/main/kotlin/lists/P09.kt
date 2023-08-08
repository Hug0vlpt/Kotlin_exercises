package lists

fun pack(tab: List<Char>): List<List<Char>> {
    val tabPack: MutableList<List<Char>> = mutableListOf()
    var border = 0

    for (i in 0 .. tab.lastIndex) {
        if (i != tab.lastIndex) {
            if (tab[i] != tab[i+1]) {
                tabPack += tab.slice(border..i)
                border = i + 1
            }
        } else if (i == tab.lastIndex) {
            tabPack += tab.slice(border..i)
        }
    }
    return tabPack
}