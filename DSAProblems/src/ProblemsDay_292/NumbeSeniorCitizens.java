package ProblemsDay_292;

public class NumbeSeniorCitizens {

// https://leetcode.com/problems/number-of-senior-citizens/?envType=problem-list-v2&envId=string
    public int countSeniors(String[] details) {
        int ans = 0;
        for (var x : details) {
            int age = Integer.parseInt(x.substring(11, 13));
            if (age > 60) {
                ++ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
