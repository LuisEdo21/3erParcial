package NuestrasPruebas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import domain.*;
import ui.*;
import workflow.*;

public class Prueba1 {
	Store tienda;
	POST post;
	
	@Before
	public void setUp() throws Exception {
		tienda = new Store();
		post = tienda.getPOST();
	}
	
	@Test
	public void test1() 
	{
		post.EnterItem(1,1);
		post.EnterItem(2,2);
		post.EnterItem(1,1);
		post.endSale();
		post.makePayment(650);
		double feria = post.getSale().getBalance();
		assertTrue(feria==50.0);
	}
}