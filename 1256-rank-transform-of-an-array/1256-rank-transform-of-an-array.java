class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] pos=Arrays.copyOf(arr,arr.length);
        Arrays.sort(pos);
        HashMap<Integer,Integer> map=new HashMap<>();
        int in=1;
        for(int n:pos){
            if(!map.containsKey(n)){
                map.put(n,in++);
            }
        }
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}