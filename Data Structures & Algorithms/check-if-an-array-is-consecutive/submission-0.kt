import java.util.BitSet

class Solution {
    fun isConsecutive(nums: IntArray): Boolean {
        val minimum = nums.min()
        val maximum = nums.max()

        if (maximum - minimum != nums.size - 1) {
            return false
        }

        val seen = BitSet(nums.size)

        for (number in nums) {
            val index = number - minimum

            if (seen.get(index)) {
                return false
            }

            seen.set(index)
        }

        return true
    }
}