package kenming.pattern.structure.facade;

import java.util.*;
import kenming.pattern.structure.facade.dto.*;

public class 買烏龜Control {
	
	public List<烏龜商品> list烏龜清單()
	{
		return this.getItems();
	}
	
    public ShoppingCart 確認訂購資訊(ShoppingCart cart)
    {
        烏龜BMO bmo = new 烏龜BMO();
        cart = bmo.proc訂購資訊(cart);

        return cart;
    }
    
    public boolean save訂購交易(ShoppingCart cart)
    {
        // Todo:
        // 交由 DAO (Data Access Object) 物件，並透 Spring Hibernate 將本次訂購商品交易儲存至資料庫

        return true;
    }
	
    /*
     *  實作時，會交由如 DAO (Data Access Object) 物件，並透過如 Spring Hibernate 從資料庫系統取得資料。         
     */
    private List<烏龜商品> getItems()
    {
        List<烏龜商品> list = new ArrayList<烏龜商品>();
        烏龜商品 item1, item2, item3;

        item1 = new 烏龜商品();
        item1.setId("001");
        item1.setName("粉圓龜");
        item1.setPrice(3000);

        item2 = new 烏龜商品();
        item2.setId("002");
        item2.setName("金錢龜");
        item2.setPrice(6000);

        item3 = new 烏龜商品();
        item3.setId("003");
        item3.setName("象龜");
        item3.setPrice(168000);

        list.add(item1);
        list.add(item2);
        list.add(item3);

        return list;
    }
}
