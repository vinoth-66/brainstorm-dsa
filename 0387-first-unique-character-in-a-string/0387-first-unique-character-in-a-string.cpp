class Solution {
public:
    int firstUniqChar(string s) {
        vector<int> arr(26);
        for(int i=0;i<s.size();i++){
            arr[s[i]-97]++;
        }
        for(int i=0;i<s.size();i++){
            if(arr[s[i]-97]==1){
                return i;
            }
        }
        return -1;
    }
};