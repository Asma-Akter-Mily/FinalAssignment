
package finalassignment7;
import java.util.Scanner;
public class Finalassignment7 {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        if(a % 2 == 0)
        {
            System.out.println("number is even" +a);
        }
        else
        {
            System.out.println("Number is odd " +a);
        }
    }
    
}
