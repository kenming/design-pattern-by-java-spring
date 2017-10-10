package kenming.pattern.behavior.state.refactor;

//實作在 'NEW_ORDER 狀態時所需處理的行為
public class NewOrderState implements IOrderState
{
	 public String processSomething(OrderStateContext context)
	 {
	     // 回傳處理過程資訊
	     String procResult = "目前狀態：新訂單成立中‧‧‧\n" +
	         "紀錄本關卡的處理過程‧‧‧。\n";
	     
	     //current_state = ORDER_STATE.PAID;       // 設定下一關的狀態
	     context.setState(new PaidOrderState());
	     
	     procResult = procResult + "轉移至下一關卡狀態為：已付款";
	
	     return procResult;            
	 }
}