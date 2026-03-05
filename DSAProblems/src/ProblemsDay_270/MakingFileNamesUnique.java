package ProblemsDay_270;

import java.util.HashMap;

public class MakingFileNamesUnique {

    //https://leetcode.com/problems/making-file-names-unique/?envType=problem-list-v2&envId=string
    public String[] getFolderNames(String[] names) {
        HashMap<String,Integer> map=new HashMap<>();
        int n=names.length;

        for(int i=0;i<n;i++){
            String name=names[i];
            String newName=name;

            if(map.containsKey(name)){
                int k=map.get(name);

                while(map.containsKey(newName)){
                    k++;
                    newName=name+"("+k+")";

                }
                map.put(name,k);
            }
            names[i]=newName;
            map.put(newName,0);
        }
        return names;
    }
    public static void main(String[] args) {

    }
}
