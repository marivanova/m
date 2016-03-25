

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem_7___Randomize_Numbers_from_N_to_M {
    public static void main (String [] args){
        
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        
        int biggerNumber = 0;
        int smallerNumber = 0;
 
       if (n > m) {
           biggerNumber = n;
            smallerNumber = m;
        } else if (n < m) {
            biggerNumber = m;
            smallerNumber = n;
        } else {
            System.out.println(n);
        }
 
        List<Integer> numbers = new ArrayList<>();

       for (int i = smallerNumber; i <= biggerNumber; i++) {
            numbers.add(i);
            Collections.shuffle(numbers);
        }
       if ( m != n){
        for (int item : numbers) {
            System.out.println(item);
        }
        } 
    }
}