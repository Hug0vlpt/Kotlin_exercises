package lists

//using forEach
fun lengthFreqSort(tab: List<List<Char>>): List<List<Char>> {
    val mapFreq = LinkedHashMap<Int, Int>()
    var freq = 0
    var nbElem: Int = tab[0].count()

    tab.forEach {
        if (it.count() == nbElem) {
            freq++
        } else {
            mapFreq[nbElem] = freq
            freq = 1
            nbElem = it.count()
        }
    }
    mapFreq[nbElem] = freq

    return tab.sortedBy { mapFreq[it.count()] }
}

// using for
/*
fun lengthFreqSort(tab: List<List<Char>>): List<List<Char>> {
    val mapFreq = LinkedHashMap<Int, Int>()
    var freq = 1
    var nbElem: Int = tab[0].count()

    for (i in 1 .. tab.lastIndex) {
        if (tab[i].count() == nbElem) {
            freq++
        } else {
            //the frequency of the previous map is stored in the map
            mapFreq[nbElem] = freq
            freq = 1
            nbElem = tab[i].count()
        }
    }
    mapFreq[nbElem] = freq

    return tab.sortedBy { mapFreq[it.count()] }
}
 */