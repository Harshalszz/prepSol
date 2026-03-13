package ProblemsDay_278;

public class MinimumNumberOperationsConvertTime {
//https://leetcode.com/problems/minimum-number-of-operations-to-convert-time/?envType=problem-list-v2&envId=string
    public int convertTime(String current, String correct) {
        int count = 0;
        int diff = toMinutes(correct) - toMinutes(current);

        while (diff > 0) {

            if (diff >= 60) {
                diff -= 60;
            } else if (diff >= 15) {
                diff -= 15;
            } else if (diff >= 5) {
                diff -= 5;
            } else if (diff >= 1) {
                diff -= 1;
            }

            count++;
        }
        return count;
    }

    private int toMinutes(String time) {
        int minutes = 0;

        if (time.charAt(0) == 0) {
            minutes += time.charAt(1) * 60;
        } else {
            minutes += ((time.charAt(0) * 10) + time.charAt(1)) * 60;
        }

        if (time.charAt(3) == 0) {
            minutes += time.charAt(4);
        } else {
            minutes += (time.charAt(3) * 10) + time.charAt(4);
        }

        return minutes;
    }

    public static void main(String[] args) {

    }
}
