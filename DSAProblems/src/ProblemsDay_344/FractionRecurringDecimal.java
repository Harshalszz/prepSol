package ProblemsDay_344;

import java.util.HashMap;
import java.util.Map;

public class FractionRecurringDecimal {
//https://leetcode.com/problems/fraction-to-recurring-decimal/?envType=problem-list-v2&envId=string

    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder res = new StringBuilder();
        if ((numerator < 0) ^ (denominator < 0)) res.append('-');

        long n = Math.abs((long) numerator);
        long d = Math.abs((long) denominator);

        res.append(n / d);
        long rem = n % d;
        if (rem == 0) return res.toString();

        res.append('.');
        Map<Long, Integer> seen = new HashMap<>();

        while (rem != 0) {
            if (seen.containsKey(rem)) {
                int pos = seen.get(rem);
                res.insert(pos, "(");
                res.append(')');
                break;
            }
            seen.put(rem, res.length());
            rem *= 10;
            res.append(rem / d);
            rem = rem % d;
        }
        return res.toString();
    }

    public static void main(String[] args) {

    }
}
