class Solution {
    fun confusingNumber(n: Int): Boolean {
        if (n == 0) return false

        var x = n
        var rotated = 0

        while (x > 0) {
            val d = x % 10
            val m = when (d) {
                0 -> 0
                1 -> 1
                6 -> 9
                8 -> 8
                9 -> 6
                else -> return false // any invalid digit -> not confusing
            }
            rotated = rotated * 10 + m
            x /= 10
        }

        return rotated != n
    }
}