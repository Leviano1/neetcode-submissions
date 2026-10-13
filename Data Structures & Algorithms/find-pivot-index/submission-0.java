class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n + 1];
        for(int i = 0; i < n; i++){
            prefixSum[i + 1] = prefixSum[i] + nums[i];
            //[0, 0+3, 3+2, 5+1]
        }
        for(int i = 0; i < n; i++){
            int leftSum = prefixSum[i]; //[0,3,5,6]
            int rightSum = prefixSum[n] - prefixSum[i + 1];
            //[6-3, 6-5, 6-6]
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
}