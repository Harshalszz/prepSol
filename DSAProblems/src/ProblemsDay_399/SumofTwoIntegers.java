package ProblemsDay_399;

public class SumofTwoIntegers {


    public int getSum(int a, int b) {
        int c;
        while(b !=0 ) {
            c = (a&b);
            a = a ^ b;
            b = (c)<<1;
        }
        return a;

    }

    public static void main(String[] args) {

    }
}
