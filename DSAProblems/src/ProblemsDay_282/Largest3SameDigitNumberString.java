package ProblemsDay_282;

public class Largest3SameDigitNumberString {
//https://leetcode.com/problems/largest-3-same-digit-number-in-string/?envType=problem-list-v2&envId=string
    public String largestGoodInteger(String num) {
        String best = "";
        for (int i = 0; i + 2 < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)) {
                best = best.compareTo(num.substring(i, i+3)) > 0 ? best : num.substring(i, i+3);
            }
        }
        return best;
    }

    public static void main(String[] args) {

    }
}
