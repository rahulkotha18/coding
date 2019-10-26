class Solution {
    public int numJewelsInStones(String J, String S) {
        int ans = 0;

        for(int i = 0; i < S.length(); i++){
            for(int j = 0; j < J.length(); j++){
                if(J.indexOf(S.charAt(i)) != -1){
                    ans++;
                    break;
                }
            }
        }

        return ans;
    }
}