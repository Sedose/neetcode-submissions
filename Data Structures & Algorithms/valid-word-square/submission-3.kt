class Solution {
    fun validWordSquare(words: List<String>): Boolean =
        words.indices.all { i ->
            words[i].indices.all { j ->
                val c1 = words[i][j]
                val c2 = words.getOrNull(j)?.getOrNull(i) ?: return false
                c2 == c1
            }
        }
}