class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] ans=new int[10];
        while(n>0){
            ans[n%10]++;
            n/=10;
        }
        int min=Integer.MAX_VALUE;
        int res=10;
        for(int i=0;i<ans.length;i++){
            if(ans[i]!=0 && min>ans[i]){
                min=ans[i];
                res=i;
            }
        }
        return res;
    }
}