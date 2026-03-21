package ProblemsDay_286;

import java.util.LinkedList;

public class SplittingStringIntoDescendingConsecutiveValues {

    //https://leetcode.com/problems/splitting-a-string-into-descending-consecutive-values/?envType=problem-list-v2&envId=string

    public boolean splitString(String s) {
        return backTrack( s , 0, new LinkedList() );
    }

    public boolean backTrack( String s, int index, LinkedList<Long> cList )
    {
        if( index >= s.length() )
        {
            if( cList.size() >= 2)
                return true;
            return false;
        }

        long currNo=0;
        for( int i = index; i < s.length() ;i++ )
        {
            long lastNumber = cList.size() > 0 ? cList.getLast() :-1;
            currNo = currNo*10+(s.charAt(i)-'0');
            if( lastNumber == -1 || ( lastNumber - currNo ) == 1 )
            {
                cList.add( currNo);
                if( backTrack( s,i+1,cList) )
                    return true;
                cList.removeLast();
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
