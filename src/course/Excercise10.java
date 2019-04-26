package course;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.Client;
import entities_enums.*;

public class Excercise10 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		Order order = new Order(new Date(), status, client);
		//Order order = new Order(moment, OrderStatus.DELIVERED, new Client(name, email, dt));
		
		
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i = 0; i< n; i++) {
			System.out.println("Enter #"+i+" item data:  ");
			
			System.out.print("Product name:");
			String productName = sc.next();

			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int productQtd = sc.nextInt();
			//item = new OrderItem(productQtd, productPrice, new Product(productName,productPrice));
			
		
		}
		
		
		//System.out.println("ORDER SUMMARY:");
		//System.out.print("Order moment: " + moment );
		//System.out.print("Order status: " + order.getStatus());
		//System.out.print("Client: "+ name +" - "+dt 	);
		//System.out.println("Order Items:");
		//System.out.println();

		System.out.println("ORDER SUMMARY:");

		System.out.println(order);

		
	
		
		
		
		sc.close();
		

	}

}
