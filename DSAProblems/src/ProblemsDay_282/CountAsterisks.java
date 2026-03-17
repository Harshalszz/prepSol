package ProblemsDay_282;

public class CountAsterisks {

    //https://leetcode.com/problems/count-asterisks/?envType=problem-list-v2&envId=string
    public int countAsterisks(String s) {
        int ans = 0, n = 0;
        for(char ch:s.toCharArray()){
            if(n%2==0 && ch=='*') ans++;
            else if(ch=='|') n++;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
