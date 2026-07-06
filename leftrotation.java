import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int k = 3, n = a.length;

        while (k-- > 0) {
            int t = a[n - 1];
            for (int i = n - 1; i > 0; i--)
                a[i] = a[i - 1];
            a[0] = t;
        }

        for (int x : a)
            System.out.print(x + " ");
    }
}