import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void testGetProductsInformation() {
		List<Product> products = new LinkedList<Product>();
		products.add(new Product("one","Apple_watch","100","100","2","10"));
		
		List<Product> result_Products = new LinkedList<Product>();
		result_Products=Product.getProductsInformation();
		
		assertTrue(result_Products.size()-1==products.size());
		assertTrue(result_Products.get(0).name!=products.get(0).name);
	}
	
	@Test
	void testGetProductsInformationWrongData() {
		List<Product> products = new LinkedList<Product>();
		products.add(new Product("one","Iphone","100","100","2","10"));
		
		List<Product> result_Products = new LinkedList<Product>();
		result_Products=Product.getProductsInformation();
		
		assertFalse(result_Products.size()==products.size());
	
	}

}
