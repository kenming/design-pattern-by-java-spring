package kenming.pattern.structure.adapter;

import java.util.*;
import kenming.pattern.structure.adapter.dto.*;
import kenming.pattern.structure.adapter.供應商系統.*;

// Realize the IGet存貨資訊 Interface
public class Get存貨Adapter implements IGet存貨資訊
{
    public List<烏龜商品> get存貨清單()
    {
        OrderSystem mOrder = new OrderSystem();     // 建立對外部供應商系統的參考
        List<烏龜商品> aProdList = new ArrayList<烏龜商品>();

        // 從外部系統取得產品清單
        // TODO: 實務應實作如何取得遠端系統的協定, 介面, 參數, 回傳值
        String[][] mOrders = mOrder.get產品清單();

        // A供應商系統的回傳格式為2維字串陣列，因本系統以 List 為回傳值，故需實作轉型的工作
        for(String[] product  : mOrders)
        {
            烏龜商品 aProd = new 烏龜商品();

            aProd.setId(product[0]);;
            aProd.setName(product[1]);
            aProd.setPrice(Integer.parseInt(product[2]));
            aProd.setQuantity(Integer.parseInt(product[3]));

            // 將轉型後的烏龜商品資訊新增至 List 集合
            aProdList.add(aProd);
        }

        return aProdList;
    }
}
