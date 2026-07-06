package ProblemsDay_384;

public class MaximumNumberOperationsMoveOnesEnd {

//https://leetcode.com/problems/maximum-number-of-operations-to-move-ones-to-the-end/?envType=problem-list-v2&envId=string
    public int maxOperations(String s) {
        int result = 0;

        int ones = 0;

        boolean use = false;

        for (char c : s.toCharArray()) {
            if (c == '0') {
                use = true;
            } else {
                if (use) {
                    result += ones;
                }

                ones++;
                use = false;
            }
        }

        if (use) {
            result += ones;
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
