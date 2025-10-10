class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int ans=0;
        int found=0;
        for(Map.Entry<Character,Integer> m:map.entrySet()){
            ans+=m.getValue()/2 * 2;
            if(m.getValue()%2==1) found=1; 
        }
        if(found==1) ans+=1;
        return ans;
    }
}