import java.util.Scanner;
public class Seed {
	static Salesperson s1 = new Salesperson("Joe", "Allen", "108 Church st", "111-222-3333", "11/11/2011", "11/11/2022", "Bob");
	static Salesperson s2 = new Salesperson("Monica", "Bate", "10 Road ln", "444-555-6666", "12/23/2009", "12/23/2022", "Bob");
	static Salesperson s3 = new Salesperson("Jayden", "Lem", "14 Main st", "777-888-9999", "02/03/2003", "02/03/2022", "Bob");
	static Salesperson[] list = {s1, s2, s3};
	static Products p1 = new Products("Box", "Captain Oats", "Modern", 11.00, 11.00, 2, 50.00);
	static Products p2 = new Products("Milk", "Dairy King", "Whole", 5.00, 5.00, 5, 50.00);
	static Products p3 = new Products("Pizza", "Papa Pizza", "Deep", 3.00, 3.00, 10, 50.00);
	static Products[] list1 = {p1, p2, p3};
	static Customer c1 = new Customer("Abe", "All", "1 Main st", "101-101-1010", "01/01/2000");
	static Customer c2 = new Customer("Bella", "Bin", "2 Main st", "202-202-2020", "02/02/2000");
	static Customer c3 = new Customer("Cinder", "Ciel", "3 Main st", "303-303-3030", "03/03/2000");
	static Customer[] list2 = {c1, c2, c3};
	static Sales r1 = new Sales(p1, s1, c1, "01/01/2022");
	static Sales r2 = new Sales(p2, s2, c2, "02/02/2022");
	static Sales r3 = new Sales(p3, s3, c3, "03/03/2022");
	static Sales[] list3 = {r1, r2, r3};
	static Discount d1 = new Discount(p1, "11/03/2022", "11/12/2022", 50);
	static Discount[] list4 = {d1};

