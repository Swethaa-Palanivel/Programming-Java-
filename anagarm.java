import java.util.Scanner;
import java.util.Arrays;
public class Anagarm{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
       String s=sc.nextLine();
       String p = sc.nextLine();
       int count=0;
       for(int i =0;i<=s.length()-p.length();i++){
           char[]a=s.substring(i,i+p.length()).toCharArray();
            char[]b=p.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a,b)){
                count++;
                
            }
        
       }
           System.out.print(count);
       
	}
}