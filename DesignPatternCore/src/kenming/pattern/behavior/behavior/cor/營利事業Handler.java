package kenming.pattern.behavior.behavior.cor;

import kenming.pattern.behavior.behavior.cor.dto.*;

public class 營利事業Handler extends DonateHandler
{
    // realize the 'handleDonate() method'
    public  String handleDonate(Donation donate) 
    		throws DonateExceedException, NullHandlerException
    { 
        String procResult = "";

        if (donate.type == DonateType.營利事業)
        {
            if (donate.money <= 1000000)
            {
                procResult = "Handle Donation by #" + this.getClass().getName()  + "\n";                    
            }
            else
                throw new DonateExceedException("營利事業捐贈政治獻金不得超過法定限額：一百萬");
        }
        else
        {
            // 如果有下一個鏈結的 Hanlder，交給它處理
            if (this.Successor != null)                
                procResult = Successor.handleDonate(donate);                
            else
            {
                throw new NullHandlerException("沒有 Handler 處理這個 Donation !\n" +
                    "原因：" + donate.ext_info);
            }
        }
       
        return procResult;
    }
}
