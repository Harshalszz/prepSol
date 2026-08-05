package ProblemsDay_414;

public class WaterandJugProblem {

//https://leetcode.com/problems/water-and-jug-problem/?envType=problem-list-v2&envId=depth-first-search
    public boolean canMeasureWater(int x, int y, int target) {
        if(target>x+y)return false;
        if(x==target||y==target||x+y==target)return true;
        return target%gcd(x,y)==0;
    }
    public static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {

    }
}
