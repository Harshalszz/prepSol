package ProblemsDay_257;

import java.util.ArrayList;
import java.util.List;

public class BuildanArrayWithStackOperations {

    //https://leetcode.com/problems/build-an-array-with-stack-operations/?envType=problem-list-v2&envId=array
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int targetIndex = 0; // Pointer for target array
        int currentNumber = 1; // Pointer for numbers 1 to n

        while (targetIndex < target.length) {
            if (target[targetIndex] == currentNumber) {
                // If the current number in the target array matches the current number 1 to n
                // Push "Push" operation and move both pointers
                operations.add("Push");
                targetIndex++;
            } else {
                // If the numbers don't match, push "Push" followed by "Pop" operation
                // and only move the current number pointer
                operations.add("Push");
                operations.add("Pop");
            }
            currentNumber++;
        }

        return operations;
    }
    public static void main(String[] args) {

    }
}
