package ProblemsDay_256;

public class CheckBinaryStringHasMostOneSegmentOnes {

    //https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/?envType=problem-list-v2&envId=string
    public boolean checkOnesSegment(String s) {

        boolean seenOne = false;
        boolean segmentEnded = false;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                if (segmentEnded) {
                    return false; // Found another segment
                }
                seenOne = true;
            } else { // c == '0'
                if (seenOne) {
                    segmentEnded = true;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {

    }
}
