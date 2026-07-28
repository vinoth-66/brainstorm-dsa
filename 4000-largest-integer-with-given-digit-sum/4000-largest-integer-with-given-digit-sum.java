class Solution {
    int ans=-1;
    public int largestInteger(int n, int s) {
        if(s==0) return s;
        for(int i=n;i>0;i--){
            int num=(int)(Math.pow(10,i));
            int end=(int)(Math.pow(10,i-1));
            num-=1;
            end-=1;
            if(helper(num,end,s)){
                return ans;
            }
        }
        return ans;
    }
    public boolean helper(int num,int end,int t){
        while(num>end){
            int sum=0;
            int val=num;
            while(val!=0){
                sum+=val%10;
                val/=10;
            }
            if(sum==t){
                ans=num;
                return true;
            }
            num-=1;
        }
        return false;
    }
}