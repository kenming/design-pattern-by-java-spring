package kenming.pattern.structure.facade.test;

import java.util.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import kenming.pattern.structure.facade.*;
import kenming.pattern.structure.facade.dto.*;

public class 買烏龜ControlTest {

	private 買烏龜Control control;
	
	@Before
	public void setUp() throws Exception {
		control = new 買烏龜Control();
	}

	@Test
	public void testList烏龜清單() {
		String expected = "001,粉圓龜,3000";
		String actual;
		
		烏龜商品 firstTurtle = control.list烏龜清單().get(0);
		actual = firstTurtle.getId() + "," + firstTurtle.getName() + "," + String.valueOf(firstTurtle.getPrice());
		
		// 斷言比對
		assertEquals(expected, actual);
	}

	@Test
	public void testShoppingNoDiscount() {
		int expected = 174000;
		int actual;
		
		ShoppingCart cart = this.emulateShoppingNoDiscount();
		actual = cart.getTotalPrice();
		
		// 斷言比對
		assertEquals(expected, actual);
	}
	
	@Test
	public void testShoppingwithCoupon() {
		int expected = 156600;
		int actual;
		
		ShoppingCart cart = this.emulateShoppingwithCoupon();
		actual = cart.getTotalPrice();
		
		// 斷言比對
		assertEquals(expected, actual);
	}
	
	private ShoppingCart emulateShoppingNoDiscount() {
		ShoppingCart cart = new ShoppingCart();
		
		List<烏龜商品> list = this.getShoppingList();
        cart.setCartList(list);
        烏龜BMO bmo = new 烏龜BMO();
        cart = bmo.proc訂購資訊(cart);
		
		return cart;
	}
	
	private ShoppingCart emulateShoppingwithCoupon() {
		ShoppingCart cart = new ShoppingCart();
		
		List<烏龜商品> list = this.getShoppingList();
        cart.setCartList(list);
        cart.seteCoupon("1688");
        烏龜BMO bmo = new 烏龜BMO();
        cart = bmo.proc訂購資訊(cart);
		
		return cart;
	}
	
	private List<烏龜商品> getShoppingList(){
		List<烏龜商品> list = new ArrayList<烏龜商品>();
        烏龜商品 item1, item2;

        item1 = new 烏龜商品();
        item1.setId("001");
        item1.setName("粉圓龜");
        item1.setPrice(3000);
        item1.setQuantity(2);

        item2 = new 烏龜商品();
        item2.setId("003");
        item2.setName("象龜");
        item2.setPrice(168000);
        item2.setQuantity(1);
        
        list.add(item1);
        list.add(item2);
        
        return list;
	}
}
