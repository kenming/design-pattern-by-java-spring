package kenming.pattern.behavior.state.switchcase;

public class OrderState_SwitchCase {

	public enum ORDER_STATE
    { 
        NEW_ORDER,      // 新訂單
        PAID,           		  // 已付款
        SHIPPED,        	      // 已出貨
        FINISHED             // 已完成
    }
	
	private ORDER_STATE current_state;      // initial state
	
    // constructor
    public OrderState_SwitchCase()
    {
        // assign the new order's state as 'NEW_ORDER'
        current_state = ORDER_STATE.NEW_ORDER;
    }
    
    // 依據訂單的狀態處理並簽署該狀態下的執行情形
    public String StampIt()
    {
    	String procResult="";			// 處理結果
    	
        switch (current_state)
        { 
            case NEW_ORDER:
                procResult = this.processNewOrder();
                break;
            case PAID:
            	procResult = this.processPayment();
                break;
            case SHIPPED:
            	procResult = this.processShipment();    
                break;
            case FINISHED:
            	procResult = this.processFinish();
                break;
            default :
            	procResult = "";	// 傳回空字串，代表無法處理未知的狀態。
            	break;
        }
        
        return procResult;
    }    
    
    // 處理新訂單並設定下一關的狀態
    private String processNewOrder()
    {
        // 回傳處理過程資訊
        String procResult = "目前狀態：新訂單成立中‧‧‧\n" +
            "紀錄本關卡的處理過程‧‧‧。\n";
        current_state = ORDER_STATE.PAID;       // 設定下一關的狀態
        procResult = procResult + "轉移至下一關卡狀態為：已付款";

        return procResult;
    }
    
    // 處理已付款訂單並設定下一關的狀態
    private String processPayment()
    {
        // 回傳處理過程資訊
        String procResult = "目前狀態：新訂單\n" +
            "紀錄本關卡的處理過程‧‧‧。\n";
        current_state = ORDER_STATE.SHIPPED;       // 設定下一關的狀態
        procResult = procResult + "轉移至下一關卡狀態為：已出貨\n\n";

        return procResult;
    }

    // 處理已出貨訂單並設定下一關的狀態
    private String processShipment()
    {
        // 回傳處理過程資訊
        String procResult = "目前狀態：已付款\n" +
            "紀錄本關卡的處理過程‧‧‧。\n";
        current_state = ORDER_STATE.FINISHED;       // 設定下一關的狀態
        procResult = procResult + "轉移至下一關卡狀態為：已完成\n\n";

        return procResult;
    }

    // 處理已完成訂單並設定狀態為 '完成'
    private String processFinish()
    {
        // 回傳處理過程資訊
        String procResult = "目前狀態：已完成訂單\n" +
            "紀錄本關卡的處理過程‧‧‧。\n";            
        procResult = procResult + "實作上應該把已完成訂單的狀態設定為關閉 (CLOSED)\n\n";

        return procResult;
    }
}
