import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem_7_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int m = console.nextInt();
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
        for (int item : numbers) {
            System.out.println(item);
        }
    }
}
