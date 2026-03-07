package ProblemsDay_272;

import java.util.Arrays;

public class SortIntegersTheNumberBits {
//https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/?envType=problem-list-v2&envId=array
    public int[] sortByBits(int[] arr) {
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(temp, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);

            if (countA == countB) {
                return a - b;
            }
            return countA - countB;
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }
    public static void main(String[] args) {

    }
}
