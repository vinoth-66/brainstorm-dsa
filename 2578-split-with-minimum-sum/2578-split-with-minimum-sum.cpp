class Solution {
public:
    int splitNum(int num) {
        string str=to_string(num);
        vector<int> arr(str.size());
        for(int i=0;i<str.size();i++){
            arr[i]=str[i]-'0';
        }
        sort(arr.begin(),arr.end());
        int n1=0;
        int n2=0;
        for(int i=0;i<arr.size();i++){
            if(i%2==0){
                n1=n1*10+arr[i];
            }
            else n2=n2*10+arr[i];
        }
        return n1+n2;
    }
    
};