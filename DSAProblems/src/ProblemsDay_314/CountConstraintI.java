package ProblemsDay_314;

public class CountConstraintI {
    public int countKConstraintSubstrings(String s, int k) {
        int n = s.length();

        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int zeros = 0;
                int ones = 0;
                for(int counter = i; counter <= j; counter++){
                    if(s.charAt(counter) == '0'){
                        zeros++;
                    } else{
                        ones++;
                    }
                }
                if(zeros <= k || ones <= k){
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {

    }
}
