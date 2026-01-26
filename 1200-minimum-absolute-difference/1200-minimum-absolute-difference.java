class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        List<Integer> list=new ArrayList<>();
        int prev=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])<prev){
                prev=Math.abs(arr[i]-arr[i+1]);
            }
        }
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])==prev){
                list.add(arr[i]);
                list.add(arr[i+1]);
                ans.add(new ArrayList<>(list));
                list.clear();
            }
        }
        return ans;
    }
}