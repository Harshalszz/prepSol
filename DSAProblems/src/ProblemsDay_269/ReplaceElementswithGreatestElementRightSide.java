package ProblemsDay_269;

public class ReplaceElementswithGreatestElementRightSide {

//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/?envType=problem-list-v2&envId=array
    public int[] replaceElements(int[] arr)
    {
        int op [] = new int [arr.length];
        op[arr.length-1] = -1;

        for(int i = arr.length-2; i>=0;i--)
        {
            op[i] = Math.max(op[i+1],arr[i+1]);
        }

        return op;
    }

    public static void main(String[] args) {

    }
}
