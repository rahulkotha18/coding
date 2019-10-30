class Solution {
    fun climbStairs(n: Int): Int {
        var ghgh  = climb_Stairs(0,n)
    println("$ghgh")
    return ghgh
    }
    
    fun climb_Stairs(i : Int, n : Int) : Int {
        if (i > n) {
            return 0
        }
        if (i == n) {
            return 1
        }
        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n)
    }
}