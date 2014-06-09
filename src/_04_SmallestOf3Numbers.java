import java.util.Scanner;


public class _04_SmallestOf3Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);				
    	double smallest = input.nextDouble();
    	double second = input.nextDouble();
    	if (smallest>second){
    		smallest=second;
    	}
    	double third = input.nextDouble();
    	if (smallest>third){
    		smallest=third;
    	}
    	input.close();
    	System.out.print("The smallest number is: "+smallest);
	}

}
