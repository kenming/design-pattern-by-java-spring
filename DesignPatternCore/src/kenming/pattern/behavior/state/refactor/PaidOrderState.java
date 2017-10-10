package kenming.pattern.behavior.state.refactor;


//實作在 'PAID_ORDER 狀態時所需處理的行為
public class PaidOrderState implements IOrderState
{
	 public String processSomething(OrderStateContext context)
	 {
	     // 回傳處理過程資訊
	     String procResult = "目前狀態：新訂單\n" +
	         "紀錄本關卡的處理過程‧‧‧。\n";
	     
	     //current_state = ORDER_STATE.SHIPPED;       // 設定下一關的狀態
	     context.setState(new ShippedOrderState());
	     
	     procResult = procResult + "轉移至下一關卡狀態為：已出貨\n\n";
	
	     return procResult;
	 }
}