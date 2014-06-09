import java.util.Scanner;


public class _07_CountBitsOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		input.close();
		int count = 0;
	    while (value > 0) {           // until all bits are zero
	        if ((value & 1) == 1)     // check lower bit
	            count++;
	        value >>= 1;              // shift bits, removing lower bit
	    }
	    System.out.print(count);
	}
}
