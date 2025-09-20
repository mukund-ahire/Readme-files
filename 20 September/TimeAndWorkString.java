import java.util.*;
public class TimeAndWorkString {

    public static List<Integer> extractNumbers(String input) {
        List<Integer> numbers = new ArrayList<>();
        String[] parts = input.split("[^0-9]+");
        for (String p : parts) {
            if (!p.isEmpty()) {
                numbers.add(Integer.parseInt(p));
            }
        }
        return numbers;
    }

    public static double calculateTotalDays(int X, int Y, int Z) {
        double workA = 1.0 / X;
        double workB = 1.0 / Y;
        double workDone = Z * (workA + workB);
        double remaining = 1 - workDone;
        double timeB = remaining / workB;
        return Z + timeB;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Question here : ");
        String input = sc.nextLine();
        List<Integer> numbers = extractNumbers(input);
        int X = numbers.get(0);
        int Y = numbers.get(1);
        int Z = numbers.get(2);
        double totalDays = calculateTotalDays(X, Y, Z);
        System.out.println("Total days required = " + totalDays);
    }
}
