package kenming.pattern.behavior.visitor.ConcreteVisitor;

import kenming.pattern.behavior.visitor.*;
import kenming.pattern.behavior.visitor.ConcreteElement.*;

/// <summary>
/// The 'ConcreteVisitor' class.
/// 統計公司資產總數 (員工人數與辦公室數目)
/// </summary>
public class InventoryVisitor extends Visitor
{
    private int totalInstances;     // 公司資產總數

    public void VisitEmployee(Employee emp)
    {
        totalInstances++;       // 累計員工人數
    }

    public void VisitOffice(Office office)
    {
        totalInstances++;       // 累計辦公室數目
    }

    public int getTotalInstances()
    {
        return totalInstances;
    }
}