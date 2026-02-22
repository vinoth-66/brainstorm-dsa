class Solution {
    public int scoreDifference(int[] nums) {
        int alice=0,bob=0,f=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0 && (i+1)%6==0){
                if(f==0){
                    alice+=nums[i];
                    f=0;
                }
                else{
                    bob+=nums[i];
                    f=1;
                }
            }
            else if(nums[i]%2!=0 || (i+1)%6==0){
                if(f==0){
                    bob+=nums[i];
                    f=1;
                }
                else{
                    alice+=nums[i];
                    f=0;
                }
            }
            
            else if(f==0){
                alice+=nums[i];
            }
            else bob+=nums[i];
        }
        return alice-bob;
    }
}