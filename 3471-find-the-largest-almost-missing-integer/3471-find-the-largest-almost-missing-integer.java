class Solution {
    public int largestInteger(int[] nums, int k) {
        int s=nums.length;
        if(s<k) return -1;
        else if(nums[0]==nums[s-1] && s==2 && k==2) return nums[0];      
        if(k==1){
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<s;i++) map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            int maxi=-1;
            for(Map.Entry<Integer,Integer> m:map.entrySet()){
                if(m.getValue()==1) maxi=Math.max(maxi,m.getKey());
            }
            return maxi;
        }
        else if(k==s){
            int maxi=-1;
            for(int i=0;i<s;i++) maxi=Math.max(maxi,nums[i]);
            return maxi;
        }
        int c1=0,c2=0;
        int e1=nums[0],e2=nums[s-1];
        for(int i:nums){
            if(i==e1) c1++;
            else if(i==e2) c2++;
        }
        if((e1==e2) || (c2>=2 && c1>=2)) return -1;
        else if(c2>=2) return e1;
        else if(c1>=2) return e2;
        else if(c1==1 && c2==1) return Math.max(e1,e2);
        return -1;
    }
}