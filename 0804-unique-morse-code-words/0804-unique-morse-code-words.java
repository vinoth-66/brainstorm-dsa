class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] str={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet<>();
        for(String s:words){
            StringBuilder con=new StringBuilder();
            for(char c:s.toCharArray()){
                con.append(str[c-'a']);
            }
            set.add(con.toString());
        }
        return set.size();

        
    }
}