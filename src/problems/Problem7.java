package problems;

import math_lib.prime.PrimeNumbers;

public class Problem7 {

    public static final int POSITION = 10001;

    public static void main(String[] args) {
        System.out.println(solve());
    }

    private static long solve() {
        return PrimeNumbers.primeNumberByPosition(POSITION);
    }

}
