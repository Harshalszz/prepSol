package ProblemsDay_353;

import java.util.Arrays;

public class MinimumNumberMovesSeatEveryone {

//https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/?envType=problem-list-v2&envId=array
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int n=seats.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum += Math.abs(seats[i]-students[i]);
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}
