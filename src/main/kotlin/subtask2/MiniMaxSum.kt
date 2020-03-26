package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        val big = input.max()
        val small = input.min()
        val all = input.sum()
        return intArrayOf(all - big!!, all - small!!)
    }
}
