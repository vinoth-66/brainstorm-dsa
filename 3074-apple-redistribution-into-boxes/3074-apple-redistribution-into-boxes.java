class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        int ans=0;
        int c=0;
        for(int i=capacity.length-1;i>=0;i--){
            c++;
            ans+=capacity[i];
            if(ans>=sum) return c;
        }
        return -1;
    }
}