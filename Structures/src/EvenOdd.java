import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
		System.out.println("Enter a digit : ");
		int number = scan.nextInt();
		
		System.out.println("Odd numbers till " + number + " : ");
		
		for(int i = 0 ; i <= number ; i++){
			if(i%2 == 1)
				System.out.println(i);
		}
		
	}
	
}
