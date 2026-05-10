class Solution {
    public int[] concatWithReverse(int[] nums) {
        int len=nums.length;
        int[] ans=new int[len*2];
        int in=0;
        for(int i=0;i<len;i++){
            ans[in++]=nums[i];
        }
        for(int i=len-1;i>=0;i--){
            ans[in++]=nums[i];
        }
        return ans;
    }
}