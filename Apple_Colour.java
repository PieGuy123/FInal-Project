import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Apple_Colour {

	static class apple{
		//these are the three value that the 'apple' object has, the R stands for RED, G stands for Green, and B stands for Blue
		int R = 0;
		int G = 0;
		int B = 0;
		
		//this is the constructor
		public apple(){
			R = 0;
			G = 0;
			B = 0;
		}

		
		
	/**
	 * This method is used to set the RGB value for the object
	 * @param R1
	 * @param G1
	 * @param B1
	 */
	public void setVariables(int R1, int G1, int B1){
		R= R1;
		G = G1;
		B = B1;
		//System.out.println("worked");
	}
	/**
	 * This method simply prints out the RGB values int eh object
	 */
	public void printout(){
		System.out.println(R + "\n" + G + "\n" + B);
	}
	
		
	}
	
	
	
	
	
	//@SuppressWarnings("null")		//not exactly sure what this does????
	public static void main(String[] args) {
		
		try{
			String FileName = "red.png";
			BufferedImage image = ImageIO.read(new File(FileName));
			apple[][] rgbArray = new apple[image.getWidth()][image.getHeight()];
			
			//this section of code will create the 2D array of objects (if you don't have this, you will get a Null pointer exception)
			for(int i = 0; i < image.getWidth(); i++){
				for(int j = 0; j < image.getHeight(); j++){
					rgbArray[i][j] = new apple();
				}
				}
			
			

			
			
			for(int i = 0; i < image.getWidth(); i++){
				for(int j = 0; j < image.getHeight(); j++){
					Color mycolour = new Color(image.getRGB(i, j));
					
					int red = mycolour.getRed();
					int green = mycolour.getGreen();
					int blue = mycolour.getBlue();
					
					rgbArray[i][j].setVariables(red,green,blue);
					rgbArray[i][j].printout();
					 
					
					
				}
			}
			//System.out.println(rgbArray[0][0].R);
			
		}
		catch(IOException e){System.out.println("There was a problem");}
		//System.out.println(rgbArray[0][0].R);
	}
}





	

