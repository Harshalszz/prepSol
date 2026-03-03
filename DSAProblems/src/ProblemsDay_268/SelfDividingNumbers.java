package ProblemsDay_268;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

//https://leetcode.com/problems/self-dividing-numbers/?envType=problem-list-v2&envId=math
    public List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++)
            if(check(i)) list.add(i);
        return list;
    }
    private boolean check(int n){
        int x=n;
        while(n>0){
            int d=n%10;
            if(d==0||x%d!=0) return false;
            n/=10;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
