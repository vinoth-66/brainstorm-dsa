class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        Map<Character,Integer> map=new HashMap<>();
        int l=0,r=0,maxLen=0;
        while(r<len){
            char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(s.charAt(r))>1){
                if(map.get(s.charAt(l))==1) map.remove(s.charAt(l));
                else map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
            maxLen=Math.max(maxLen,map.size());
            r++;
        }
        return maxLen;
    }
}