class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int f=0,l=0,flag=0;
        for(int i=0;i<nums.length;i++){
            if(prime(nums[i])){
                if(flag==0){
                    f=i;
                    flag=1;
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