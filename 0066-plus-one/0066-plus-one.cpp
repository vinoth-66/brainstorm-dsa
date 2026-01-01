class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int c=1;
        int v;
        int f=0;
        for(int i=digits.size()-1;i>=0;i--){
            v=digits[i]+c;
            if(v<=9){
                digits[i]=v;
                f=1;
                break;
            }
            else digits[i]=0;
        }
        if(f==1) return digits;
        digits.insert(digits.begin(),1);
        return digits;
    }
};