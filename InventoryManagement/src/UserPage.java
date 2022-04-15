import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UserPage {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("What role are you? Owner or Customer");
	 System.out.println("Select one from the menu\n1:-> Owner\n2:-> customer");
	 String str=sc.nextLine();
	 if(str.equalsIgnoreCase("1")) {
		 System.out.println("Hello Admin!!!!\n1:-> Inventory_lookup\n2:->Invoice");
		 str=sc.nextLine();
		 if(str.equalsIgnoreCase("1")) {
			 System.out.println("which warehouse you are looking for:\n1:->Warehouse_1\n2:->Warehouse_2");
			 str=sc.nextLine();
			 System.out.println("-----------------------------Inventory Details for Warehouse "+str+"-----------------------------");
			 List<Product> products = Owner.inventoryLookup(str);
			 System.out.println("Name  Cost  Quantity");
			 for(int i=0;i<products.size();i++) {
				System.out.println(products.get(i).name+"  "+products.get(i).sellingPrice+"  "+products.get(i).quantity);
			 }
		 }
		 else if(str.equalsIgnoreCase("2")) {
              System.out.println("Select:\n 1:->create_invoice\n2:->get_invoice");
              str=sc.nextLine();
              if(str.equals("2")) {
     			 System.out.println("Enter the Invoice Id");
    			 str=sc.nextLine();
    			 System.out.println("--------------------------Invoice for the Invoice Id--------------------------");
    			 List<Invoice> invoices = Owner.getInvoice(str);
    			 int i;
    			 if(invoices.size()>0) {
    				 System.out.println("Invoice id:"+invoices.get(0).invoiceId+"    "+"Date:"+invoices.get(0).purchasedate);
    			 }
    			 for(i=0;i<invoices.size();i++) {
    				 System.out.println("Product Name:"+invoices.get(i).product.name+"   "+invoices.get(i).product.sellingPrice+"   "+invoices.get(i).product.quantity+"   "+invoices.get(i).expirationDate+"   "+invoices.get(i).invoiceAmount);
    			 }
              }
              else if(str.equals("1")) {
            	  System.out.println("Enter the Invoice Id");
            	  String invoiceId = sc.nextLine();
            	  System.out.println("Enter Product Name");
            	  String productname = sc.nextLine();
            	  System.out.println("Enter Product selling price");
            	  int productprice = sc.nextInt();
            	  System.out.println("Enter Product quantity");
            	  int productquantity = sc.nextInt();
            	  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                  Date date = new Date();    
                  String purchaseDate=formatter.format(date);
                  Calendar c = Calendar.getInstance();
              	try{
              	   //Setting the date to the given date
              	   c.setTime(formatter.parse(purchaseDate));
              	}catch(ParseException e){
              		e.printStackTrace();
              	 }
              	   
              	//Number of Days to add
              	c.add(Calendar.DAY_OF_MONTH, 365);
              	String expirationDate = formatter.format(c.getTime());  
            		List<List<String>> rows = Arrays.asList(
            			    Arrays.asList(invoiceId, productname,Integer.toString(productprice),Integer.toString(productquantity),Integer.toString(10),Integer.toString(productquantity*productprice),purchaseDate,expirationDate)
            			);
            		try {
						FileWriter csvWriter = new FileWriter("..//InvoiceDetails.csv");
						for (List<String> rowData : rows) {
	            		    csvWriter.append(String.join(",", rowData));
	            		    csvWriter.append("\n");
	            		}
						csvWriter.flush();
						csvWriter.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            		
              }
		 }
	 }

 }
}
