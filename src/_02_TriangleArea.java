import java.util.Scanner;


public class _02_TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		double side1x  = input.nextDouble();
        double side1y  = input.nextDouble();
        double side2x  = input.nextDouble();
        double side2y  = input.nextDouble();
        double side3x  = input.nextDouble();
        double side3y  = input.nextDouble();
		input.close();
		
		double side1 = Math.sqrt(Math.pow((side2x - side1x), 2) + Math.pow((side2y - side1y), 2));
		double side2 = Math.sqrt(Math.pow((side3x - side2x), 2) + Math.pow((side3y - side2y), 2));
		double side3 = Math.sqrt(Math.pow((side1x - side3x), 2) + Math.pow((side1y - side3y), 2));

        double p = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p-side3));

        System.out.printf("area = " + Math.round(area));
	}

}
