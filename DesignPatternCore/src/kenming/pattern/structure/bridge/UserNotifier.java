package kenming.pattern.structure.bridge;
import kenming.pattern.structure.bridge.dto.*;

public class UserNotifier extends Notifier
{
    /// <summary>
    /// 實現 Notify 處理的程序
    /// </summary>
    /// <param name="message">Message 物件</param>
    /// <returns>處理結果</returns>
    public String Notify(Message message)
    {
        String procResult;       // 處理結果

        // 1. 將訊息傳送給所指定的收件人
        procResult = sender.SendMessage(message);

        return procResult;
    }
}
