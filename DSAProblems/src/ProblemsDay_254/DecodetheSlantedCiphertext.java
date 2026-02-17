package ProblemsDay_254;

public class DecodetheSlantedCiphertext {


    //https://leetcode.com/problems/decode-the-slanted-ciphertext/?envType=problem-list-v2&envId=string
    public String decodeCiphertext(String encodedText, int rows) {
        int i = 0, n = encodedText.length();
        int cols = n / rows;
        int cnt = cols + 1;
        StringBuilder ans = new StringBuilder();
        for (int j = 0; j < cols; j++) {
            i = j;
            while (i < n) {
                ans.append(encodedText.charAt(i));
                i += cnt;
            }
        }
        return ans.toString().stripTrailing();
    }

    public static void main(String[] args) {

    }
}
