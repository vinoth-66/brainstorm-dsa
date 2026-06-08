class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> ans=new ArrayList<>();
        vin(n,k,new StringBuilder(),0,ans,0,0);
        return ans;
    }
    public void vin(int n,int k,StringBuilder sb,int f,List<String> ans,int cost,int ind){
        if(cost>k) return;
        if(sb.length()==n){
            if(cost<=k) ans.add(sb.toString());
            return;
        }
        if(f!=1){
            sb.append("1");
            vin(n,k,sb,1,ans,cost+ind,ind+1);
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append("0");
        vin(n,k,sb,0,ans,cost,ind+1);
        sb.deleteCharAt(sb.length()-1);
    }
}