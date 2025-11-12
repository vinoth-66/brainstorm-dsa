class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length!=arr.length) return false;
        Arrays.sort(target);
        Arrays.sort(arr);
        int l=0,r=0;
        while(l<target.length && r<arr.length){
            if(target[l]==arr[r]){
                r++;
                l++;
            }
            else return false;
        }
        return true;
    }
}