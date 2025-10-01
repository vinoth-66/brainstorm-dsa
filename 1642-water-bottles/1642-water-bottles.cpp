class Solution {
public:
    int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        int change=numBottles;
        while(change>=numExchange){
            int v=change/numExchange;
            sum+=v;
            change=(change%numExchange) + v;
        }
        return sum;
    }
};