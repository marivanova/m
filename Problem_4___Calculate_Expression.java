import java.util.Scanner;
 
public class Problem_4___Calculate_Expression {
    public static void main(String[] args){
    Scanner number = new Scanner (System.in);
    
      double a = number.nextDouble();
      double b = number.nextDouble();
      double c = number.nextDouble();
   
      
    double a1 = (a*a + b*b ) / (a*a - b*b);
    double a2 = (a + b + c) / Math.sqrt(c);
    double firstValue =  Math.pow(a1, a2);
    
    double b1 = (a*a + b*b - c*c*c);
    double b2 = (a-b);
    double secondValue = Math.pow(b1, b2);
    
    double firstAverage = (a + b + c) / 3;
    double secondAverage = (firstValue + secondValue) / 2;
    
    double average = secondAverage - firstAverage;
   
    System.out.println();
    System.out.printf("F1 result: %1$.2f; F2 result: %2$.2f; Diff: %3$.2f", 
            firstValue, secondValue, average);
     
    }
    
}
