package finalassignment17;
import java.util.Scanner;
public class FinalAssignment17 {
    public static void main(String[] args) {
        int n, num1 = 0, num2 =1;
        Scanner s = new Scanner(System.in);
        n= s.nextInt();
        System.out.print(""+n+ " = ");
        int i =1;
        while(i <= n)
        {
            if(i== n)
                System.out.print(num1);
            else
                System.out.print(num1+ " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
        }
        
    }
    
}
