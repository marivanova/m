
import java.util.Scanner;

public class Problem_5__Convert_Dec_to_Base7 {
  
    public static void main(String[] args) {
    
        Scanner number = new Scanner(System.in);
    
        int decimalNumber = number.nextInt();
        
        String base7Number = Integer.toString(decimalNumber, 7);
        System.out.println(base7Number);
    }
}