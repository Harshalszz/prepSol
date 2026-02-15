package ProblemsDay_252;

public class ElementAppearingMoreThan25InSortedArray {
//https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/?envType=problem-list-v2&envId=array

    public int findSpecialInteger(int[] arr) {
        int size = arr.length;
        int qtr = size / 4;
        int cnt = 1;
        int p = arr[0];
        for (int i = 1 ; i < arr.length ; i++) {

            if ( p == arr[i]) cnt++;
            else cnt = 1;

            if (cnt > qtr) return arr[i];

            p = arr[i];
        }

        return p;
    }

    public static void main(String[] args) {

    }
}
