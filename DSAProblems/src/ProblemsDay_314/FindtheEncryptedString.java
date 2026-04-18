package ProblemsDay_314;

public class FindtheEncryptedString {


    public String getEncryptedString(String s, int k) {
        String str="";
        for(int i=0;i<s.length();i++){
            int y=i+k;
            if(y>=s.length()){
                int h=y%s.length();
                str+=s.charAt(h)+"";
            }
            else{
                str+=s.charAt(y)+"";
            }
        }
        return str;
    }
    public static void main(String[] args) {

    }
}
