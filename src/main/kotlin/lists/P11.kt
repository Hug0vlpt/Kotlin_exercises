package lists

//using map
fun encodeM(tab: List<List<Char>>): List<Any> {
    val tabEncM: List<Any> = tab.map{
        if (it.count() == 1) {
            it[0]
        } else {
            Pair(it.count(), it[0])
        }
    }
    return tabEncM
}