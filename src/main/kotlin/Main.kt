import lists.findLast
import lists.findLBO
import lists.findAmountEl
import lists.findIfPal
import lists.flatten
import lists.compress
import lists.pack
import lists.encode
import lists.encodeM
import lists.decode
import lists.duplicate
import lists.range
import lists.lengthSort
import lists.lengthFreqSort

fun main(){
    val tab = listOf(1,1,2,3,5,8)
    val tab2 = listOf(1,2,3,2,1)

    //P01
    val lastNum: Int = findLast(tab)
    println("P01: The last number of $tab is $lastNum.")

    //P02
    val lastButOne: Int = findLBO(tab)
    println("P02: The last but one number of $tab is $lastButOne.")

    //P04
    val amountElem: Int = findAmountEl(tab)
    println("P04: the list $tab has $amountElem elements.")

    //P06
    var isPal: Boolean = findIfPal(tab)
    println("P06: the list $tab is a palindrome? It's $isPal.")
    isPal = findIfPal(tab2)
    println("P06: the list $tab2 is palindrome? It's $isPal.")

    //P07
    val tabP07: List<Any> = listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8)))
    val tabFlat: List<Int> = flatten(tabP07)
    println("P07: the flatten list of $tabP07 is $tabFlat.")

    //P08
    val tabP08: List<Char> = "aaaabccaadeeee".toList()
    val tabComp: List<Char> = compress(tabP08)
    println("P08: the compression of $tabP08 is $tabComp")

    //P09
    val tabP09: List<Char> = "aaaabccaadeeee".toList()
    val tabPack: List<List<Char>> = pack(tabP09)
    println("P09: the package of $tabP09 is $tabPack.")

    //P10
    val tabP10: List<List<Char>> = tabPack
    val tabEnc: List<Pair<Int,Char>> = encode(tabP10)
    println("P10: The encoding of $tabP10 is $tabEnc.")

    //P11
    val tabP11: List<List<Char>> = tabPack
    val tabEncM: List<Any> = encodeM(tabP11)
    println("P11: The modified encoding of $tabP11 is $tabEncM.")

    //P12
    val tabP12: List<Pair<Int,Char>> = listOf(Pair(4, 'a'), Pair(1, 'b'), Pair(2, 'c'), Pair(2, 'a'), Pair(1, 'd'), Pair(4, 'e'))
    val tabDec: List<Char> = decode(tabP12)
    println("P12: The decode version of $tabP12 is $tabDec.")

    //P14
    val tabP14: List<Char> = "abccd".toList()
    val tabDup: List<Char> = duplicate(tabP14)
    println("P14: The duplicate version of $tabP14 is $tabDup.")

    //P22
    val a = 4
    val b = 9
    val tabRange: List<Int> = range(a,b)
    println("P22: The integers from $a to $b are $tabRange.")

    //P28
    //val tabP28: List<List<Char>> = listOf("abc".toList(), "ijkl".toList(), "mnop".toList(), "o".toList())
    val tabP28: List<List<Char>> = listOf("abc".toList(), "de".toList(), "fgh".toList(), "de".toList(), "ijkl".toList(), "mn".toList(), "o".toList())
    //P28A
    val tabLengthS: List<List<Char>> = lengthSort(tabP28)
    println("P28A: The sort of $tabP28 according to the length of its sublists is $tabLengthS.")
    //P28B
    val tabFreqS: List<List<Char>> = lengthFreqSort(tabLengthS)
    println("P28B: The sort of $tabP28 according to the length frequency of its sublists is $tabFreqS.")
}