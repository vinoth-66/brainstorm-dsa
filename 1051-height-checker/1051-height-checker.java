class Solution {
    public int heightChecker(int[] heights) {
        int[] arr=Arrays.copyOf(heights,heights.length);
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(heights[i]!=arr[i]) ans++;
        }
        return ans;
    }
}