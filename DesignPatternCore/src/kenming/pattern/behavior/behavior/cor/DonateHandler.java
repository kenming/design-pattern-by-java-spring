package kenming.pattern.behavior.behavior.cor;

import kenming.pattern.behavior.behavior.cor.dto.*;

/// <summary>
///		The 'Handler' abstract class.
/// </summary>
public abstract class DonateHandler
{
	 // abstract method, 關於捐贈的邏輯處理，由 extend 的 Handler 實現
    public abstract String handleDonate(Donation donate)
    		throws DonateExceedException, NullHandlerException;
    public DonateHandler Successor;		// 指向下一個 Handler
    
    public void SetHandlers(DonateHandler _successor)
    {  }

	public DonateHandler getSuccessor() {
		return Successor;
	}

	public void setSuccessor(DonateHandler successor) {
		Successor = successor;
	}
}