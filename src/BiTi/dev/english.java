package BiTi.dev;

import java.util.Scanner;

public class english {
	private static Scanner sf;

	public static void main(String[] args) {
		System.out.println("nhap vao 1 so tu nhien de ra 1  tu tieng anh (0 < n < 10: ");
		int n;
		sf = new Scanner(System.in);
		n = sf.nextInt();
		switch (n) {
		case 0:
			System.out.println("Hello");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 10:
			System.out.println("Ten");
			break;
			
			
		default:
			System.out.println("Moi ban nhap lai so khac");
			
		}
	}

}
