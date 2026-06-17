package ProblemsDay_369;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CountDistinctNumbersBoard {

//https://leetcode.com/problems/count-distinct-numbers-on-board/?envType=problem-list-v2&envId=array
    public int distinctIntegers(int n) {
        Set<Integer> board = new HashSet<>();
        board.add(n);

        int size = board.size();
        while (true) {
            for (int i = 1; i < n; i++) {
                for (int x : new ArrayList<>(board)) {
                    if (x % i == 1) board.add(i);
                }
            }
            if (size == board.size()) break;
            size = board.size();
        }

        return size;
    }

    public static void main(String[] args) {

    }
}
