package problem_7;

import java.util.Arrays;

public class Problem7 {

    public static final int POSITION = 10001;

    public static void main(String[] args) {
        System.out.println(solve());
    }

    private static long solve() {
        return primeNumberByPosition(POSITION);
    }

    private static long primeNumberByPosition(int position) {
        int sieveSize = sieveSize(position);
        boolean[] sieve = createSieve(sieveSize);
        int counter = 0;
        int prime = 1;
        while (counter < position) {
            prime ++;
            if (sieve[prime]) {
                counter++;
            }
        }
        return prime;
    }

    private static boolean[] createSieve(int length) {
        boolean[] sieve = new boolean[length + 1];
        Arrays.fill(sieve, true);
        sieve[0] = false; sieve[1] = false; sieve[2] = true;
        int sqrt = (int) Math.sqrt(length);
        for (int i = 2; i <= sqrt; i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= length; j+= i) {
                    sieve[j] = false;
                }
            }
        }
        return sieve;
    }

    private static int sieveSize(int position) {
        return position * ((int) Math.log(position) + 2);
    }

}
