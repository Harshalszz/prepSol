package ProblemsDay_377;

import java.util.Arrays;

public class AppleRedistributionintoBoxes {

//https://leetcode.com/problems/apple-redistribution-into-boxes/?envType=problem-list-v2&envId=array
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int ans = 0, sum = 0;
        for(int i = 0; i < apple.length; i++) sum += apple[i];
        for(int i = capacity.length - 1; i >= 0; i--) {
            sum -= capacity[i];
            ans++;
            if(sum <= 0) return ans;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
