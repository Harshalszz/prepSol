package ProblemsDay_288;

public class CheckArrayFormationThroughConcatenation {

//https://leetcode.com/problems/check-array-formation-through-concatenation/?envType=problem-list-v2&envId=array
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int[][] map = new int[101][];

        for (int[] p : pieces) {
            map[p[0]] = p;
        }

        for (int i = 0; i < arr.length;) {
            int el = arr[i];

            if (map[el] == null) {
                return false;
            }

            int[] part = map[el];

            for (int j = 1; j < part.length; j++) {
                if (arr[i + j] != part[j]) {
                    return false;
                }
            }

            i += part.length;
        }

        return true;
    }
    public static void main(String[] args) {

    }
}
