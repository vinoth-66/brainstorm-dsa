class Solution {
    public long maxPairStrength(int[] nums) {
        long max=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int val;
                if(nums[i]>nums[j]){
                    val=gcd(nums[i],nums[j]);
                }
                else val=gcd(nums[j],nums[i]);
                max=Math.max(max,((((long)nums[i]*(long)nums[j]))/((long)val*(long)val)));
            }
        }
        return max;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}