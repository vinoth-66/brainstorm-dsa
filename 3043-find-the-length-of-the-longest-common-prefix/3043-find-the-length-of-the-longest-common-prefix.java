class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i:arr1){
            vin(i,set1);
        }
        for(int i:arr2){
            vin(i,set2);
        }
        int ans=0;
        for(int el:set1){
            if(set2.contains(el)){
                ans=Math.max(ans,String.valueOf(el).length());
            }
        }
        return ans;
    }
    private void vin(int el,Set<Integer> set){
        String str=String.valueOf(el);
        int num=0;
        for(int i=0;i<str.length();i++){
            num=(num*10)+(str.charAt(i)-'0');
            set.add(num);
        }
    }
}