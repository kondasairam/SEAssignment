import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testGetInvoiceByForCustomer() {
		List<Invoice> invoices = new LinkedList<Invoice>();
		invoices.add(new Invoice("345",new Product(" ","Iphone","100"," ","2","10"),"200","04/15/2022","04/152023"));
		
		List<Invoice> result_Invoices = new LinkedList<Invoice>();
		result_Invoices=Invoice.getInvoiceByInvoiceId("345");
		
		assertTrue(result_Invoices.size()>0);
	}

}
