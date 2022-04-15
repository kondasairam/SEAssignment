import java.util.LinkedList;
import java.util.List;

public class Warehouse {
	public String warehouse;

	public Warehouse(String warehouse) {
		// TODO Auto-generated constructor stub
		this.warehouse = warehouse;
	}

	public List<Product> listOfProducts;
	
	public static  List<Product> getProductsByWarehouse(String warehouse) {
		List<Product> productByWarehouse1=new LinkedList<>();
		List<Product> productByWarehouse2=new LinkedList<>();
		List<Product> products = Product.getProductsInformation();
		for(int i=0;i<products.size();i++) {
			if(products.get(i).warehouse.equals("one")) {
				productByWarehouse1.add(products.get(i));
			}
			else {
				productByWarehouse2.add(products.get(i));
			}
		}
		if(warehouse.equals("one")) {
			return productByWarehouse1;
		}
		return productByWarehouse2;
	}    
	
	/*
	 * public static void main(String[] args) { List<Product> products =
	 * getProductsByWarehouse("two"); for(int i=0;i<products.size();i++) {
	 * System.out.println(products.get(i).warehouse+" "+products.get(i).name+" "
	 * +products.get(i).quantity); } }
	 */
}
