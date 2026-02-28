class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int[] ans=new int[2];
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int p=0,c=0,in=0;
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(c<2 && p!=m.getValue()){
                p=m.getValue();
                c++;
                ans[in++]=m.getKey();
                if(c==2){
                    return ans;
                }
            }
        }
        return new int[]{-1,-1};
    }
}