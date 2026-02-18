package ProblemsDay_255;

public class MaximumProductTwoElementsArray {

    //https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/?envType=problem-list-v2&envId=array
    public int maxProduct(int[] nums) {

        int first =0, second=0;

        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second) {
                second = num;
            }
        }

        return (first-1)*(second -1);

    }
    public static void main(String[] args) {

    }
}
