package kenming.pattern.behavior.visitor;

/// <summary>
/// The 'Element' interface.
/// </summary>
public interface IElement
{
    // 同意讓 Visitor 進入，以進行後續的操作
    void Accept(Visitor visitor);
}
