class Solution {
    public boolean uniformArray(int[] nums1) {
        int even=0;
        int odd=0;
        int in1=-1;
        int in2=-1;
        int[] pre=new int[nums1.length];
        int[] suf=new int[nums1.length];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                even++;
                if(in1==-1) in1=i;
                if(min!=Integer.MAX_VALUE) pre[i]=min;
            }
            else{
                if(nums1[i]<min) min=nums1[i];
                odd++;
                if(in2==-1) in2=i;
            }
        }
        if(even==nums1.length) return true;
        else if(odd==nums1.length) return true;
        int min2=Integer.MAX_VALUE;
        for(int i=nums1.length-1;i>=0;i--){
            if(nums1[i]%2==0){
                if(min2!=Integer.MAX_VALUE) suf[i]=min2;
            }
            else{
                if(nums1[i]<min2) min2=nums1[i];
            }
        }
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                if((pre[i]!=0 && pre[i]<nums1[i]) || (suf[i]!=0 && suf[i]<nums1[i])) continue;
                else return false;
            }
        }
        return true;
    }
}