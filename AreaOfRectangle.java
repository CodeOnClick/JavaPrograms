import java.util.Scanner;

public class AreaOfRectangle{
	private static Scanner sc;

	public static void main(String[] args) {
		double width, height; 
		sc = new Scanner(System.in);
		
		System.out.println("Enter the Width of a Rectangle =  ");
		width = sc.nextDouble();
		System.out.println("Enter the Height of a Rectangle = ");
		height = sc.nextDouble();

		AreaofRectangle(width, height);
	}
	
	public static void AreaofRectangle( double width, double height ) {
		double Area; 
		
		Area = width * height;

		System.out.format("\n The Area of a Rectangle = %.2f\n",Area);
	}
}
