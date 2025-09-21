import java.util.Scanner;

public class PrimeFibonacci {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        while (a <= n) {
            if (isPrime(a)) System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
