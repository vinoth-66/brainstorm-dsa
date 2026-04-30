class Solution {
    public int[] replaceElements(int[] arr) {
        int len=arr.length;
        int m=-1;
        int[] ans=new int[len];
        ans[len-1]=-1;
        for(int i=len-2;i>=0;i--){
            m=Math.max(m,arr[i+1]);
            ans[i]=m;
        }
        return ans;
    }
}