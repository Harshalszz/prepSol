package ProblemsDay_273;

public class TheNumberFullRoundsYouHavePlayed {

//https://leetcode.com/problems/the-number-of-full-rounds-you-have-played/?envType=problem-list-v2&envId=string
    public int numberOfRounds(String loginTime, String logoutTime) {
        String[] arr1 = loginTime.split(":");
        String[] arr2 = logoutTime.split(":");

        int time1 = Integer.parseInt(arr1[0])*60 + Integer.parseInt(arr1[1]);
        int time2 = Integer.parseInt(arr2[0])*60 + Integer.parseInt(arr2[1]);

        if(time1 > time2) time2 = time2 + 24*60;
        if(time1%15 != 0) time1 = time1 + 15-time1%15;

        return (time2 - time1)/15;
    }
    public static void main(String[] args) {

    }
}
