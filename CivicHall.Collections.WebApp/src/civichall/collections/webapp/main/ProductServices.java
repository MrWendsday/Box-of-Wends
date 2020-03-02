package civichall.collections.webapp.main;
import java.util.*;

public class ProductServices {

	public static HashMap<Integer, String> productHashMap = new HashMap<>();
	public static ProductServices ps = new ProductServices();
	
	public static void main(String[] args) {
	
		System.out.println("Testing Product Services Class");
		System.out.println();
		createProductService(100, "Fish Oil");
		createProductService(210, "Brownies");
		createProductService(315, "Lasagna");
		System.out.println();
		System.out.println();
		
		int productID = 100;
		String productName = ps.getProduct(productID);
		if (productName != null)
		{
			System.out.println("Product found, Product name at ID: " + productID + " is: " + productName);
		} else {
			System.out.println("Product not found.");
		}		
		System.out.println();
		HashMap<Integer, String> products = ps.getAllProductServices();
		if (products == null ) {
			System.out.println("ERROR: No products available. EMPTY");
		} else {
			System.out.println("PRINT ALL PRODUCTS");
			printProducts(products);
		}
	}
	
	private static void printProducts(HashMap<Integer, String> products) {
		if (products != null) {
			for(Map.Entry<Integer, String> product : productHashMap.entrySet())	
			{
				System.out.println(product.getKey());
				System.out.println(product.getValue());
			}
		}
	}

	private HashMap<Integer, String> getAllProductServices() {
		return productHashMap;
	}

	public String readProductService(int productID) {
		String productName = ps.getProduct(productID);
		return null;
	}
	
	public String getProduct(int productID) {
		String productName = null;
		productName = productHashMap.get(productID);
		return productName;		
	}
	

	public static int addProduct(int idProduct, String productName)
	{
		int result = 0;
		try {
			// add new product to collection.
			productHashMap.put(idProduct, productName);
			result = 1; 
		}
		catch (Exception ex) {
			// handle any errors.
			ex.printStackTrace();
			result = 0;
		}
		finally {
			// do anything after works or not.
		}		
		return result; //result either 1 or 0.
	}
	
	public static int createProductService(int idProduct, String productName)
	{
		int result = 0; // 0 means fail, 1 means succeed.
		result = addProduct(idProduct, productName);
		if (result == 1)
		{
			System.out.printf("Product Saved.\n\r Product ID: %d\r Product Name %s", idProduct, productName);
		}
		else System.err.println("ERROR: 5101. Product not saved.");
		
		return result;
	}

	public  void showAll()
	{
		System.out.println(productHashMap.toString());
	}



}
