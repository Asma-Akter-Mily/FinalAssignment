package finalassignment59;
import java.util.Arrays;
public class FinalAssignment59 {
    public static void main(String[] args) {
        int[] Array1 = new int[]{00,10,20,30,40,50};
        int[] Array2 = new int[]{60,70,80,90,100};
        int[] Concate = ArrayUtil.addAll(Array1, Array2);
        System.out.println("Concatenated Array: " + Arrays.toString(Concate));
    }
    
}
