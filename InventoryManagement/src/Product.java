import java.util.LinkedList;
import java.util.List;

public class Product extends Warehouse{
      public String name;
      public String sellingPrice;
      public String costPrice;
      public String quantity;
      public String tax;
      
      public Product(String warehouse,String name, String sellingPrice, String costPrice, String quantity, String tax) {
    	super(warehouse);
		this.name = name;
		this.sellingPrice = sellingPrice;
		this.costPrice = costPrice;
		this.quantity = quantity;
		this.tax = tax;
	}
    
      
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSellingPrice() {
		return sellingPrice;
	}


	public void setSellingPrice(String sellingPrice) {
		this.sellingPrice = sellingPrice;
	}


	public String getCostPrice() {
		return costPrice;
	}


	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	public String getTax() {
		return tax;
	}


	public void setTax(String tax) {
		this.tax = tax;
	}


	public static List<Product> getProductsInformation(){
    	  ExtractingDataFromCSV extractingDataFromCSV = new ExtractingDataFromCSV();
    	  List<String[]> data = extractingDataFromCSV.getData("ProductDetails.csv");
    	  List<Product> products = new LinkedList<Product>();
    	  for(int i=1;i<data.size();i++) {
    		  products.add(new Product(data.get(i)[0],data.get(i)[1],data.get(i)[2],data.get(i)[3],data.get(i)[4],data.get(i)[5]));
    	  }
    	  return products;
      } 
		 
}
