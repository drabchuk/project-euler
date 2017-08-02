import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem13 {

    public static void main(String[] args) {
        LinkedList<BigDecimal> list = read();
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal bi: list) {
            sum = sum.add(bi);
        }
        String num = sum.toString().substring(0, 10);
        System.out.println(num);
    }

    private static LinkedList<BigDecimal> read() {
        LinkedList<BigDecimal> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i++ < 100) {
            list.add(sc.nextBigDecimal());
        }
        return list;
    }

}
