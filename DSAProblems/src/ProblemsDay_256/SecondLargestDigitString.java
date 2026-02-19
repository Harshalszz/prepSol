package ProblemsDay_256;

public class SecondLargestDigitString {
//https://leetcode.com/problems/second-largest-digit-in-a-string/?envType=problem-list-v2&envId=string

    public int secondHighest(String s) {
        int count = 1;
        for (char c = '9'; c >= '0'; c--) {
            if (s.indexOf(c) != -1) {
                if (count-- <= 0) {
                    return c - '0';
                }
            }
        }
        return -1;
    }
        public static void main(String[] args) {

    }
}
