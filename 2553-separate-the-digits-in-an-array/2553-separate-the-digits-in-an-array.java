class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for(int i:nums){
            vin(ans,i);
        }
        int l=ans.size();
        int[] res=new int[l];
        for(int i=0;i<l;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
    private void vin(List<Integer> ans,int val){
        List<Integer> inner=new ArrayList<>();
        while(val!=0){
            inner.add(val%10);
            val/=10;
        }
        Collections.reverse(inner);
        ans.addAll(inner);
    }
}