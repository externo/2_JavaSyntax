import java.awt.geom.Path2D;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class _10_PaintHouseAsSVG {
    public static void main(String[] args) throws IOException {
    	//the house painting
    	double[] xCoordinates = new double[]{12.5,17.5,17.5,20,20,22.5,22.5,17.5,12.5};
		double[] yCoordinates = new double[]{13.5,13.5,8.5,8.5,13.5,13.5,8.5,3.5,8.5};
    	Path2D poli = new Path2D.Double();
    	poli.moveTo(10*xCoordinates[0], 10*yCoordinates[0]);
        for (int i=1; i<xCoordinates.length; i++){
        	poli.lineTo(10*xCoordinates[i], 10*yCoordinates[i]);
        }
		Scanner input = new Scanner(System.in);
		String dots ="";
		for ( int i = 0; i<1; ){
			System.out.print("enter X coo: ");
			String inputX = input.nextLine();
			
			if (inputX.equals("")){
				i++;
				input.close();
			}else{
				System.out.print("enter Y coo: ");
				String inputY = input.nextLine();
				double x = 10*Double.parseDouble(inputX);
				double y = 10*Double.parseDouble(inputY);
	
		        if (poli.contains(x, y)){
		        	dots += "<circle cx=\""+x+"\" cy=\""+y+"\" r=\"1\" stroke=\"black\" stroke-width=\"1\" fill=\"black\" />";
		        }else{
		        	dots += "<circle cx=\""+x+"\" cy=\""+y+"\" r=\"1\" stroke=\"red\" stroke-width=\"1\" fill=\"red\" />";
		        }
			}
		}
		
    	Writer writer = null;
    	try {
    	    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("document.html"), "utf-8"));
    	    String triangle = "<polygon points=\"125,85  225,85  175,35\"style=\"stroke:#330099; fill:#00FFFF;\"/>";
    	    String rect1 = "<polygon points=\"125,85  175,85  175,135 125,135\"style=\"stroke:#330099; fill:#00FFFF;\"/>";
    	    String rect2 = "<polygon points=\"200,135  225,135  225,85 200,85\"style=\"stroke:#330099; fill:#00FFFF;\"/>";
    	    writer.write("<div>\n<svg>\n"+triangle+rect1+rect2+dots+"</svg></div>");    	    
    	} catch (IOException ex) {    	  
    	} finally {
    	   try {writer.close();} catch (Exception ex) {}
    	}
    }
}