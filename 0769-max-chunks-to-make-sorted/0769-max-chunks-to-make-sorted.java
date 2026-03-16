class Solution {
    public int maxChunksToSorted(int[] arr) {
        int m=-1;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            m=Math.max(arr[i],m);
            if(m==i){
                ans++;
            }
        }
        return ans;
    }
}