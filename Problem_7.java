	import java.util.ArrayList;
        import java.util.Collections;
	import java.util.InputMismatchException;
	import java.util.Scanner;
	

	

	public class Problem_7 {
	

		public static void main(String[] args) {
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			try (Scanner input = new Scanner(System.in);){
				
				Integer first = input.nextInt();
				Integer last = input.nextInt();
				Integer min = Math.min(first,last);
				Integer max = Math.max(first,last);
				for (int i = min; i <= max; i++) {
					list.add(i);
				}
				Collections.shuffle(list);
				for (Integer i : list) {
					System.out.printf("%d ",i);
				}
			} catch (InputMismatchException e) {
			 e.printStackTrace();
			}
	
		}
	
	}

