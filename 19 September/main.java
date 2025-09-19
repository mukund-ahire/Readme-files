public class main {

    void fibonacci(int n) {
    int a = 2, b = 4; int c = 0;
    for (int i = 3; i <= n; i++) {
        c = a + b + 2;
        a = b;
        b = c;  
    }
    System.out.print(c);
}

    public static void main(String[] args) {
        main obj = new main();
        int n = 5;
        obj.fibonacci(n);
    }

}
