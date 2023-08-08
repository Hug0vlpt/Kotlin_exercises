package lists

// using map
fun flatten(tab: List<Any>): List<Int> {
    val tabFlat: List<Int> = tab.map {
        if (it is Int) {
            listOf(it)
        } else {
            flatten(it as List<Int>)
        }
    }.flatten()
    return tabFlat
}

// using for
/*
fun flatten(tab: List<Any>): List<Int> {
    val tabFlat: MutableList<Int> = mutableListOf()

    for (i in tab.indices) {
        if (tab[i] is Int) {
            tabFlat.add(tab[i] as Int)
        } else {
            tabFlat += flatten(tab[i] as List<Int>)
        }
    }
    return tabFlat
}
 */