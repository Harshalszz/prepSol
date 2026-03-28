package ProblemsDay_293;

import java.util.ArrayList;
import java.util.List;

public class SplitStringsSeparator {

//https://leetcode.com/problems/split-strings-by-separator/?envType=problem-list-v2&envId=string
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> nm=new ArrayList<>();
        for(int i=0;i<words.size();i++)
        {
            String arr[]=words.get(i).split("["+separator+"]");
            for(int j=0;j<arr.length;j++)
            {

                if(arr[j].length()>0)
                {
                    nm.add(arr[j]);
                }
            }
        }
        return nm;
    }

    public static void main(String[] args) {

    }
}
