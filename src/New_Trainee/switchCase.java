package New_Trainee;

import java.util.Scanner;

public class switchCase {
 public static void main(String[] args) {
	 System.out.println("Ente the number 1 and 2:");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();

	switch(number) {
	case 1:
		System.out.println("one");
		break;
	case 2:
		System.out.println("Two");
		break;
	default:
		System.out.println("the number you entered is not in the range: ");
	}
	}
}

