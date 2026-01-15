class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        int n=candyType.length;
        for(int i=0;i<n;i++){
            if(set.size()>=n/2) break;
            set.add(candyType[i]);
        }
        return set.size();
    }
}