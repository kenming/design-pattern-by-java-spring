package kenming.pattern.behavior.visitor.ConcreteVisitor;

import kenming.pattern.behavior.visitor.*;
import kenming.pattern.behavior.visitor.ConcreteElement.*;

/// <summary>
/// The 'ConcreteVisitor' class.
/// 計算公司每月固定支出費用 (針對員工薪資與辦公室開銷費用)
/// </summary>
public class PricingVisitor extends Visitor
{
    private int totalPrice;         // 總支出費用

    public void VisitEmployee(Employee emp)
    {
        totalPrice += emp.getSalary();    // 累加所有員工薪資
    }

    public void VisitOffice(Office office)
    {
        totalPrice += office.get支出費用();      // 累加所有辦公室費用
    }

    public int getTotalPrice()
    {
        return this.totalPrice;
    }
}