class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        StringBuilder sb=new StringBuilder(jewels);
        int ans=0;
        for(char c: stones.toCharArray()){
            if(sb.indexOf(String.valueOf(c))!=-1) ans++;
        }
        return ans;
    }
}