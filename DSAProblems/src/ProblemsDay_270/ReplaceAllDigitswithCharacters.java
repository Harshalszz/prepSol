package ProblemsDay_270;

public class ReplaceAllDigitswithCharacters {

    //https://leetcode.com/problems/replace-all-digits-with-characters/?envType=problem-list-v2&envId=string
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 1; i < n; i += 2) {
            arr[i] = (char) (arr[i - 1] + (arr[i] - '0'));
        }
        return new String(arr);
    }

    public static void main(String[] args) {

    }
}
