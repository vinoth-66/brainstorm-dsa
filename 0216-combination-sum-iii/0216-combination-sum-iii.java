class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        int[] arr=new int[9];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        fun(0,k,n,arr,ans,new ArrayList<>());
        return ans;
    }
    private void fun(int in,int len,int t,int[] arr,List<List<Integer>> ans,List<Integer> temp){
        if(t==0){
            if(temp.size()==len){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if(temp.size()==len) return;
        if(in==arr.length) return;
        temp.add(arr[in]); 
        fun(in+1,len,t-arr[in],arr,ans,temp); 
        temp.remove(temp.size()-1);
        fun(in+1,len,t,arr,ans,temp);
    }
}