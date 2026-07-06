import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int k = 2, n = a.length;
        int[] b = new int[n];

        for (int i = 0; i < n; i++)
            b[(i + k) % n] = a[i];

        for (int x : b)
            System.out.print(x + " ");
    }
}