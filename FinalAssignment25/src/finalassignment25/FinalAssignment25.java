package finalassignment25;
public class FinalAssignment25 {
    public static void main(String[] args) {
        
    int num = 10;
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " prime");
    else
      System.out.println(num + " not a prime");
    }
    
}
