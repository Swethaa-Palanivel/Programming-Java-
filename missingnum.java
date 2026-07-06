import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {5, 1};

        Arrays.sort(a);

        for (int i = a[0]; i <= a[a.length - 1]; i++) {
            if (Arrays.binarySearch(a, i) < 0)
                System.out.print(i + " ");
        }
    }
}