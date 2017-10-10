package kenming.pattern.behavior.behavior.cor;

import kenming.pattern.behavior.behavior.cor.dto.*;

public class 人民團體Handler extends DonateHandler
{
    // realize the 'handleDonate() method'
    public  String handleDonate(Donation donate) 
    		throws DonateExceedException, NullHandlerException
    { 
        String procResult = "";

        if (donate.type == DonateType.人民團體)
        {
            if (donate.money <= 500000)
            {
                procResult = "Handle Donation by #" + this.getClass().getName()  + "\n";                    
            }
            else
                throw new DonateExceedException("人民團體捐贈政治獻金不得超過法定限額：五十萬");
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
