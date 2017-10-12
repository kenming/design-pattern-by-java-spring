package kenming.pattern.behavior.observer;

import java.util.*;

/// <summary>
/// The 'ConcreteSubject' class.
/// 新聞發佈者
/// </summary>
public class NewsPublisher implements IPublisher
{
    private List<IObserver> observers;      // 利用 List<T> 儲存所有 Observer (觀察者)
    private String news;                    // 新聞訊息

    // Constructor
    public NewsPublisher()
    {
        observers = new ArrayList<IObserver>();
    }

    // 新增 Observer
    public void Subscribe(IObserver observer)
    {
        observers.add(observer);
    }

    // 移除 Observer
    public void UnSubscribe(IObserver observer)
    {
        observers.remove(observer);
    }

    // 通知 (Notify)所有已訂閱的 Observer 執行更新的操作
    public void Notify()
    {
        for(IObserver o : observers)
        {
            o.Update(news);
        }
    }

    // 發佈新聞
    public void publish(String _news)
    {
        this.news = _news;
        this.Notify();
    }
}