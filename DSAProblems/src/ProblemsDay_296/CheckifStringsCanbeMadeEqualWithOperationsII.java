package ProblemsDay_296;

public class CheckifStringsCanbeMadeEqualWithOperationsII {
//https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-ii/?envType=problem-list-v2&envId=string

    public boolean checkStrings(String s1, String s2) {
        long eX = 0, oX = 0, eS = 0, oS = 0;

        for (int i = 0; i < s1.length(); i++) {
            int v1 = s1.charAt(i), v2 = s2.charAt(i);
            int dx = v1 ^ v2;
            int ds = v1 * v1 - v2 * v2;

            if ((i & 1) == 1) {
                oX ^= dx;
                oS += ds;
            } else {
                eX ^= dx;
                eS += ds;
            }
        }

        return (eX | oX | eS | oS) == 0;
    }

    public static void main(String[] args) {

    }
}
