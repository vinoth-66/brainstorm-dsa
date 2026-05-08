class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int len=piles.length;
        int s=0,e=len-2;
        int ans=0;
        while(s<e){
            ans+=piles[e];
            e-=2;
            s++;
        }   
        return ans;
    }
}