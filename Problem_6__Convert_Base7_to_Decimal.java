import java.util.Scanner;

public class Problem_6__Convert_Base7_to_Decimal {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        String base7Number = input.next();
        Integer decimalNumber = Integer.valueOf(base7Number,7);
        //Integer decimalNumber = Integer.parseInt(base7Number,7);
        System.out.println(decimalNumber);         
    } 
}