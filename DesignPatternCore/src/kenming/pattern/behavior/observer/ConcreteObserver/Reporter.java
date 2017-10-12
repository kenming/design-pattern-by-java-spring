package kenming.pattern.behavior.observer.ConcreteObserver;

import kenming.pattern.behavior.observer.*;

/// <summary>
/// The 'ConcreteObserver' class.
/// Reporter 代表接收的新聞記者
/// </summary>
public class Reporter implements IObserver
{
    public void Update(String news)
    {   
        /// 實作上，系統需主動將新聞訊息 Push (推播) 至 所訂閱記者的行動裝置內 (如 Line)
        System.out.println("記者接收 － 新聞快訊 － ：" + news);
    }
}
