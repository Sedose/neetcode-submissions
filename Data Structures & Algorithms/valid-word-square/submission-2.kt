class Solution {
    fun validWordSquare(words: List<String>): Boolean =
        words.indices.all { i ->
            words[i].indices.all { j ->
                j < words.size 
                && i < words[j].length 
                && words[j][i] == words[i][j]
            }
        }
}
