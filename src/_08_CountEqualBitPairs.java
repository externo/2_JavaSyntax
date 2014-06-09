import java.util.Scanner;

public class _08_CountEqualBitPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		input.close();
		int count = 0;
	    while (value > 0) {
	        if ((value & 3) == 3 || value%4==0){
	            count++;	       
	        }
	        System.out.println(Integer.toBinaryString(value));
	        value >>= 1;
	    }
	    System.out.println();
	    System.out.print(count);
	}
}
