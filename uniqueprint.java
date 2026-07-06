import java.util.*;

public class Uniqueprint {
    public static void main(String[] args) {
        int arr[] = {13,2,4,15,12,10,6,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start = 0; // 0
        int end = arr.length-1; // 7
        while(start <= end){
            System.out.print(arr[end]+" "+arr[start]+" ");
            start++;
            end--;
        }
    }
}