class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>();
        for(String str:wordDict){
            set.add(str);
        }
        Boolean[] memo=new Boolean[s.length()+1];
        return vin(0,s,set,memo);
    }
    private boolean vin(int in,String s,HashSet<String> set,Boolean[] memo){
        if(in==s.length()) return true;
        if(in==0 && set.contains(s)) return true;
        if(memo[in]!=null) return memo[in];
        for(int i=in;i<s.length();i++){
            if(set.contains(s.substring(in,i+1))){
                if(vin(i+1,s,set,memo)) return memo[in]=true;
            }
        }
        return memo[in]=false;
    }
}