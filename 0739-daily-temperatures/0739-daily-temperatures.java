class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int[] ans=new int[temperatures.length];
        // Stack<int[]> st=new Stack<>();
        // for(int i=0;i<temperatures.length;i++){
        //     if(st.isEmpty()) st.push(new int[]{temperatures[i],i});
        //     else{
        //         int[] v=st.peek();
        //         if(v[0]>temperatures[i]){
        //             st.push(new int[]{temperatures[i],i});
        //         }
        //         else{
        //             while(!st.isEmpty() && st.peek()[0]<temperatures[i]){
        //                 ans[st.peek()[1]]=i-st.peek()[1];
        //                 st.pop();
        //             }
        //             st.push(new int[]{temperatures[i],i});
        //         }
        //     }
        // }
        // return ans;

        int[] ans=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                int in=st.pop();
                ans[in]=i-in;
            }
            st.push(i);
        }
        return ans;
    }   
}