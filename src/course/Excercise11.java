package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Excercise11 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			
			System.out.println("Product #"+i+" data: ");
			System.out.print("Common, used or imported (c/u/i)?");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				Product prod = new ImportedProduct(name, price, customsFee);
				list.add(prod);
			}else if (ch == 'u') {                                 
				System.out.print("Manufacture date (DD/MM/YYYY):");
				Date manufacture = sdf.parse(sc.next());
				Product prod = new UsedProduct(name, price, manufacture);
				list.add(prod);}else {
				Product prod = new Product(name, price);
				list.add(prod); }
				
			}
			
	 System.out.println();
	 System.out.println("PRICE TAGS");
	 for (Product pro : list ) {
		System.out.println(pro.getName()+pro.priceTag()); }
	sc.close();

	}
	
}
