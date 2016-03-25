
import java.util.Scanner;

public class Problem_1__Rectangle_Area {
    public static void main(String[] args) {  
    
    Scanner input = new Scanner(System.in);
    System.out.print("rectangle side a = ");
    int a = input.nextInt();
    System.out.print("rectangle side b = ");
    int b = input.nextInt();
    
    int area = a*b;
    
    System.out.println("Area of rectangle = " + area);
          
    }
}
