package ProblemsDay_257;

public class AverageSalaryExcludingMinimumandMaximumSalary {
//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/?envType=problem-list-v2&envId=array

    public double average(int[] salary) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;


        for(int num : salary){
            if(num < min){
                min = num;
            }

            if(num > max){
                max = num;
            }

            sum += num;
        }

        return (sum - min - max) / (salary.length - 2.0);
    }
    public static void main(String[] args) {

    }
}
