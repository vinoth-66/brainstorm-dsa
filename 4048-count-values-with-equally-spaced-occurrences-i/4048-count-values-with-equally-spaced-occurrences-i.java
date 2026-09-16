class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,int[]> map=new HashMap<>();
        Set<Integer> invalid = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            if(invalid.contains(key)){
                continue;
            }
            if(!map.containsKey(key)){
                map.put(key,new int[]{1,i,0});
            }
            else{
                int[] data=map.get(key);
                if(data[0]==3){
                    map.remove(key);
                    invalid.add(key);
                }
                else if(data[0]==1){
                    data[0]++;
                    int diff=i-data[1];
                    data[2]=diff;
                    data[1]=i;
                }
                else{
                    data[0]++;
                    int diff=i-data[1];
                    if(diff==data[2]) data[1]=i;
                    else{
                        map.remove(key);
                        invalid.add(key);
                    }
                }
            }
        }
        int ans=0;
        for (int[] data:map.values()) {
            if (data[0]==3) {
                ans++;
            }
        }
        return ans;
    }
}