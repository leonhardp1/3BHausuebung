import java.util.Scanner;

public class EratosthenesPrimeSieve implements PrimeSieve {
    private int upperBound;
    private boolean[] sieve;

    public EratosthenesPrimeSieve(int upperBound) {
        this.upperBound = upperBound;
        this.sieve = new boolean[upperBound + 1];
    }



    @Override
    public boolean isPrime(int p) {
        if (p < 2 || p > upperBound) {
            return false;
        }
        return sieve[p];
    }

    @Override
    public void printPrimes() {
        System.out.println("Primzahlen bis " + upperBound + ":");
        for (int i = 2; i <= upperBound; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


}
