package kenming.pattern.behavior.observer;

/// <summary>
/// The 'Client' class.
/// </summary>
public class ManageNewsControl
{
    // declare a News Publisher (Subject)
    private NewsPublisher publisher;

    // Constructor
    public ManageNewsControl()
    {
        publisher = new NewsPublisher();
    }
    
    // 發佈新聞
    public void 發佈(String news)
    {
        publisher.publish(news);
    }

    // 新增訂閱者 (Observer)
    public void 訂閱(IObserver observer)
    {
        publisher.Subscribe(observer);
    }

    // 移除訂閱者 (Observer)
    public void 取消訂閱(IObserver observer)
    {
        publisher.UnSubscribe(observer);
    }
}
