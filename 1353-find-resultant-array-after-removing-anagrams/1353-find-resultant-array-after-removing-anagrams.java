class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> ans=new ArrayList<>();
        String prev="";
        for(String s:words){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String str=new String(c);
            if(!str.equals(prev)){
                ans.add(s);
                prev=str;
            }
        }
        return ans;
    }
}