	/**
     * method that displays all of the salespersons.
     * @return salespersons
     */
	public static void getSalespersons() {
		for (int i = 0; i < list.length; i++) {
			System.out.println(i + 1 + " " + list[i]);
		}
		System.out.println();
	}
	/**
     * method that displays a salesperson.
     * @param s the inputted first name of the salesperson wanted
     * @return salesperson
     */
	public static void getSalesperson(String s) {
		for (int i = 0; i < list.length; i++) {
			if (s.equalsIgnoreCase(list[i].getFirstName())) {
				System.out.println(list[i]);
			}
		}
		System.out.println();
	}
	/**
     * method that displays all of the products.
     * @return products
     */
	public static void getProducts() {
		for (int i = 0; i < list1.length; i++) {
			System.out.println(i + 1 + " " + list1[i]);
		}
		System.out.println();
	}
	/**
     * method that displays a product.
     * @param s the inputted name of the product wanted
     * @return product
     */
	public static void getProduct(String s) {
		for (int i = 0; i < list1.length; i++) {
			if (s.equalsIgnoreCase(list1[i].getName())) {
				System.out.println(list1[i]);
			}
		}
		System.out.println();
	}
	/**
     * method that displays all of the customers.
     * @return customers
     */
	public static void getCustomers() {
		for (int i = 0; i < list2.length; i++) {
			System.out.println(i + 1 + " " + list2[i]);
		}
		System.out.println();
	}
	/**
     * method that displays a customer.
     * @param s the inputted first name of the customer wanted
     * @return customer
     */
	public static void getCustomer(String s) {
		for (int i = 0; i < list2.length; i++) {
			if (s.equalsIgnoreCase(list2[i].getFirstName())) {
				System.out.println(list2[i]);
			}
		}
		System.out.println();
	}
	/**
     * method that displays all of the sales.
     * @return sales
     */
	public static void getSales() {
		for (int i = 0; i < list3.length; i++) {
			System.out.println(i + 1 + " " + list3[i]);
		}
		System.out.println();
	}
	/**
     * method that displays all of the discounts.
     * @return discounts
     */
	public static void getDiscounts() {
		for (int i = 0; i < list4.length; i++) {
			System.out.println(i + 1 + " " + list4[i]);
		}
		System.out.println();
	}
	/**
     * Method that creates a saleperson.
     * @param f the inputted first name
     * @param l the inputted last name
     * @param a the inputted address
     * @param p the inputted phone
     * @param sd the inputted start date
     * @param td the inputted termination date
     * @param m the inputted manager
     */
	public static void createSalesperson(String f, String l, String a, String p, String sd, String td, String m) {
		Salesperson s4 = new Salesperson(f, l, a, p, sd, td, m);
		for (int j = 0; j < list.length; j++) {
			if (!(s4.equals(list[j]))) {
				Salesperson[] temp = new Salesperson[list.length + 1];
				for (int i = 0; i < list.length; i++) {
					temp[i] = list[i];
				}
				temp[temp.length - 1] = s4;
				list = temp;
				break;
			}
		}
	}
	/**
     * Method that creates a product.
     * @param n the inputted name
     * @param m the inputted manufacturer
     * @param s the inputted style
     * @param p the inputted purchasePrice
     * @param sp the inputted salePrice
     * @param q the inputted qtyOnHand
     * @param c the inputted commissionPercentage
     */
	public static void createProduct(String n, String m, String s, double p, double sp, int q, double c) {
		Products p4 = new Products(n, m, s, p, sp, q, c);
		for (int j = 0; j < list1.length; j++) {
			if (!(p4.equals(list1[j]))) {
				Products[] temp = new Products[list1.length + 1];
				for (int i = 0; i < list1.length; i++) {
					temp[i] = list1[i];
				}
				temp[temp.length - 1] = p4;
				list1 = temp;
				break;
			}
		}
	}
	/**
     * Method that creates a customer.
     * @param f the inputted first name
     * @param l the inputted last name
     * @param a the inputted address
     * @param p the inputted phone
     * @param sd the inputted start date
     */
	public static void createCustomer(String f, String l, String a, String p, String sd) {
		Customer c4 = new Customer(f, l, a, p, sd);
		for (int j = 0; j < list2.length; j++) {
			if (!(c4.equals(list2[j]))) {
				Customer[] temp = new Customer[list2.length + 1];
				for (int i = 0; i < list2.length; i++) {
					temp[i] = list2[i];
				}
				temp[temp.length - 1] = c4;
				list2 = temp;
				break;
			}
		}
	}
	/**
     * Method that creates a sale.
     * @param p the inputted product
     * @param s the inputted salesperson
     * @param c the inputted customer
     * @param sd the inputted sales date
     */
	public static void createSale(Products p, Salesperson s, Customer c, String d) {
		Sales r4 = new Sales(p, s, c, d);
		Sales[] temp = new Sales[list3.length + 1];
		for (int i = 0; i < list3.length; i++) {
			temp[i] = list3[i];
		}
		temp[temp.length - 1] = r4;
		list3 = temp;
	}
	/**
     * Method that creates a discount.
     * @param p the inputted product
     * @param b the inputted begin date
     * @param e the inputted end date
     * @param d the inputted discount percentage
     */
	public static void createDiscount(Products p, String b, String e, double d) {
		Discount d4 = new Discount(p, b, e, d);
		for (int j = 0; j < list4.length; j++) {
			if (!(d4.equals(list4[j]))) {
				Discount[] temp = new Discount[list4.length + 1];
				for (int i = 0; i < list4.length; i++) {
					temp[i] = list4[i];
				}
				temp[temp.length - 1] = d4;
				list4 = temp;
				break;
			}
		}
	}
	/**
     * Method that updates a salesperson.
     * @param s the inputted salesperson
     * @param answer the inputted action of the user
     */
	public static void updateSalespersons(Salesperson s, String answer) {
		Scanner input = new Scanner(System.in);
		String temp = "";
		switch (Integer.valueOf(answer)) {
			case 1:
				System.out.print("Enter the updated first name: ");
				temp = input.next();
				temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);
				s.setFirstName(temp);
				break;
			case 2:
				System.out.print("Enter the updated last name: ");
				temp = input.nextLine();
				temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);
				s.setLastName(temp);
				break;
			case 3:
				System.out.print("Enter the updated address: ");
				temp = input.nextLine();
				s.setAddress(temp);
				break;
			case 4:
				System.out.print("Enter the updated phone: ");
				temp = input.nextLine();
				s.setPhone(temp);
				break;
			case 5:
				System.out.print("Enter the updated start date: ");
				temp = input.nextLine();
				s.setStartDate(temp);
				break;
			case 6:
				System.out.print("Enter the updated termination date: ");
				temp = input.nextLine();
				s.setTerminationDate(temp);
				break;
			case 7:
				System.out.print("Enter the updated manager: ");
				temp = input.nextLine();
				temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);
				s.setManager(temp);
				break;
			default:
				System.out.println("Invalid Input");
		}
	}
	/**
     * Method that updates a product.
     * @param s the inputted product
     * @param answer the inputted action of the user
     */
	public static void updateProducts(Products s, String answer) {
		Scanner input = new Scanner(System.in);
		String temp = "";
		double val = 0;
		switch (Integer.valueOf(answer)) {
			case 1:
				System.out.print("Enter the updated name: ");
				temp = input.next();
				temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);
				s.setName(temp);
				break;
			case 2:
				System.out.print("Enter the updated manufacturer: ");
				temp = input.nextLine();
				temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);
				s.setManufacturer(temp);
				break;
			case 3:
				System.out.print("Enter the updated style: ");
				temp = input.nextLine();
				temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);
				s.setStyle(temp);
				break;
			case 4:
				System.out.print("Enter the updated purchase price: ");
				val = input.nextDouble();
				s.setPurchasePrice(val);
				break;
			case 5:
				System.out.print("Enter the updated sale price: ");
				val = input.nextDouble();
				s.setSalePrice(val);
				break;
			case 6:
				System.out.print("Enter the updated qty on hand: ");
				val = input.nextInt();
				s.setQtyOnHand((int) val);
				break;
			case 7:
				System.out.print("Enter the updated commission percentage: ");
				val = input.nextDouble();
				s.setCommissionPercentage(val);
				break;
			default:
				System.out.println("Invalid Input");
		}
	}
	/**
     * Method that displays the commission of each salesperson.
     */
	public static void displayCommission() {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i].getFirstName() + " " + list[i].getLastName() + "'s Commission: $" + String.format("%.2f", list[i].getCommission()));
			System.out.println();
		}
	}
	/**
     * Method that displays the available commands for changing a salesperson.
     */
	public static void salespersonsCommands() {
		System.out.println("Enter \"1\" to update first name of the salesperson");
		System.out.println("Enter \"2\" to update last name of the salesperson");
		System.out.println("Enter \"3\" to update address of the salesperson");
		System.out.println("Enter \"4\" to update phone of the salesperson");
		System.out.println("Enter \"5\" to update start date of the salesperson");
		System.out.println("Enter \"6\" to update termination date of the salesperson");
		System.out.println("Enter \"7\" to update manager of the salesperson");
	}
	/**
     * Method that displays the available commands for changing a product.
     */
	public static void productCommands() {
		System.out.println("Enter \"1\" to update name of the product");
		System.out.println("Enter \"2\" to update manufacturer of the product");
		System.out.println("Enter \"3\" to update style of the product");
		System.out.println("Enter \"4\" to update purchase price of the product");
		System.out.println("Enter \"5\" to update sale price of the product");
		System.out.println("Enter \"6\" to update qty on hand of the product");
		System.out.println("Enter \"7\" to update commission percentage of the product");
	}
	/**
     * Method that gets a salesperson.
     * @param s the inputted first name of the salesperson
     * @return salesperson
     */
	public static Salesperson getPerson(String s) {
		for (int i = 0; i < list.length; i++) {
			if (s.equalsIgnoreCase(list[i].getFirstName())) {
				return list[i];
			}
		}
		return null;
	}
	/**
     * Method that gets a product.
     * @param s the inputted name of the product
     * @return product
     */
	public static Products getProd(String s) {
		for (int i = 0; i < list1.length; i++) {
			if (s.equalsIgnoreCase(list1[i].getName())) {
				return list1[i];
			}
		}
		return null;
	}
	/**
     * Method that gets a customer.
     * @param s the inputted first name of the customer
     * @return customer
     */
	public static Customer getCust(String s) {
		for (int i = 0; i < list2.length; i++) {
			if (s.equalsIgnoreCase(list2[i].getFirstName())) {
				return list2[i];
			}
		}
		return null;
	}
}