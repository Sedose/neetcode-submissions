class Solution {
    fun scoreOfString(s: String): Int =
        s.zipWithNext { a, b -> abs(a.code - b.code) }.sum()
}
