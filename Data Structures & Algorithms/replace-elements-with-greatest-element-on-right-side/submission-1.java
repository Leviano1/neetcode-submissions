class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int rightMax = -1; //value of the last position

        for(int i = n - 1; i >= 0; i--){
            ans[i] = rightMax;
            rightMax = Math.max(rightMax, arr[i]);
        }
        ans[n-1] = -1;
        return ans;
    }
}