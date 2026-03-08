class Solution {
    public int smallestBalancedIndex(int[] nums) {
        long[] s=new long[nums.length];
        s[0]=0;
        for(int i=1;i<nums.length;i++){
            s[i]=s[i-1]+nums[i-1];
        }
        long p=1;
        int in=-1;
        for(int i=nums.length-1;i>=0;i--){
            if(s[i]==p){
                in=i;
            }
            if(p>s[i]) break;
            p*=nums[i];
        }
        return in;
    }
}