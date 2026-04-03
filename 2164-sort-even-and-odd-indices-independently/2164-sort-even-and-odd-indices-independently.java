class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0) even.add(nums[i]);
            else odd.add(nums[i]);
        }
        int[] ans=new int[nums.length];
        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());
        int in1=0,in2=0;
        for(int i=0;i<nums.length;i+=2){
            if(in1<even.size()){
                ans[i]=even.get(in1);
                in1++;
            }
            if(in2<odd.size()){
                ans[i+1]=odd.get(in2);
                in2++;
            }
        }
        return ans;
    }
}