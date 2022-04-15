import java.util.LinkedList;
import java.util.List;

public class Invoice {
   public String invoiceId;
   public Product product;
   public String invoiceAmount;
   public String purchasedate;
   public String expirationDate;
   
   public Invoice(String invoiceId, Product product, String invoiceAmount,String purchasedate,String expirationDate) {
	this.invoiceId = invoiceId;
	this.product = product;
	this.invoiceAmount = invoiceAmount;
	this.purchasedate = purchasedate;
	this.expirationDate = expirationDate;
   }

   
   public static List<Invoice> getInvoiceDetails(){
	   ExtractingDataFromCSV extractingDataFromCSV = new ExtractingDataFromCSV();
	   List<String[]> data = extractingDataFromCSV.getData("InvoiceDetails.csv");
	   List<Invoice> invoices = new LinkedList<>();
	   for(int i=0;i<data.size();i++) {
		   invoices.add(new Invoice(data.get(i)[0],new Product(" ",data.get(i)[1],data.get(i)[2]," ",data.get(i)[3]),data.get(i)[5],data.get(i)[6],data.get(i)[7]));
	   }
	   return invoices;
   }
   
   public static List<Invoice> getInvoiceByInvoiceId(String invoiceId){
	   List<Invoice> invoices = getInvoiceDetails();
	   List<Invoice> result = new LinkedList<>();
	   for(int i=0;i<invoices.size();i++) {
		   if(invoiceId.equalsIgnoreCase(invoices.get(i).invoiceId)) {
			   result.add(invoices.get(i));
		   }
	   }
	   return result;
   }
	/*
	 * public static void main(String[] args) { List<Invoice> invoices =
	 * getInvoiceByInvoiceId("ABCD"); for(int i=0;i<invoices.size();i++) {
	 * System.out.println(invoices.get(i).invoiceId+" "+invoices.get(i).product.name
	 * ); } }
	 */
}
