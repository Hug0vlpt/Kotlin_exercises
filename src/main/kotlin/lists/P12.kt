package lists

//using map
fun decode(tab: List<Pair<Int,Char>>): List<Char> {
    val tabDec: List<MutableList<Char>> = tab.map {
        val char = it.second
        MutableList(it.first) { char }
    }

    return tabDec.flatten()
}

//using forEach
/*
fun decode(tab: List<Pair<Int,Char>>): List<Char> {
    val tabDec: MutableList<Char> = mutableListOf()

    tab.forEach {
        val char = it.second
        repeat(it.first) { tabDec += char }
    }
    return tabDec
}
*/