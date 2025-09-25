class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int f=-1,l=-1;
        for(int i=0;i<nums.length;i++){
            if(prime(nums[i])){
                if(f==-1){
                    f=i;
                }
                l=i;
            } 
        }
        if(f==-1) return 0;
        return l-f;
    }
    private boolean prime(int ele){
        if(ele<2) return false;
        if(ele==2) return true;
        for(int i=2;i*i<=ele;i++){
            if(ele%i==0) return false;
        }
        return true;
    }
}