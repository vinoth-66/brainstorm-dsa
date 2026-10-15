class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int var=9;
        if(sum<1 || sum>var*num) return "";
        StringBuilder sb=new StringBuilder();
        int n=9;
        while(num!=0){
            if(sum<=9){
                sb.append(sum);
                sum-=sum;
                num--;
                continue;
            }
            int rem=sum/n;
            helper(rem,n,sb);
            sum-=(rem*n);
            n--;
            num-=rem;
            // if(sum==0 && num==0) break;
        }
        return sb.toString();
    }
    public void helper(int cnt,int digi,StringBuilder sb){
        for(int i=0;i<cnt;i++){
            sb.append(digi);
        }
    }
}