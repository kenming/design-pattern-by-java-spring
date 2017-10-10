package kenming.pattern.structure.bridge;
import kenming.pattern.structure.bridge.dto.*;

/// <summary>
/// The 'Bridge/Implementor' interface
/// 負責所關聯 Abstraction 類別定義 function 的實作行為的介面定義
/// 註：一個 Abstraction 所定義的 function，可能需一至多個 Bridge 介面所定義的 function 來實現
/// </summary>
public interface IMessageSender {
    /// <summary>
    /// 傳送訊息的行為定義
    /// </summary>
    /// <param name="message"> Message(訊息)物件</param>
    /// <returns>傳送結果</returns>
    String  SendMessage(Message message);

    /// <summary>
    /// 對訊息內容編碼行為的定義
    /// 此為想像上的需求，目的在於呈現 Abstraction 主體的行為(本例為 notify)，可能會需由 1到多個 實作行為完成
    /// </summary>
    /// <param name="messageBody">訊息內容</param>
    /// <returns>取得編碼後的訊息內容</returns>
    String  編碼(String messageBody);
}
