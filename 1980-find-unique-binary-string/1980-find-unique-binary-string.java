class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashMap<String,Integer> set=new HashMap<>();
        vin(nums.length,"",set);
        for(int i=0;i<nums.length;i++){
            set.remove(nums[i]);  
        }
        for(Map.Entry<String,Integer> m:set.entrySet()){
            return m.getKey();
        }
        return "";
    }
    private void vin(int l,String str,HashMap<String,Integer> set){
        if(str.length()==l){
            set.put(str,1);
            return;
        }
        vin(l,str+"1",set);
        if(l>0) vin(l,str+"0",set);
    }
}