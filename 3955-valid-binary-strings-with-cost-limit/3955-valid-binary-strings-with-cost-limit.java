class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> ans=new ArrayList<>();
        vin(n,k,new StringBuilder(),0,ans,0,0);
        return ans;
    }
    public void vin(int n,int k,StringBuilder sb,int f,List<String> ans,int cost,int ind){
        if(sb.length()==n){
            if(cost<=k) ans.add(sb.toString());
            // if(helper(sb,k)) ans.add(sb.toString());
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
    // public boolean helper(StringBuilder sb,int k){
    //     int s=0;
    //     for(int i=0;i<sb.length();i++){
    //         if(sb.charAt(i)=='1') s+=i;
    //     }
    //     return s<=k;
    // } 
}