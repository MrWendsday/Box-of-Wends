package civichall.collections.webapp.main;

import java.util.HashMap;

public class ProductSizeDAO implements productSizeDAOinterface {

	static HashMap<Integer, String> productSizeHashMap = new HashMap<>();
	public static void main(String[] args) {
		
	}
	
	@Override
	public int addProductSize(ProductSize ps) {
		int result = -1;
		try {
		productSizeHashMap.put(ps.getId(), ps.getSize());
		}
		catch (Exception ex){
			result = 0;
		}		
		return 0;
	}

	@Override
	public ProductSize getProductSize(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int removeProductSize(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateProductSIze(int id, ProductSize newPS) {
		// TODO Auto-generated method stub

	}

}
