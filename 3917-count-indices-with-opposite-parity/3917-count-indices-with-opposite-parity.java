class Solution {
    public int[] countOppositeParity(int[] nums) {
        int e=0,o=0;
        int l=nums.length;
        int[] ans=new int[l];
        for(int i=l-1;i>=0;i--){
            if(nums[i]%2==0){
                ans[i]=o;
                e++;
            }
            else{
                ans[i]=e;
                o++;
            }
        }
        return ans;
    }
}