class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        Set<String> set=new HashSet<>();
        for(String s: queries){
            set.add(s);
        }
        Set<String> ans=new HashSet<>();
        for(String s:dictionary){
            if(set.contains(s)) ans.add(s);
        }
        for(String s:queries){
            if(ans.contains(s)) continue;
            for(String str:dictionary){
                if(isValid(s,str)) ans.add(s);
            }
        }
        List<String> res=new ArrayList<>();
        for(String s:queries){
            if(ans.contains(s)) res.add(s);
        }
        return res;
    }
    public static boolean isValid(String s1, String s2) {
        if (s1.length()!=s2.length()) return false;
        int diff=0;
        for (int i=0;i<s1.length();i++) {
            if (s1.charAt(i)!=s2.charAt(i)) {
                diff++;
                if (diff>2) return false;
            }
        }
        return true;
    }
}