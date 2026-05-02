package ProblemsDay_325;

public class ConstructSmallestNumberFromDIString {
//https://leetcode.com/problems/construct-smallest-number-from-di-string/?envType=problem-list-v2&envId=string

    public String smallestNumber(String pattern) {
        int n = pattern.length();
        StringBuilder result = new StringBuilder();
        int[] stack = new int[n + 1];
        int index = 0;

        for (int i = 0; i <= n; i++) {
            stack[index++] = i + 1;

            if (i == n || pattern.charAt(i) == 'I') {
                while (index > 0) {
                    result.append(stack[--index]);
                }
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {

    }
}
