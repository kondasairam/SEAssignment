import java.util.LinkedList;
import java.util.List;

public class Product extends Warehouse{
      public String name;
      public String sellingPrice;
      public String costPrice;
      public String quantity;
      
      public Product(String warehouse,String name, String sellingPrice, String costPrice, String quantity) {
    	super(warehouse);
		this.name = name;
		this.sellingPrice = sellingPrice;
		this.costPrice = costPrice;
		this.quantity = quantity;
	}
      
	public static List<Product> getProductsInformation(){
    	  ExtractingDataFromCSV extractingDataFromCSV = new ExtractingDataFromCSV();
    	  List<String[]> data = extractingDataFromCSV.getData("ProductDetails.csv");
    	  List<Product> products = new LinkedList<Product>();
    	  for(int i=1;i<data.size();i++) {
    		  products.add(new Product(data.get(i)[0],data.get(i)[1],data.get(i)[2],data.get(i)[3],data.get(i)[4]));
    	  }
    	  return products;
      } 
		
		/*
		 * public static void main(String[] args) { List<Product> products =
		 * getProductsInformation(); for(int i=0;i<products.size();i++) {
		 * System.out.println(products.get(i).name+" "+products.get(i).costPrice); }
		 * 
		 * }
		 */
		 
}
