package lists

fun findIfPal(tab: List<Int>): Boolean {
    var i = 0
    var j: Int = tab.count() -1

    while (i<j) {
        if (tab[i] != tab[j]) {
            return false
        }
        i++
        j--
    }
    return true
}