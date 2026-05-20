class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        int[] ans=new int[A.length];
        int c=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==B[i]) c++;
            if(set1.contains(B[i])) c++;
            if(set2.contains(A[i])) c++;
            set1.add(A[i]);
            set2.add(B[i]);
            ans[i]=c;
        }
        return ans;
    }
}