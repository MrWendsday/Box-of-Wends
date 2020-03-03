package civichall.collections.webapp.main;

public interface productSizeDAOinterface {
	
	public int addProductSize(ProductSize ps); // return 0 = fail, return 1 = succeed.
	/*
	 * addProductSize takes a parameter ProductSize and adds it to the ProductSize HashMap
	 */
	public ProductSize getProductSize(int id); // return productSize found.
	public int removeProductSize(int id); // return 0 = fail, return 1 = succeed.
	public void updateProductSIze(int id, ProductSize newPS); // return 0 = fail, return 1 = succeed. 

}
