class Solution {
    public int numSteps(String s) {
        StringBuilder sb=new StringBuilder(s);
        int ans=0;
        while(!(sb.length()==1 && sb.charAt(0)=='1')){
            ans++;
            if(sb.charAt(sb.length()-1)=='0') sb.deleteCharAt(sb.length()-1);
            else{
                sb=helper(sb);
            }
        }
        return ans;
    }
    private StringBuilder helper(StringBuilder sb){
        int c=1;
        int i=sb.length()-1;
        while(i>=0 && c==1){
            if(sb.charAt(i)=='1'){
                sb.setCharAt(i,'0');
            }
            else if(sb.charAt(i)=='0'){
                sb.setCharAt(i,'1');
                c=0;
            }
            i--;
        }
        if(c==1){
            sb.insert(0,'1');
        }
        return sb;
    }
}