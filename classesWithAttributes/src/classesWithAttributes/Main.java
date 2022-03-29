package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		 
		Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 3);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		productManager.Add2(2, "", "", 2, 200);
		
		System.out.println(product.getCode());
	}

}
