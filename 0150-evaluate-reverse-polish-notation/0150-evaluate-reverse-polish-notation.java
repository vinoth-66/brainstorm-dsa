class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s:tokens){
            if(s.equals("+") || s.equals("/") || s.equals("*") || s.equals("-")){
                int v1=st.pop();
                int v2=st.pop();
                if(s.equals("+")){
                    st.push(v1+v2);
                }
                else if(s.equals("-")){
                    st.push(v2-v1);
                }
                else if(s.equals("/")){
                    st.push(v2/v1);
                }
                else if(s.equals("*")){
                    st.push(v1*v2);
                }
            }
            else{
                int n=Integer.valueOf(s);
                st.push(n);
            }
        }
        return st.peek();
    }
}