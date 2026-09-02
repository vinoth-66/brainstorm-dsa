class Solution {
    public int countSpecialIntegers(int[] nums) {
        if(nums.length==1) return 1;
        int ans=0;
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(list.get(list.size()-1)!=nums[i]) list.add(nums[i]);
        }
        for(int i:list){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()==1) ans++;
        }
        return ans;
    }
}