class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int max=0;
        int in=-1;
        for(int i=0;i<events.length;i++){
            if(i==0){
                in=events[i][0];
                max=events[i][1];
            }
            else if(events[i][1]-events[i-1][1]>max){
                max=events[i][1]-events[i-1][1];
                in=events[i][0];
            } 
            else if(events[i][1]-events[i-1][1]==max){
                max=events[i][1]-events[i-1][1];
                in=Math.min(in,events[i][0]);
            }
        }
        return in;

    }
}