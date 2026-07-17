class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int prod = 1;
        int countZero = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                prod *= nums[i];
            }else{
                countZero ++;
            }
        }
        if(countZero > 1){
            return new int[nums.length];
            //an array of all zeros;
        }
        for(int i = 0; i < n; i++){
            if(countZero > 0){
                res[i] = (nums[i] == 0) ? prod : 0;
                //If nums[i] is equal to 0, store prod in res[i];
                //otherwise store 0;
            }else{
                res[i] = prod / nums[i];
            }
            
        }
        return res;
    }
}  
