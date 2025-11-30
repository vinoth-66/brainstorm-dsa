class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] pse=new int[heights.length];
        int[] nse=new int[heights.length];
        findPse(pse,heights);
        findNse(nse,heights);
        int max=0;
        for(int i=0;i<heights.length;i++){
            max=Math.max(max,(nse[i]-pse[i]-1)*heights[i]);
        }
        return max;
    }

    private void findPse(int[] pse,int[] heights){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
    }

    private void findNse(int[] nse,int[] heights){
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
    }
}