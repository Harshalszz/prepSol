package ProblemsDay_342;

public class MaximumPopulationYear {

//https://leetcode.com/problems/maximum-population-year/?envType=problem-list-v2&envId=array
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];
        //altering birth & death indices only
        for(int[] log : logs){
            years[log[0] - 1950]++;
            years[log[1] - 1950]--;
        }

        int max = 0, current = 0, year = 0;
        for(int i = 1; i <= 100; i++){
            current += years[i];  //using prefix sum
            if(current > max){
                max = current;
                year = i;
            }

        }
        return year +  1950;  //changing 0 - 150 => 1950 - 2050
    }
    public static void main(String[] args) {

    }
}
