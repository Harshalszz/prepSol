package ProblemsDay_309;

public class MinimumAmountTimeCollectGarbage {

//https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/?envType=problem-list-v2&envId=string
    public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;

        // Step 1: total pickup time
        int total = 0;
        for (String g : garbage) {
            total += g.length();
        }

        // Step 2: prefix travel time
        int[] prefix = new int[n];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + travel[i - 1];
        }

        // Step 3: add necessary travel for each garbage type
        int travelTime = 0;
        for (char type : new char[]{'M', 'P', 'G'}) {
            for (int i = n - 1; i >= 0; i--) {
                if (garbage[i].indexOf(type) != -1) {
                    travelTime += prefix[i];
                    break;
                }
            }
        }

        return total + travelTime;
    }

    public static void main(String[] args) {

    }
}
