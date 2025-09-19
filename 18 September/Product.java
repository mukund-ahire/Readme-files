import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n, digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int power = digits - 1;
        long product = 1;  

        
        while (n > 0) {
            int divisor = (int) Math.pow(10, power);
            int digit = n / divisor;
            n = n % divisor;

            if (digit != 0) {
                int value = digit * divisor; // digit × place value
                product *= value;
            }
            power--;
        }

        // Final Output
        System.out.println("Output = " + product);

        sc.close();
    }
}
