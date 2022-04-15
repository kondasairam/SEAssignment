import java.util.List;

public class Customer{
      public Customer(String invoiceId, List<String> product) {
		this.invoiceId = invoiceId;
		this.product = product;
	}
  	public String invoiceId;
    public List<String> product;
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public List<String> getProduct() {
		return product;
	}
	public void setProduct(List<String> product) {
		this.product = product;
	}
	
	public static List<Invoice> getInvoiceForCustomer(String invoiceId) {
		// TODO Auto-generated method stub
		List<Invoice> invoices = Invoice.getInvoiceByInvoiceId(invoiceId);
    	return invoices;
	}

}