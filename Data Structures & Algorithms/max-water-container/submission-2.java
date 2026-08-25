class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int maxVolume = 0;

        while(l < r){
            int maxHeight = Math.min(heights[l], heights[r]);
            int volume = maxHeight * (r - l);
            maxVolume = Math.max(maxVolume, volume);

            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxVolume;
    }
}
