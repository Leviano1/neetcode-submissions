class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int tmp = target - numbers[i];
            if(!res.containsKey(tmp)){
                res.put(numbers[i], i+1);
            }else{
                return new int[]{res.get(tmp), i+1};
            }  
        }
        return new int[]{};
    }
}
