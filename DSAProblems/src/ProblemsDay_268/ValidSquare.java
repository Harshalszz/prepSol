package ProblemsDay_268;

import java.util.HashSet;
import java.util.Set;

public class ValidSquare {

//https://leetcode.com/problems/valid-square/?envType=problem-list-v2&envId=math
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> sides=new HashSet<>();
        sides.add(distance(p1,p2));
        sides.add(distance(p1,p3));
        sides.add(distance(p1,p4));
        sides.add(distance(p2,p3));
        sides.add(distance(p2,p4));
        sides.add(distance(p3,p4));

        return sides.size()==2 && !sides.contains(0);

    }
    private int distance(int []a,int []b){
        return (int)Math.pow((a[0]-b[0]),2)+(int)Math.pow((a[1]-b[1]),2);
    }
    public static void main(String[] args) {

    }
}
