class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=0,j=0;
        int l1=nums1.length,l2=nums2.length;
        int ans=0;
        while(i<l1 && j<l2){
            int f=0;
            while(j<l2 && nums1[i]<=nums2[j]){
                if(f==0) f=1;
                j++;
            }
            if(f==1) ans=Math.max(ans,j-i-1);
            if(i==j){
                i++;
                j++;
            }
            else i++;
        }
        return ans;
    }
}