class Solution {
    public int[] rotateElements(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        for(int i:nums){
            if(i>=0) list.add(i);
        }
        if (list.size() == 0) return nums;
        k=k%list.size();
        if(k==0) return nums;
        fun(list,0,k-1);
        fun(list,k,list.size()-1);
        Collections.reverse(list);

        int in=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                nums[i]=list.get(in++);
            }
        }

        return nums;

    }
    private void fun(List<Integer> list,int s,int e){
        while(s<e){
            int t=list.get(s);
            list.set(s,list.get(e));
            list.set(e,t);
            s++;
            e--;
        }
    }
}