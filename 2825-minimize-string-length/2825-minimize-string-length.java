class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> set=new HashSet<>();
        int ans=0;
        for(char c:s.toCharArray()){
            set.add(c);
        }
        return set.size();
    }
}