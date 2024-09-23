import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Geben sie eine Obergränze ein :");
    int upperbound = scanner.nextInt();
    EratosthenesPrimeSieve sieve = new EratosthenesPrimeSieve(upperbound);

    sieve.printPrimes();


}