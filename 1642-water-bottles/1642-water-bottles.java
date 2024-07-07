class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink=numBottles;
        int empty=numBottles;
        int temp=0;
        while(numBottles>=numExchange)
        {    temp=numBottles%numExchange; 
             numBottles=numBottles-temp;
            drink+=(numBottles/numExchange);
            numBottles=(numBottles/numExchange)+temp;;
        }
        return drink;
        
    }
}