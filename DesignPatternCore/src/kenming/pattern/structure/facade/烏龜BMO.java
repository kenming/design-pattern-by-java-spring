package kenming.pattern.structure.facade;

import kenming.pattern.structure.facade.dto.*;

// BMO = Business Management Object
// 負責關於烏龜商品的商務邏輯處理與運算
public class 烏龜BMO
{
    public ShoppingCart proc訂購資訊(ShoppingCart cart)
    {
        int total = 0;
        
        for (烏龜商品 item : cart.getCartList())
        {
            total = total + (item.getPrice() * item.getQuantity());
        }

        // Todo:
        // 實作應有相關於 eCoupon 的處理邏輯︰這裡僅示範簡單的商業邏輯處理
        if (cart.geteCoupon() == "1688")
            cart.setTotalPrice((int)(total * 0.9));      //九折優惠
        else
        	cart.setTotalPrice(total);

        return cart;
    }
}
