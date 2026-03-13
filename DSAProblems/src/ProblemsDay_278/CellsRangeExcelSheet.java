package ProblemsDay_278;

import java.util.ArrayList;
import java.util.List;

public class CellsRangeExcelSheet {
//https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/?envType=problem-list-v2&envId=string
    public List<String> cellsInRange(String s) {
        ArrayList<String> arr=new ArrayList<>();
        char c1=s.charAt(0);
        char c2=s.charAt(3);
        int n1=s.charAt(1)-'0';
        int n2=s.charAt(4)-'0';
        for(char ch=c1;ch<=c2;ch++){
            for(int i=n1;i<=n2;i++){
                StringBuilder sb=new StringBuilder();
                sb.append(ch).append(i);
                arr.add(sb.toString());
            }
        }
        return arr;
    }
    public static void main(String[] args) {

    }
}
