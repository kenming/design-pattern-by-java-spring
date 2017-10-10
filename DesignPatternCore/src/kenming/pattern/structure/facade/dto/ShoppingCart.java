package kenming.pattern.structure.facade.dto;

import java.util.*;

public class ShoppingCart {
	private List<烏龜商品> cartList;
	private String eCoupon;		// 折扣代碼
	private int totalPrice;			// 購買總價
	public List<烏龜商品> getCartList() {
		return cartList;
	}
	
	public void setCartList(List<烏龜商品> cartList) {
		this.cartList = cartList;
	}
	public String geteCoupon() {
		return eCoupon;
	}
	public void seteCoupon(String eCoupon) {
		this.eCoupon = eCoupon;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
