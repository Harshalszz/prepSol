package ProblemsDay_329;

public class ConvertDateBinary {

    //https://leetcode.com/problems/convert-date-to-binary/?envType=problem-list-v2&envId=string

    public String convertDateToBinary(String date) {
        String [] parts = date.split("-");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<parts.length;i++)
        {
            int num = Integer.parseInt(parts[i]);
            sb.append(Integer.toBinaryString(num));
            if(i != parts.length-1)
            {
                sb.append("-");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
