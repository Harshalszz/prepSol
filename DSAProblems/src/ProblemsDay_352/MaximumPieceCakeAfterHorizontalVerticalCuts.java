package ProblemsDay_352;

import java.util.Arrays;

public class MaximumPieceCakeAfterHorizontalVerticalCuts {

//https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/?envType=problem-list-v2&envId=array
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        //sort both the arrays
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        //find max diff between two consecutive horizontal cuts
        int maxh = horizontalCuts[0];
        for(int i=1;i<horizontalCuts.length;i++)
            maxh = Math.max(horizontalCuts[i]-horizontalCuts[i-1],maxh);
        maxh = Math.max(h-horizontalCuts[horizontalCuts.length-1],maxh);
        //find max diff between two consecutive vertical cuts
        int maxw = verticalCuts[0];
        for(int i=1;i<verticalCuts.length;i++)
            maxw = Math.max(verticalCuts[i]-verticalCuts[i-1],maxw);
        maxw = Math.max(w-verticalCuts[verticalCuts.length-1],maxw);

        long ans = 1l*maxh*maxw;
        return (int)(ans%1000000007);
    }

    public static void main(String[] args) {

    }
}
