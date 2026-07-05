import java.util.Scanner;
public class TripletsEquals{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
          int b =sc.nextInt();
            int  c=sc.nextInt();
            int count =0;
            while(!(a==b && b==c)){
                if(a>=b && a>=c){
                    a--;
                    b++;c++;
                }else if (b>=a && b>=c){
                    a++;
                    b--;
                    c++;
                    
                }else{
                    a++;
                    b++;
                    c--;
                }
                count++;
            }
            if(count>1000000){
                System.out.print("-1");
                return;
            }
              System.out.print(count);
            
          
    }
}