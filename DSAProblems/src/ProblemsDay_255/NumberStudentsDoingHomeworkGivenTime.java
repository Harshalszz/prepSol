package ProblemsDay_255;

public class NumberStudentsDoingHomeworkGivenTime {

    //https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/?envType=problem-list-v2&envId=array
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int res = 0;

        for( int  i =0; i<startTime.length; i++){

            if(startTime[i] <= queryTime && endTime[i] >= queryTime){
                res++;
            }
        }

        return res;

    }
    public static void main(String[] args) {

    }
}
