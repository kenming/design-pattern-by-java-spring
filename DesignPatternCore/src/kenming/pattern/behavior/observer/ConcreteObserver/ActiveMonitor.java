package kenming.pattern.behavior.observer.ConcreteObserver;

import kenming.pattern.behavior.observer.*;

/// <summary>
/// The 'ConcreteObserver' class.
/// ActiveMonitor 代表畫面展示 (Console/Windows Form/Web)
/// </summary>
public class ActiveMonitor implements IObserver
{
    public void Update(String news)
    {
        System.out.println("即時監視器 － 新聞快訊：" + news);
    }
}
