class Solution {
    public int minimumCost(int[] nums) {
        int c=1;
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(c<3) sum+=vin(i,nums);
            else break;
            c++;
        }
        return sum;
    }
    private int vin(int in,int[] nums){
        List<Integer> list=new ArrayList<>();
        for(int i=in;i<nums.length;i++){
            list.add(nums[i]);
        }
        list.sort(Comparator.naturalOrder());
        int ind=0;
        for(int i=in;i<nums.length;i++){
            nums[i]=list.get(ind++);
        }
        int s=list.get(0);
        list.clear();
        return s;
    }
}