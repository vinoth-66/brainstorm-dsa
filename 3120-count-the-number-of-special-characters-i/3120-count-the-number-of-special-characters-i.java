class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set=new HashSet<>();
        for(char c:word.toCharArray()){
            set.add(c);
        }
        Set<Character> vis=new HashSet<>();
        int ans=0;
        for(char c:word.toCharArray()){
            char ch=' ';
            if(c>='A' && c<='Z') ch=Character.toLowerCase(c);
            else ch=c;
            if(vis.contains(ch)) continue;
            char up=Character.toUpperCase(ch);
            if(set.contains(ch) && set.contains(up)) ans++;
            vis.add(ch);
        }
        return ans;
    }
}