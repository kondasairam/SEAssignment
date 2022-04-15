import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class WarehouseTest {

	@Test
	void testGetProductsByWarehouse() {
		int size=1;
		String warehouse="1";
		
		List<Product> productByWarehouse=new LinkedList<>();
		productByWarehouse=Warehouse.getProductsByWarehouse(warehouse);
		
		assertTrue(productByWarehouse.size()==size);
	}
	
	@Test
	void testGetProductsByWrongWarehouse() {
		int size=0;
		String warehouse="3";
		
		List<Product> productByWarehouse=new LinkedList<>();
		productByWarehouse=Warehouse.getProductsByWarehouse(warehouse);
		
		assertTrue(productByWarehouse==null);
	}
	
	@Test
	void testGetProductslesserthanfive() {
		int size=0;
		String warehouse="1";
		
		List<Product> productByWarehouse=new LinkedList<>();
		productByWarehouse=Warehouse.getProductsByWarehouse(warehouse);
		
		assertTrue(productByWarehouse.size()==1);
	}
	
	@Test
	void testGetProductslesserthanfiveInvalid() {
		int size=0;
		String warehouse="3";
		
		List<Product> productByWarehouse=new LinkedList<>();
		productByWarehouse=Warehouse.getProductsByWarehouse(warehouse);
		
		assertTrue(productByWarehouse==null);
	}
	

}
