package ProblemsDay_255;

public class MakeTwoArraysEqualReversingSubarrays {

    //https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/?envType=problem-list-v2&envId=array
    public boolean canBeEqual(int[] targetArray, int[] currentArray) {

        int[] elementCounts = new int[1001];
        int uniqueCount = 0;

        for (int i = 0; i < targetArray.length; i++) {
            if (elementCounts[targetArray[i]]++ == 0) uniqueCount++;
            if (elementCounts[currentArray[i]]-- == 1) uniqueCount--;
        }

        return uniqueCount == 0;
    }
    public static void main(String[] args) {

    }
}
