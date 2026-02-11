package ProblemsDay_248;

public class ReplaceAlltoAvoidConsecutiveRepeatingCharacters {
//https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/?envType=problem-list-v2&envId=string
    public String modifyString(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == '?') {
                char left = (i > 0) ? arr[i - 1] : ' ';
                char right = (i + 1 < n) ? arr[i + 1] : ' ';

                if (left != 'a' && right != 'a') arr[i] = 'a';
                else if (left != 'b' && right != 'b') arr[i] = 'b';
                else arr[i] = 'c';
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {

    }
}
