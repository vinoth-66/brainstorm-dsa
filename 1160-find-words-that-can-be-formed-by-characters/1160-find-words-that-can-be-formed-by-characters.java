class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] arr=new int[26];
        for(char c:chars.toCharArray()) arr[c-'a']++;
        int ans=0;
        for(String s:words){
            int f=0;
            int[] check=Arrays.copyOf(arr,arr.length);
            for(char c:s.toCharArray()){
                if(check[c-'a']>0) check[c-'a']--;
                else{
                    f=1;
                    break;
                } 
            }
            if(f!=1) ans+=s.length();
        }
        return ans;
    }
}