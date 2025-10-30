class Solution {
public:
    bool detectCapitalUse(string word) {
        int c=0;
        for(int i=word.size()-1;i>=0;i--){
            if(isupper(word[i])) c++;
            
        }
        if(c==word.size()) return true;
        else if(c==0 && word.size()>=1) return true;
        else if(c==1 && isupper(word[0])) return true;
        return false;
    }
};