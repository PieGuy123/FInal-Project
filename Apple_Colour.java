import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Apple_Colour {

	class apple{
		int R = 0;
		int G = 0;
		int B = 0;
		
	public void setVariables(int R1, int G1, int B1){
		R= R1;
		G = G1;
		B = B1;
		System.out.println("worked");
	}
	public void initialize(){
		R = 0;
		G = 0;
		B = 0;
	}
	public apple(int SR, int SG, int SB){
		R = SR;
		G = SG;
		B = SB;
	}
	
	}
	
	
	
	
	
	//@SuppressWarnings("null")		//not exactly sure what this does????
	public static void main(String[] args) {
		apple testThing = null;
		testThing.initialize();
		testThing.setVariables(0, 0, 0);
		
		
		
		
		try{
			String FileName = "red.png";
			BufferedImage image = ImageIO.read(new File(FileName));
			apple rgbArray[][] = new apple[image.getWidth()][image.getHeight()];
			
			//testThing.setVariables(0, 0, 0);
			
			
			for(int i = 0; i < image.getWidth(); i++){
				for(int j = 0; j < image.getHeight(); j++){
					Color mycolour = new Color(image.getRGB(i, j));
					
					int red = mycolour.getRed();
					int green = mycolour.getGreen();
					 int blue = mycolour.getBlue();
					//rgbArray[i][j].setR(temp); 
					//testThing.setVariables(red, green, blue);
					
					//rgbArray[i][j].R = mycolour.getRed();
					//rgbArray[i][j].G = mycolour.getGreen();
					//rgbArray[i][j].B = mycolour.getBlue();
					
					
					//System.out.println("R= " + mycolour.getRed());
					//System.out.println("B= " + mycolour.getGreen());
					//System.out.println("G= " + mycolour.getBlue());
					
				}
			}
			System.out.println(rgbArray[0][0].R);
			
		}
		catch(IOException e){System.out.println("There was a problem");}
		//System.out.println(rgbArray[0][0].R);
	}

}

