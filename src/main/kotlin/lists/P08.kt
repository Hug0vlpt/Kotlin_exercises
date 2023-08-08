package lists

//using for
fun compress(tab: List<Char>): List<Char> {
    val tabC: MutableList<Char> = mutableListOf()

    for (i in 0..<tab.lastIndex) {
        if (tab[i] != tab[i+1]) {
            tabC += tab[i]
        }
    }
    if (tab.last() != tabC.last()) {
        tabC += tab.last()
    }
    return tabC
}