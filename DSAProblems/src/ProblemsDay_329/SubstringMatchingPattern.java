package ProblemsDay_329;

public class SubstringMatchingPattern {

//https://leetcode.com/problems/substring-matching-pattern/?envType=problem-list-v2&envId=string
    public boolean hasMatch(String s, String p) {

        int starPos = p.indexOf('*');
        String head = p.substring(0, starPos);
        String tail = p.substring(starPos + 1);

        int left = s.indexOf(head);
        int rght = s.lastIndexOf(tail);

        if (left == -1 || rght == -1) return false;
        return left + head.length() <= rght;}

    public static void main(String[] args) {

    }
}
