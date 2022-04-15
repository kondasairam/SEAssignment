import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class InvoiceTest {

	@Test
	void testGetInvoiceDetails() {
		List<Invoice> invoices = new LinkedList<Invoice>();
		invoices.add(new Invoice("ABCD",new Product(" ","Iphone","100"," ","2","10"),"200","04/15/2022","04/152023"));
		
		List<Invoice> result_Invoices = new LinkedList<Invoice>();
		result_Invoices=Invoice.getInvoiceDetails();
		
		assertTrue(result_Invoices.size()==invoices.size());
	}
	
	@Test
	void testGetInvoiceByInvoiceId() {
		List<Invoice> invoices = new LinkedList<Invoice>();
		invoices.add(new Invoice("345",new Product(" ","Iphone","100"," ","2","10"),"200","04/15/2022","04/152023"));
		
		List<Invoice> result_Invoices = new LinkedList<Invoice>();
		result_Invoices=Invoice.getInvoiceByInvoiceId("345");
		
		assertTrue(result_Invoices.size()>0);
	}
	
	@Test
	void testGetInvoiceByInvoiceIdnotFound() {
		
		List<Invoice> result_Invoices = new LinkedList<Invoice>();
		result_Invoices=Invoice.getInvoiceByInvoiceId("ABCD");
		
		assertTrue(result_Invoices.size()==0);
	}
	

}
