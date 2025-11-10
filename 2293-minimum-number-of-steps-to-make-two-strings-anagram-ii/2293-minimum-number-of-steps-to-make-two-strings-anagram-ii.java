class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        int c=0;
        for(Map.Entry<Character,Integer> m:map2.entrySet()){
            if(!map.containsKey(m.getKey())) c+=m.getValue();
            else if(map.get(m.getKey())!=m.getValue()) c+=Math.abs(map.get(m.getKey())-m.getValue());
        }
        for(Map.Entry<Character,Integer> m:map.entrySet()){
            if(!map2.containsKey(m.getKey())) c+=m.getValue();
        }
        return c;
    }
}