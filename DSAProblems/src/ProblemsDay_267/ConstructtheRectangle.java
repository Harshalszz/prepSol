package ProblemsDay_267;

public class ConstructtheRectangle {

//https://leetcode.com/problems/construct-the-rectangle/?envType=problem-list-v2&envId=math
    public int[] constructRectangle(int area) {
        int W = (int) Math.sqrt(area);

        while (area % W != 0) {
            W--;
        }

        int L = area / W;

        return new int[]{L, W};
    }
    public static void main(String[] args) {

    }
}
