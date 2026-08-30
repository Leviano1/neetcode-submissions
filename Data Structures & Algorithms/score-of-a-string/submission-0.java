class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int value = 0;
        int adjValue = 0;
        int total = 0;
        for(int i = 0; i < n-1; i++){
            value = (int) s.charAt(i);
            adjValue = (int) s.charAt(i+1);

            total += Math.abs(adjValue - value);
        }
        return total;
    }
}