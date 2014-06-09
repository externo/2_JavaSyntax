import java.util.Scanner;

public class _01_RectangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a= ");
		int a = input.nextInt();
		System.out.print("Enter b= ");
		int b = input.nextInt();
		input.close();
		System.out.printf("The area of rectangle is = %d", a*b);
	}
}
