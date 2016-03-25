
import java.util.Scanner;

public class Problem_3___Formatting_Numbers {
    public static void main(String[] args) {
        
       Scanner console = new Scanner(System.in);
       int firstValue = console.nextInt();
               
       double secondValue = console.nextDouble();
       double thirdValue = console.nextDouble();

            String hexadecimal = Integer.toHexString(firstValue).toUpperCase();
            String binary = Integer.toBinaryString(firstValue);
           
            System.out.printf("|%1$-10s|%2$010d|%3$10.2f|%4$-10.3f| ", 
                 hexadecimal, Integer.parseInt(binary),secondValue,thirdValue);
            
	    }
	}


         