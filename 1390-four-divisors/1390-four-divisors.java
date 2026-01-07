class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<5) continue;
            int sum=fun(nums[i]);
            if(sum!=0) ans+=sum;
        }
        return ans;
    }
    private int fun(int el){
        int c=0;
        int s=0;
        for(int i=1;i*i<=el;i++){
            if(el%i==0){
                if(i*i==el){
                    c+=1;
                    s+=i;
                }
                else{
                    c+=2;
                    s+=i;
                    s+=(el/i);
                }
                
            }
        }
        if(c==4){
            return s;
        }
        return 0;
    }
}