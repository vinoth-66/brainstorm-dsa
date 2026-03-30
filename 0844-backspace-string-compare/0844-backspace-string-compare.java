class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }
            else st1.push(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }
            else st2.push(t.charAt(i));
        }
        if(st1.isEmpty() && st2.isEmpty()) return true;
        if(st1.size()!=st2.size()) return false;
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        int size=st1.size();
        for(int i=0;i<size;i++){
            sb1.append(st1.pop());
            sb2.append(st2.pop());
        }
        return sb1.toString().equals(sb2.toString());
    }
}