import java.util.Scanner;
public class Client {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int action = 0;
		String act = "";
		String act1 = "";
		String act2 = "";

		System.out.println("List of salespersons: ");
		Seed.getSalespersons();

		System.out.print("Enter the first name of the salesperson you want to update: ");
		act = input.next();
		System.out.println("Enter what you would like to update in a saleperson: ");
		Seed.salespersonsCommands();
		action = input.nextInt();
		Seed.updateSalespersons(Seed.getPerson(act), String.valueOf(action));
		System.out.print("Enter the first name of the salesperson you want to see: ");
		act = input.next();
		Seed.getSalesperson(act);

		System.out.println("List of Applicable Discounts: ");
		Seed.getDiscounts();

		System.out.println("List of products: ");
		Seed.getProducts();

		System.out.print("Enter the name of the product you want to update: ");
		act = input.next();
		System.out.println("Enter what you would like to update in a product: ");
		Seed.productCommands();
		action = input.nextInt();
		Seed.updateProducts(Seed.getProd(act), String.valueOf(action));
		System.out.print("Enter the name of the product you want to see: ");
		act = input.next();
		Seed.getProduct(act);

		System.out.println("List of Customers: ");
		Seed.getCustomers();

		System.out.println("List of Sales: ");
		Seed.getSales();

		System.out.println("It's time to create a sale!");
		System.out.print("Enter the name of the product: ");
		act = input.next();
		System.out.print("Enter the first name of the salesperson: ");
		act1 = input.next();
		System.out.print("Enter the first name of the customer: ");
		act2 = input.next();
		Seed.createSale(Seed.getProd(act), Seed.getPerson(act1), Seed.getCust(act2), "12/12/2012");
		System.out.println("List of Sales aftering adding one: ");
		Seed.getSales();

		System.out.println("Quarterly salesperson commission report: ");
		Seed.displayCommission();
	}
}