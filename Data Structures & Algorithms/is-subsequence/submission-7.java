class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }else if(t.length() == 0){
            return false;
        }
        int n = t.length();
        int indx = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(indx < s.length()){
                if(s.charAt(indx) == t.charAt(i)){
                    count++;
                    indx++;
                }
            }
        }
        if(count == s.length()){
            return true;
        }
        return false;
    }
}