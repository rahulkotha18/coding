class Solution {
    public int numDecodings(String ss) {
        char[] s = ss.toCharArray();
        int len = s.length;
        if (len == 1 && s[0] != '0')
            return 1;
        if (s[0] == '0')
            return 0;
        int[] dp = new int[len];
        dp[0] = 1;
        if (s[1] == '0') {
            if (s[0] == '1' || s[0] == '2')
                dp[1] = 1;
            else
                dp[1] = 0;
        } else {
            if (s[0] == '1' || s[0] == '2' && s[1] <= '6')
                dp[1] = 2;
            else
                dp[1] = 1;
        }
        for (int i = 2; i < len; i++) {
            if (s[i] == '0') {
                if (s[i-1] == '0' || s[i-1] >= '3')
                    return 0;
                else if (s[i-1] == '1' || s[i-1] == '2')
                    dp[i] = dp[i-2];
            } else {
                if (s[i-1] == '1' || s[i-1] == '2' && s[i] <= '6')
                    dp[i] = dp[i-1] + dp[i-2];
                else
                    dp[i] = dp[i - 1];
            }
        }
        return dp[len-1];
    }
}