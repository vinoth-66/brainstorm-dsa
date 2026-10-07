class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len=nums.length;
        int[] ans=new int[len];
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int in=0;
        while(!map.isEmpty()){
            TreeMap<Integer,Integer> temp=new TreeMap<>();
            for(Map.Entry<Integer,Integer> m:map.entrySet()){
                int key=m.getKey();
                int val=m.getValue();
                ans[in++]=key;
                val-=1;
                if(val>0){
                    temp.put(key,val);
                }
            }
            map.clear();
            map.putAll(temp);
        }
        return ans;
    }
}