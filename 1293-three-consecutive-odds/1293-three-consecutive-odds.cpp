class Solution {
public:
    bool threeConsecutiveOdds(vector<int>& arr) {
        int c=0;
        for(int i:arr){
            if(i%2!=0){
                c++;
                if(c==3) return true;
            }
            else{
                c=0;
            }
        }
        return false;
    }
};