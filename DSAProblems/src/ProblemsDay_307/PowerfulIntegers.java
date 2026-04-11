package ProblemsDay_307;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerfulIntegers {
//https://leetcode.com/problems/powerful-integers/?envType=problem-list-v2&envId=hash-table

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        if(bound==0||bound==1)return new ArrayList();
        Set<Integer> al=new HashSet<>();

        if(x==1&&y==1){
            al.add(2);
            return new ArrayList(al);
        }
        for(int i=0;i<bound;i++){
            double val=Math.pow(x,i);
            if(val>bound)break;
            for(int j=0;j<bound;j++){
                double tot=val+Math.pow(y,j);
                if(tot>bound)break;
                al.add((int)tot);
            }
        }
        return new ArrayList(al);
    }
    public static void main(String[] args) {

    }
}
