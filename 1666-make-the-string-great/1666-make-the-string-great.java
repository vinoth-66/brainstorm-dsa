class Solution {
    public String makeGood(String s) {
        if(s.length()<=1) return s;
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(st.isEmpty()) st.push(c);
            else{
                char ch=st.peek();
                if(Character.isUpperCase(ch)){
                    if(Character.isLowerCase(c)){
                        if(Character.toLowerCase(ch)==Character.toLowerCase(c)){
                            st.pop();
                            continue;
                        }
                        else{
                            st.push(c);
                        }
                    }
                    else{
                        st.push(c);
                    }
                }
                else{
                    if(Character.isUpperCase(c)){
                        if(Character.toUpperCase(ch)==Character.toUpperCase(c)){
                            st.pop();
                            continue;
                        }
                        else{
                            st.push(c);
                        }
                    }
                    else{
                        st.push(c);
                    }
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.empty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}