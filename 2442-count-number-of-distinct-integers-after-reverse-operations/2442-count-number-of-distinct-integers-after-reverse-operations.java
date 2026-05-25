class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
            set.add(rev(i));
        }
        return set.size();
    }
    private int rev(int el){
        int rev=0;
        while(el!=0){
            rev=((rev*10)+el%10);
            el/=10;
        }
        return rev;
    }
}