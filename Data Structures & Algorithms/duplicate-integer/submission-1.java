class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsHash = new HashSet<>();
        for(int num : nums){
            if(!numsHash.contains(num)){
                numsHash.add(num);
            }else{
                return true;
            }  
        }
        return false;
    }
}