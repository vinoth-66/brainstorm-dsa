class Solution {
    public long maxProduct(int[] nums) {
        long ans=1;
        Arrays.sort(nums);
        int c=0;
        if(nums[0]<0 && nums[nums.length-1]<0) c=-1;
        else if(nums[0]>0 && nums[nums.length-1]>0) c=1;
        else c=0;
        if(c==1) ans=pos(ans,nums);
        else if(c==0) ans=both(ans,nums);
        else ans=neg(ans,nums);
        return ans;
    }
    private long pos(long ans,int[] nums){
        int n=nums.length-1;
        for(int i=0;i<2;i++){
            ans*=(long)nums[n--];
        }
        ans*=100000;
        return ans;
    }
    private long neg(long ans,int[] nums){
        for(int i=0;i<2;i++){
            ans*=(long)nums[i];
        }
        ans*=100000;
        return ans;
    }
    private long both(long ans,int[] nums){
        int s=0,e=nums.length-1;
        int c=0;
        for(int i=0;i<2;i++){
            if(Math.abs(nums[s])>nums[e]){
                ans*=(long)nums[s];
                c++;
                s++;
            }
            else{
                ans*=(long)nums[e];
                e--;
            }
        }
        if(c%2==0) ans*=100000;
        else ans*=-100000;
        return ans;
    }
}