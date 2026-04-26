package ProblemsDay_319;

public class PermutationDifferencebetweenTwoStrings {

//https://leetcode.com/problems/permutation-difference-between-two-strings/?envType=problem-list-v2&envId=string
    public int findPermutationDifference(String s, String t) {
        if(s.length() != t.length()) return -1;
        int count = 0;

        for(int i=0; i<s.length(); i++){
            int diff = Math.abs(i - t.indexOf(s.charAt(i)));
            count = count + diff;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
