class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int s=target-num;
            if(map.containsKey(s)){
                arr[0]=map.get(s);
                arr[1]=i;
                break;
            }
            map.put(num,i);
        }
        return arr;
    }
}