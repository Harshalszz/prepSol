package ProblemsDay_337;

import java.util.HashSet;

public class CountResiduePrefixes {

//https://leetcode.com/problems/count-residue-prefixes/?envType=problem-list-v2&envId=string
    public int residuePrefixes(String s) {
        HashSet<Character> uniq = new HashSet<>();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            uniq.add(s.charAt(i));
            if (uniq.size() == (i + 1) % 3)
                result++;
            if (uniq.size() > 2)
                break;
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
