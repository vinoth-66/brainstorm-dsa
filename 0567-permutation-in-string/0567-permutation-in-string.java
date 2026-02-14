class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(char c:s1.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        int i=0,j=0;
        while(j<s2.length()){
            if(map1.containsKey(s2.charAt(j))){
                if(map2.containsKey(s2.charAt(j))){
                    while(i<j && map1.containsKey(s2.charAt(j)) && map2.containsKey(s2.charAt(j)) && map2.get(s2.charAt(j))>=map1.get(s2.charAt(j))){
                        map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)-1);
                        if(map2.get(s2.charAt(i))==0) map2.remove(s2.charAt(i));
                        i++;
                    }
                }
                map2.put(s2.charAt(j),map2.getOrDefault(s2.charAt(j),0)+1);
                j++;
                if(map1.equals(map2)) return true;
            }
            else{
                map2.clear();
                j++;
                i=j;
            }
        }
        return false;
    }
}