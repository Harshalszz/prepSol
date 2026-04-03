package ProblemsDay_299;

import java.util.Arrays;

public class MaximumUnitsonTruck {

//https://leetcode.com/problems/maximum-units-on-a-truck/?envType=problem-list-v2&envId=array

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes , (a, b) -> b[1]-a[1]);
        int res=0;

        for(int i=0; i<boxTypes.length ; i++){
            if(truckSize <= 0) break;
            res+=(Math.min(truckSize,boxTypes[i][0])*boxTypes[i][1]);
            truckSize-=boxTypes[i][0];
        }
        return res;
    }

}
