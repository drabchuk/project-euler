package problems;

public class Problem14 {

    public static void main(String[] args) {
        for (long i = 5L; i < Long.MAX_VALUE / 2L; i*= 2) {
            if (i % 3L == 1L) {
                long j = (i - 1L) / 3L;
                if (j % 3 == 0) {
                    System.out.println(i + "\u0009" + j + "\u00090");
                } else if (j % 3 == 1) {
                    System.out.println(i + "\u0009" + j + "\u0009|");
                } else {
                    System.out.println(i + "\u0009" + j + "\u0009-");
                }
            }
        }
    }

}
