class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>();
        for(String i:wordDict) set.add(i);
        List<String> ans=new ArrayList<>();
        vin(0,s,new ArrayList<>(),ans,set);
        return ans;
    }
    private void vin(int in,String s,List<String> temp,
    List<String> ans,HashSet<String> set){
        if(in==s.length()){
            ans.add(String.join(" ",temp));
            return;
        }
        for(int i=in;i<s.length();i++){
            String str=s.substring(in,i+1);
            if(set.contains(str)){
                temp.add(str);
                vin(i+1,s,temp,ans,set);
                temp.remove(temp.size()-1);
            }
        }
    }
}