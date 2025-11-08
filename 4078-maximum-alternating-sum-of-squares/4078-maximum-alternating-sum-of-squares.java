class Solution {
    public long maxAlternatingSum(int[] nums) {
        int[] abs=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) abs[i]=Math.abs(nums[i]);
            else abs[i]=nums[i];
        }
        Arrays.sort(abs);
        int[] ans=new int[nums.length];
        int s=0,e=nums.length-1;
        int in=0;
        while(s<=e){
            if(in%2==0) ans[in++]=abs[e--];
            else ans[in++]=abs[s++];
        }
        long sum=0;
        for(int i=0;i<ans.length;i++){
            if(i%2==0) sum+=(long)ans[i]*ans[i];
            else sum-=(long)ans[i]*ans[i];
        }
        return sum;
    }
}