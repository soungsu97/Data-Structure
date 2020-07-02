import java.util.Arrays;

public class SortProductObject { 

	   public static void main(String[] args) {

	       Product[] product = new Product[3];
	       product[0] = new Product("S", 11);
	       product[1] = new Product("A", 13);
	       product[2] = new Product("B", 10);             

	       System.out.println("[CompareTo sort productNum]");
	       Arrays.sort(product);
	       printProduct(product);          

	       System.out.println("[Compare sort prouctName]");
	       Arrays.sort(product, new ProductNameComparator());
	       printProduct(product);
	       }      

	   public static void printProduct(Product[] product) {

	       for(Product product1 : product)
	       System.out.println(product1); 
	   }
	}