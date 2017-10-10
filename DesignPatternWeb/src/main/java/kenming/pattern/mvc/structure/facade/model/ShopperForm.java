package kenming.pattern.mvc.structure.facade.model;

import java.util.*;
import kenming.pattern.structure.facade.dto.*;

// Hold Shopping Form Data
public class ShopperForm {
	private List<烏龜商品> shoppingList;
	private int totalPrice;
	private String coupon;
	
	public List<烏龜商品> getShoppingList() {
		return shoppingList;
	}
	public void setShoppingList(List<烏龜商品> shoppingList) {
		this.shoppingList = shoppingList;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getCoupon() {
		return coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
}
