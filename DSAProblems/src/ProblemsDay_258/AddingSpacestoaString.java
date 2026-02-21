package ProblemsDay_258;

public class AddingSpacestoaString {

//https://leetcode.com/problems/adding-spaces-to-a-string/?envType=problem-list-v2&envId=string
    public String addSpaces(String s, int[] spaces) {

        StringBuilder str = new StringBuilder();


        int n=0;
        for(int i=0; i<s.length();i++){

            if(n<spaces.length && i == spaces[n]){

                str.append(" ");
                str.append(s.charAt(i));
                n++;

            }else{
                str.append(s.charAt(i));
            }
        }


        return str.toString();

    }

    public static void main(String[] args) {

    }
}
