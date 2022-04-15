import java.util.List;

public class Owner {
    public String userName;
    public String password;
    
	public Owner(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
	public static List<Product> inventoryLookup(String warehouse) {
		List<Product> products = Warehouse.getProductsByWarehouse(warehouse);
		return products;
	}
	public static List<Invoice> getInvoiceForOwner(String invoiceId) {
		// TODO Auto-generated method stub
		List<Invoice> invoices = Invoice.getInvoiceByInvoiceId(invoiceId);
    	return invoices;
	}
	public static List<Product> getProductsLessThan5(String warehouse){
		List<Product> products = Warehouse.getProductslesserthanfive(warehouse);
		return products;
	}
	
}
