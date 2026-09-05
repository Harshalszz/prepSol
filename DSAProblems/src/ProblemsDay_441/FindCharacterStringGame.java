package ProblemsDay_441;

public class FindCharacterStringGame {


    public char kthCharacter(int k) {
        int jump = 0, num = k;

        while (num > 1) {
            int range = (int)(Math.log(num) / Math.log(2));
            int mid = 1 << range;

            if (num == mid) {
                range--;
                mid = 1 << range;
            }

            num -= mid;
            jump++;
        }

        return (char)('a' + jump);
    }
    public static void main(String[] args) {

    }
}
