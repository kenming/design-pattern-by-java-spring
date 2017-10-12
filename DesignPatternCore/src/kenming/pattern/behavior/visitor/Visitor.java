package kenming.pattern.behavior.visitor;

import kenming.pattern.behavior.visitor.ConcreteElement.*;

/// <summary>
/// The 'Visitor' abstract class.
/// </summary>
public abstract class Visitor
{
    // 需要針對每一個物件結構內的元素，定義相對應的操作
    public abstract void VisitEmployee(Employee emp);
    public abstract void VisitOffice(Office office);
}
