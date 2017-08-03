package math_lib.prime;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PrimeNumbers {

    public static List<Integer> primeNumbers(int to) {
        int sieveSize = sieveSize(to);
        boolean[] sieve = createSieve(sieveSize);
        List<Integer> primes = new LinkedList<>();
        for (int i = 2; i <= to; i++) {
            if (sieve[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static long primeNumberByPosition(int position) {
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

    public static boolean[] createSieve(int length) {
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

    public static int sieveSize(int position) {
        //suppose to implement n/log(n)
        return position * ((int) Math.log(position) + 2);
    }

}
