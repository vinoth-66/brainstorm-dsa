class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set=new HashSet<>();
        Arrays.sort(arr);
        int i=0,len=arr.length;
        while(i<len-1){
            int j=i;
            int c=1;
            while(j<len-1 && arr[j]==arr[j+1]){
                c++;
                j++;
            }
            if(set.contains(c)) return false;
            set.add(c);
            i=j+1;
        }
        if(arr[len-2]!=arr[len-1]){
            if(set.contains(1)) return false;
        }
        return true;
    }
}