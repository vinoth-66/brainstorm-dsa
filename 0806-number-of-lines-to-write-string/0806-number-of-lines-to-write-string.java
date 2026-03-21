class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] ans=new int[2];
        int c=0;
        int v=-1;
        int sum=0;
        for(char ch: s.toCharArray()){
            v=widths[ch-'a'];
            if(c+v==100){
                c=0;
                ans[0]++;
                sum=100;
            }
            else if(c+v>100){
                c=v;
                ans[0]++;
                sum=v;
            }
            else{
                c+=v;
                sum=c;
            }
        }
        if(sum<100) ans[0]++;
        ans[1]=sum;
        return ans;
    }
}