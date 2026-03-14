package ProblemsDay_279;

public class RemoveDigitFromNumberMaximizeResult {

    //https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/?envType=problem-list-v2&envId=string
    public String removeDigit(String number, char digit) {
        String maxResult = "";

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String candidate = number.substring(0, i) + number.substring(i + 1);

                if (candidate.compareTo(maxResult) > 0) {
                    maxResult = candidate;
                }
            }
        }

        return maxResult;
    }

    public static void main(String[] args) {

    }
}
