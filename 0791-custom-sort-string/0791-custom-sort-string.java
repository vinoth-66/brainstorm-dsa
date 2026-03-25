class Solution {
    public String customSortString(String order, String s) {
        StringBuilder ans=new StringBuilder();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:order.toCharArray()){
            if(map.containsKey(c)){
                vin(c,ans,map.get(c));
                map.remove(c);
            }
        }
        for(char c:s.toCharArray()){
            if(map.containsKey(c)) ans.append(c);
        }
        return ans.toString();
    }
    private void vin(char c,StringBuilder ans,int v){
        for(int i=0;i<v;i++){
            ans.append(c);
        }
    }
}