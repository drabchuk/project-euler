package problems;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Problem16 {

    public static void main(String[] args) {

        BigInteger num = BigInteger.ONE.shiftLeft(1000);
        String numStr = num.toString();
        char[] chars = numStr.toCharArray();
        int sum = 0;
        for (char c: chars) {
            sum += Integer.parseInt(Character.toString(c));
        }
        System.out.println(sum);
    }


}
