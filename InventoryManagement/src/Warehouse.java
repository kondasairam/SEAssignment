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
			if(products.get(i).warehouse.equals("1")) {
				productByWarehouse1.add(products.get(i));
			}
			else {
				productByWarehouse2.add(products.get(i));
			}
		}
		if(warehouse.equals("1")) {
			return productByWarehouse1;
		}
		else if(warehouse.equals("2")) {
			return productByWarehouse2;
		}
		return null;
	}    
	
	public static  List<Product> getProductslesserthanfive(String warehouse) {
		List<Product> productByWarehouse1=new LinkedList<>();
		List<Product> productByWarehouse2=new LinkedList<>();
		List<Product> products = Product.getProductsInformation();
		for(int i=0;i<products.size();i++) {
			if(products.get(i).warehouse.equals("1") && (Integer.parseInt(products.get(i).quantity)<5)) {
				productByWarehouse1.add(products.get(i));
			}
			else if(products.get(i).warehouse.equals("2") && (Integer.parseInt(products.get(i).quantity)<5)){
				productByWarehouse2.add(products.get(i));
			}
		}
		if(warehouse.equals("1")) {
			return productByWarehouse1;
		}
		else if(warehouse.equals("2")) {
			return productByWarehouse2;
		}
		return null;
	}    
}
