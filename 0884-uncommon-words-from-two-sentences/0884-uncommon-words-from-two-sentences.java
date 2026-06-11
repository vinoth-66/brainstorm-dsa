class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] st1=s1.split(" ");
        String[] st2=s2.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(String s:st1) map.put(s,map.getOrDefault(s,0)+1);
        for(String s:st2) map.put(s,map.getOrDefault(s,0)+1);
        List<String> ans=new ArrayList<>();
        for(Map.Entry<String,Integer> m:map.entrySet()){
            if(m.getValue()==1) ans.add(m.getKey());
        }
        String[] res=new String[ans.size()];
        for(int i=0;i<ans.size();i++) res[i]=ans.get(i);
        return res;

    }
}