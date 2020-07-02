public class Product implements Comparable<Product> {
	private String pName;
	private int pNum;
	
	public Product(String productName, int productNum) {
		this.pName = productName;
		this.pNum = productNum;
	}
	public String getProductName() {
		return pName;
	}
	public int getProductNum() {
		return pNum;
	}

	@Override
	public int compareTo(Product compareProduct) {
		return this.pNum - compareProduct.pNum;
	}
	public String toString() {
		return "productName: " + pName + "productNum: " + pNum;
	}

}
