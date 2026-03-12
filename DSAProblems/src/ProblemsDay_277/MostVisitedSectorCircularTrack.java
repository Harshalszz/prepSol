package ProblemsDay_277;

import java.util.ArrayList;
import java.util.List;

public class MostVisitedSectorCircularTrack {
//https://leetcode.com/problems/most-visited-sector-in-a-circular-track/?envType=problem-list-v2&envId=array
    public void helper(int a,int b,List<Integer>l)
    {
        for(int i=a;i<=b;i++)
        {
            l.add(i);
        }
    }
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> l=new ArrayList<>();
        int a=rounds[0];
        int b=rounds[rounds.length-1];
        if(a<=b)
        {
            helper(a,b,l);
        }
        else
        {
            helper(1,b,l);
            helper(a,n,l);
        }
        return l;
    }
    public static void main(String[] args) {

    }
}
