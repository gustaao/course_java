package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Excersice5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangule width and height");
		Rectangle rectangle = new Rectangle();
		
		rectangle.height = sc.nextDouble();
		rectangle.width  = sc.nextDouble();
		System.out.println(rectangle);
		
		
		sc.close();
		

	}

}
