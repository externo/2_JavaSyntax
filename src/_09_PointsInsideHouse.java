import java.awt.geom.Path2D;
import java.util.Scanner;

public class _09_PointsInsideHouse {

	public static void main(String[] args) {
		double[] xCoordinates = new double[]{12.5,17.5,17.5,20,20,22.5,22.5,17.5,12.5};
		double[] yCoordinates = new double[]{13.5,13.5,8.5,8.5,13.5,13.5,8.5,3.5,8.5};
		
		Double xCheck = (double) 0;
		Double yCheck = (double) 0;
		Scanner input = new Scanner(System.in);		
		
    	xCheck = input.nextDouble();
    	yCheck = input.nextDouble();
    	input.close();

    	Path2D poli = new Path2D.Double() ;
    	poli.moveTo(xCoordinates[0], yCoordinates[0]);
        for (int i=1; i<xCoordinates.length; i++){
        	poli.lineTo(xCoordinates[i], yCoordinates[i]);
        }

        if (poli.contains(xCheck, yCheck)){
        	System.out.println("Inside");
        }else{
        	System.out.println("Outside");
        }
	}
}
