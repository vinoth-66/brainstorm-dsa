import java.util.regex.*;
class Solution {
    public int maxFreqSum(String s) {
        if(s.length()==0) return 0;
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map1=new HashMap<>();
        int m1=0,m2=0;
        Pattern vow=Pattern.compile("[aeiouAEIOU]");
        for(char c:s.toCharArray()){
            String s1=String.valueOf(c);
            Matcher match=vow.matcher(s1); 
            if(match.matches()){
                map.put(c,map.getOrDefault(c,0)+1);
                if(map.get(c)>m1){
                    m1=map.get(c);
                }
            }
            else{
                map1.put(c,map1.getOrDefault(c,0)+1);
                if(map1.get(c)>m2){
                    m2=map1.get(c);
                }
            }
        }
        return m1+m2;
    }
}