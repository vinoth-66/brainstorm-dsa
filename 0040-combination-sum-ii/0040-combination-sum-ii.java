class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        fun(candidates,0,target,new ArrayList<>(),ans);
        int[][] memo=new int[candidates.length][target+1];
        for(int[] i:memo) Arrays.fill(i,-1);
        return ans;
    }
    private void fun(int[] can,int in,int t,List<Integer> bag,List<List<Integer>> ans){
        if(t<0) return;
        if (t == 0) {
            ans.add(new ArrayList<>(bag));
            return;
        }
        if(in==can.length){
            return;
        }
        // if(memo[in][t]!=-1) return memo[in][t];
        bag.add(can[in]);
        fun(can,in+1,t-can[in],bag,ans);
        bag.remove(bag.size()-1);
        while(in+1<can.length && can[in]==can[in+1]) in++;
        fun(can,in+1,t,bag,ans);
    }
}