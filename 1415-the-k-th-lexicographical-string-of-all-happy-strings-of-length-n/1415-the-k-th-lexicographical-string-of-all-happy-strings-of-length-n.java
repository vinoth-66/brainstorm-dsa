class Solution {
    public String getHappyString(int n, int k) {
        List<String> ans=new ArrayList<>();
        String str="abc";
        vin(n,-1,str,new StringBuilder(),ans);
        if(ans.size()<k) return "";
        return ans.get(k-1);
    }
    private void vin(int n,int in,String str,StringBuilder sb,List<String> ans){
        if(sb.length()==n){
            ans.add(sb.toString());
            return;
        }

        for(int i=0;i<str.length();i++){
            if(i==in) continue;
            sb.append(str.charAt(i));
            vin(n,i,str,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}