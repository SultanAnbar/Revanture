package mypakage;

public class staticNonStatic {

	String name;  // Global instance variable
	double price;
	private static float discount = 5.5f;   //Global class variable
	
	public static void main(String[] args) {
		
		staticNonStatic product1 = new staticNonStatic();
		product1.name = "Television";
		product1.price = 67.89;
		
		discount = 7.2f;
		staticNonStatic product2 = new staticNonStatic();
		product2.name = "Washing Machine";
		product2.price = 69.89;
		
		System.out.println("Printing product 1");
		product1.printProduct();
		
		
		System.out.println("Printing product 2");
		product2.printProduct();

	}
	
	public void printProduct() {
		System.out.println("Product Name: "+ name);
		System.out.println("Product Price: "+ price);
		System.out.println("Product Discount: "+ discount);
	}

}
