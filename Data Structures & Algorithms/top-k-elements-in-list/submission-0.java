class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        int[] arr = new int[k];
        for(int j = 0; j < k; j++){
            int maxKey = 0;
            int maxValue = Integer.MIN_VALUE;
            //smallest possible integer;

            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                //entrySet() - all the key value pairs in the map;
                //For every key-value pair in the map, 
                //store that pair in a variable named entry
                if (entry.getValue() > maxValue) {
                    maxValue = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

            arr[j] = maxKey;
            count.remove(maxKey);
        }
        return arr;
    }
}
