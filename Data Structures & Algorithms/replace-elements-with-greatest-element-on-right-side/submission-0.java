class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            ans[i] = findMax(arr, i+1);
        }
        ans[n-1] = -1;

        return ans;
    }

    public int findMax(int[] arr, int indx){
        int max = 0;
        for(int i = indx; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}