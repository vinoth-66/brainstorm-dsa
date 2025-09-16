class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<responses.size();i++){
            List<String> str=responses.get(i);
            HashSet<String> set=new HashSet<>(str);
            for(String s:set){
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        String ans="";
        int max=0;
        for(Map.Entry<String,Integer> m:map.entrySet()){
            if(m.getValue()>max || (m.getValue() == max && m.getKey().compareTo(ans) < 0)){
                ans=m.getKey();
                max=m.getValue();
            }
        }
        return ans;
    }
}