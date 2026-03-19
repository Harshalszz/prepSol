package ProblemsDay_284;

public class CheckNumberHasEqualDigitCountandDigitValue {

    //https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/?envType=problem-list-v2&envId=string
    public boolean digitCount(String num) {
        int[] hash = new int[10];

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            hash[digit] += 1;
        }

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            if (digit == hash[i])
                continue;
            return false;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
