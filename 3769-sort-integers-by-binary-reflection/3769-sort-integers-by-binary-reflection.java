class Solution {
    public int[] sortByReflection(int[] nums) {
        StringBuilder sb=new StringBuilder();
        int[][] mat=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            String s=Integer.toBinaryString(nums[i]);
            sb.append(s);
            sb.reverse();
            int val=Integer.parseInt(sb.toString(),2);
            mat[i][0]=val;
            mat[i][1]=nums[i];
            sb.setLength(0);
        }
        Arrays.sort(mat,(a,b)->
        {
            if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
            else return Integer.compare(a[1],b[1]);
        }
        );
        int[] ans=new int[nums.length];
        int in=0;
        for(int[] i:mat){
            ans[in++]=i[1];
        }
        return ans;
    }
}