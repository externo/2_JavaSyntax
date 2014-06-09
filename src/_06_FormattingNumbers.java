import java.text.DecimalFormat;
import java.util.Scanner;


public class _06_FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);				
    	int first = input.nextInt();	
    	String hex = Integer.toHexString(first);    	
    	String binary = Integer.toBinaryString(first);
    	float second = input.nextFloat();
    	String sec = new DecimalFormat("#0.00").format(second);
    	float third = input.nextFloat();
    	String th = new DecimalFormat("#0.##").format(third);
    	input.close();

		System.out.println(String.format("|%1$-" + 10 + "s|", hex) 
				+ String.format("%10s",binary).replace(' ', '0')+"|"
				+ String.format("%1$" + 10 + "s", sec)+"|"
				+ String.format("%1$-" + 10 + "s", th)+"|");
	}

}
