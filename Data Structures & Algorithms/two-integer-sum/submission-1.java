class Solution {
    //brute force;
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; nums.length > i; i++){
            for(int y = i + 1; nums.length > y; y++){
                if(nums[i] + nums[y] == target){
                    return new int[]{i, y};
                }
            }
        }
        return new int[0];
    }
}
