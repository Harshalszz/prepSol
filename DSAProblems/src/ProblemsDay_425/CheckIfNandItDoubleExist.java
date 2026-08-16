package ProblemsDay_425;

import java.util.HashSet;

public class CheckIfNandItDoubleExist
{
//https://leetcode.com/problems/check-if-n-and-its-double-exist/?envType=problem-list-v2&envId=sorting
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
