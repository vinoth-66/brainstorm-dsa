class Solution {
    public String getHappyString(int n, int k) {
        List<String> ans=new ArrayList<>();
        String str="abc";
        vin(n,-1,str,"",ans);
        if(ans.size()<k) return "";
        return ans.get(k-1);
    }
    private void vin(int n,int in,String str,String s,List<String> ans){
        if(s.length()==n){
            ans.add(s);
            return;
        }

        for(int i=0;i<str.length();i++){
            if(i==in) continue;
            vin(n,i,str,s+str.charAt(i),ans);
        }
    }
}