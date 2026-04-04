package ProblemsDay_300;

public class LargestPalindromicNumber {

//https://leetcode.com/problems/largest-palindromic-number/?envType=problem-list-v2&envId=string
    public String largestPalindromic(String num) {
        int[] arr = new int[10]; // frequency array
        int maxSingle = -1;     // middle digit
        StringBuilder bignum = new StringBuilder();


        // Step 1: Count frequency of digits
        for (int i = 0; i < num.length(); i++) {
            if (Character.isDigit(num.charAt(i))) {
                int n = num.charAt(i)-'0';
                arr[n]++;
            }
        }

        // Step 2: Build left half from 9 to 0
        for (int i = 9; i >= 0; i--) {
            while (arr[i] >= 1) {

                //Track largest single digit for middle
                if (arr[i] == 1) {
                    maxSingle = Math.max(i, maxSingle);
                    arr[i] -= 1;

                } else {

                    // Avoid edge cases
                    if (i == 0 && bignum.length() == 0) {
                        if (maxSingle != -1)
                            break; //leading zeros like 0009

                        return "0"; //all are zeros
                    }
                    bignum.append(i);
                    arr[i] -= 2;
                }
            }

        }

        // Step 4: Build final answer
        String left = bignum.toString();
        String right = new StringBuilder(left).reverse().toString();

        if (maxSingle >= 0) {
            return left + maxSingle + right;
        } else {
            return left + right;
        }

    }
    public static void main(String[] args) {

    }
}
