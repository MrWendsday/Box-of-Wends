package civichall.collections.webapp.main;
import java.util.*;

public class SizeService {

	HashMap<Integer, String> sizeHashMap = new HashMap<>();
	
	public static void main(String[] args) {
		SizeService ss = new SizeService();
		ProductSize productSize = new ProductSize(1, "A");
		
		int result = ss.createSizeService(productSize);
		if (result == -1) {
			System.out.println("Saved");
		} else System.out.println("ERROR");
		System.out.println();
		
		
	}

	public static int createSizeService(ProductSize productSize) {
		int result = 0;	
		ProductSizeDAO psd = new ProductSizeDAO();
		return result = psd.addProductSize(productSize);
	}

}
