class Solution {
public:
    int maximumPrimeDifference(vector<int>& nums) {
        int f=-1,l=-1;
        for(int i=0;i<nums.size();i++){
            if(prime(nums[i])){
                f=i;
                break;
            } 
        }
        for(int i=nums.size()-1;i>=0;i--){
            if(prime(nums[i])){
                l=i;
                break;
            } 
        }
        if(f==-1) return 0;
        return l-f;
    }
private:
    bool prime(int ele){
        if(ele<2) return false;
        if(ele==2 || ele==3) return true;
        if(ele%2==0) return false;
        for(int i=3;i*i<=ele;i++){
            if(ele%i==0) return false;
        }
        return true;
    }
};