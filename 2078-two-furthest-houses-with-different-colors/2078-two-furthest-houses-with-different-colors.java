class Solution {
    public int maxDistance(int[] colors) {
        int i=0,j=0,ans=0;
        int len=colors.length;
        while(i<len){
            j=i+1;
            int ind=-1;
            while(j<len){
                if(colors[i]!=colors[j]){
                    if(ind==-1) ind=j;
                    ans=Math.max(ans,j-i);
                    if(j==len) return ans;
                }
                j++;
            }
            if(ind!=-1) i=ind;
            else i++;
        }
        return ans;
    }
}