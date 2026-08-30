class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = t.length();
        int m = s.length();
        int sIndx = 0;
        int tIndx = 0;

        if(n == 0){
            return false;
        }else if(m == 0){
            return true;
        }

        while(tIndx < n && sIndx < m){
            if(s.charAt(sIndx) == t.charAt(tIndx)){
                sIndx++;
                if(sIndx == m){
                    return true;
                }
            }
            tIndx++;
        }
        return false;
    }
}