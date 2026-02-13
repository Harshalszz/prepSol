package ProblemsDay_250;

public class FinalValueVariableAfterPerformingOperations {

    //https://leetcode.com/problems/final-value-of-variable-after-performing-operations/?envType=problem-list-v2&envId=string
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {
            if (op.charAt(1) == '+') x++;
            else x--;
        }
        return x;
    }
    public static void main(String[] args) {

    }
}
