import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "swethaa";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

        if (s.indexOf(ch) == i) {
                int count = 0;

       for(int j = 0; j < s.length(); j++) {
        if(s.charAt(j) == ch)
         count++;
                }
            System.out.print(ch + ":" + count + " ");
                
            }
     }
    }
}
    