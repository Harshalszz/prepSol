package ProblemsDay_437;

public class HappyNumber {

    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        do{
            slow = genNum(slow);
            fast = genNum(genNum(fast));
        }while(slow != fast);

        return slow == 1;

    }

    public static int genNum(int n){
        int res = 0;

        while(n>0){

            int rem = n%10;
            res += rem*rem;
            n = n/10;
        }

        return res;
    }
    public static void main(String[] args) {

    }
}
