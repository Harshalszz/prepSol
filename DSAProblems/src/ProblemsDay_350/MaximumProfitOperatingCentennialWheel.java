package ProblemsDay_350;

public class MaximumProfitOperatingCentennialWheel {

//https://leetcode.com/problems/maximum-profit-of-operating-a-centennial-wheel/?envType=problem-list-v2&envId=array
    public int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        if(4 * boardingCost < runningCost){
            return -1;
        }
        int sum = 0;
        int mp = Integer.MIN_VALUE;
        int p = -1;
        int res = -1;
        for(int i = 0; i < customers.length; i++){
            sum += customers[i];
            int curr = Math.min(4, sum);
            sum -= curr;
            p += curr * boardingCost - runningCost;
            if(p > 0 && p > mp){
                mp = p;
                res = i + 1;
            }
        }
        int m = sum % 4;
        int rem = sum / 4;
        if(sum * boardingCost - (rem * runningCost) > 0){
            res = customers.length + rem;

        }
        if(m > 0 && m * boardingCost - runningCost > 0){
            res = res == -1 ? 1 : res + 1;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
