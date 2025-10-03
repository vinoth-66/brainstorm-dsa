class Solution {
public:
    int maxBottlesDrunk(int numBottles, int numExchange) {
        int c=0;
        int sum=numBottles;
        int varry=numBottles;
        int sub=numExchange;
        while(varry-sub>=0){
            c++;
            varry-=sub;
            sub++;
            varry++;
        }
        sum+=c;
        return sum;
    }
};