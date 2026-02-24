package ProblemsDay_261;

import java.util.LinkedList;
import java.util.Queue;

public class AsFarfromLandPossible {
    //https://leetcode.com/problems/as-far-from-land-as-possible/?envType=problem-list-v2&envId=array
    class Pair
    {
        int a;
        int b;
        int c;
        Pair( int a,int b,int c)
        {
            this.a=a;
            this.b=b;
            this.c=c;
        }
    }
    public int maxDistance(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();
        int max=-1;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    grid[i][j]=2;
                    q.add(new Pair(i,j,0));
                }
            }
        }

        int dr[]={0,1,0,-1};
        int dc[]={1,0,-1,0};

        while(!q.isEmpty())
        {
            int row=q.peek().a;
            int col=q.peek().b;
            int steps=q.peek().c;

            q.poll();

            max=Math.max(max,steps);

            for(int i=0;i<4;i++)
            {
                int nr=row+dr[i];
                int nc=col+dc[i];
                if(nr<grid.length && nc<grid[0].length && nr>=0 && nc>=0 && grid[nr][nc]!=2)
                {
                    grid[nr][nc]=2;
                    q.add(new Pair(nr,nc,steps+1));
                }
            }
        }
        if(max==0)
            return -1;
        return max;

    }

    public static void main(String[] args) {

    }
}
