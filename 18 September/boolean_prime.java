public class boolean_prime {
    boolean isPrime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}
    public static void main(String[] args) {
        boolean_prime obj = new boolean_prime();
        int n = 35;
        System.out.println(obj.isPrime(n));
    
}
}
