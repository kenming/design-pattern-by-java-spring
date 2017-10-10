package kenming.pattern.behavior.state.refactor;

//實作在 'FINISHED_ORDER 狀態時所需處理的行為
public class FINISHEDOrderState implements IOrderState
{
	 public String processSomething(OrderStateContext context)
	 {
	     // 回傳處理過程資訊
	     String procResult = "目前狀態：已完成訂單\n" +
	         "紀錄本關卡的處理過程‧‧‧。\n";
	     
	     procResult = procResult + "實作上應該把已完成訂單的狀態設定為關閉 (CLOSED)\n\n";
	
	     return procResult;
	 }
}
