class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans=new int[spells.length];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            calc(spells[i],potions,ans,success,i);
        }
        return ans;
    }
    private void calc(int mul,int[] potions,int[] ans,long success,int in){
        int s=0,e=potions.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            long product = (long) mul * potions[mid];
            if(product>=success) e=mid-1;
            else s=mid+1;
        }
        ans[in]=potions.length-s;
    }
}