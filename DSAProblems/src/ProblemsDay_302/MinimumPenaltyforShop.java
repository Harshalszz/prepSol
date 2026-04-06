package ProblemsDay_302;

public class MinimumPenaltyforShop {

//https://leetcode.com/problems/minimum-penalty-for-a-shop/?envType=problem-list-v2&envId=string
    public int bestClosingTime(String customers) {
        int n = customers.length();

        int penalty  = 0;
        int minPenalty = 0;
        int earliestHour = 0;

        for(int i = 0; i < customers.length(); i++){
            if(customers.charAt(i) == 'Y'){
                // If customers comes and we already opened the shop then penality decreses.
                penalty--;
            } else{
                // If customers not comes and we already opened the shop then penality increases.
                penalty++;
            }

            // If we found the new minPenality then update the "minPenalty" & "earliestHour".
            if(penalty < minPenalty){
                minPenalty = penalty;
                earliestHour = i + 1;
            }
        }
        return earliestHour;
    }
    public static void main(String[] args) {

    }
}
