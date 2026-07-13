import java.util.Scanner;
public class Fibo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n < 1 || n > 20 || m < 1 || m > 20 || n > m) {
            System.out.println("Invalid Input");
            return;
        }
        int a = 0, b = 1, c;
        int sum = 0;
        for (int i = 1; i <= m; i++) {
            if (i == 1)
                c = 0;
            else if (i == 2)
                c = 1;
            else {
                c = a + b;
                a = b;
                b = c;
            }
            if (i >= n)
                sum += c;
        }
        System.out.println("The Sum of Fibonacci value is " + sum);
    }
}