package ProblemsDay_378;

public class BestPokerHand {

//https://leetcode.com/problems/best-poker-hand/?envType=problem-list-v2&envId=array
    public String bestHand(int[] ranks, char[] suits) {

        char suit = suits[0];
        if (suit == suits[1] && suit == suits[2] && suit == suits[3] && suit == suits[4]) {
            return "Flush";
        }

        int[] count = new int[14];
        boolean pair = false;

        for (int rank : ranks) {
            count[rank]++;

            if (count[rank] >= 3) {
                return "Three of a Kind";
            } else if (count[rank] == 2) {
                pair = true;
            }
        }

        if (pair) {
            return "Pair";
        }

        return "High Card";
    }

    public static void main(String[] args) {

    }
}
