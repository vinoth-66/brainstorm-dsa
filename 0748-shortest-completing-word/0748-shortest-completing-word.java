class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String s=licensePlate.replaceAll("[^a-zA-Z]","");
        Map<Character,Integer> map=new HashMap<>();
        String ans="";
        int len=Integer.MAX_VALUE;
        for(char ch:s.toCharArray()){
            char c=Character.toLowerCase(ch);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        // Arrays.sort(words);
        for(String str:words){
            Map<Character,Integer> m=new HashMap<>();
            for(char ch:str.toCharArray()){
                char c=Character.toLowerCase(ch);
                m.put(c,m.getOrDefault(c,0)+1);
            }
            int f=0;
            for(Map.Entry<Character,Integer> hmap:map.entrySet()){
                if(!m.containsKey(hmap.getKey())){
                    f=1;
                    break;
                }
                int v=hmap.getValue();
                int h=m.get(hmap.getKey());
                if(h<v){
                    f=1;
                    break;
                }
            }
            if(f==0){
                if(str.length()<len){
                    len=str.length();
                    ans=str;
                }
            }
        }
        return ans;
    }
}