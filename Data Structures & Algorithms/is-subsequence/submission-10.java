class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = t.length();
        int m = s.length();
        int sIndx = 0;
        int tIndx = 0;

        while(tIndx < n && sIndx < m){
            if(s.charAt(sIndx) == t.charAt(tIndx)){
                sIndx++;
            }
            tIndx++;
        }
        return sIndx == m;
    }
}