package kenming.pattern.behavior.observer;

/// <summary>
/// The 'Subject' interface
/// </summary>
public interface IPublisher
{
    void Subscribe(IObserver observer);       // The 'Attch()' operation
    void UnSubscribe(IObserver observer);     // The 'Detach()' operation
    void Notify();                            // call the observer to update itself
}
