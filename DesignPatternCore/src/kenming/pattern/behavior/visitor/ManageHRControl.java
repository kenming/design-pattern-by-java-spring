package kenming.pattern.behavior.visitor;

import java.util.*;

import kenming.pattern.behavior.visitor.ConcreteElement.*;
import kenming.pattern.behavior.visitor.ConcreteVisitor.*;

/// <summary>
/// The 'Client' Class.
/// 操作兩類 Visitor：計算公司每月所有開銷費用，以及公司資產總數
/// </summary>
public class ManageHRControl
{
    private PricingVisitor _pricingVisitor;				 // 計算每月開銷費用的 Visitor
    private InventoryVisitor _inventoryVisitor;		// 計算公司資產的 Visitor

    private int empTotalSalary;            // 所有員工總應付薪資
    private int officeTotalExpense;      // 所有辦公室總開銷費用
    private int totalEmployees;            // 員工總數
    private int totalOffices;					// 辦公室總數
   
    // Constructor
    public ManageHRControl()
    {
        _pricingVisitor = new PricingVisitor();
        _inventoryVisitor = new InventoryVisitor();
    }

    public String calc公司每月固定支出()
    {
        String result = "本月資產支出明細報表：\n" +
                        "================================\n\n";

        result += this.get員工薪資明細() + "\n\n";
        result += this.getOffice開銷明細();
        result += "\n\n\n" +
                  "所有開銷費用總計： " + Integer.toString(empTotalSalary + officeTotalExpense);
                    
        return result;
    }

    private String get員工薪資明細()
    {
        String salaryDetail = "";

        List<Employee> employees = this.getEmployees();

        for(Employee e : employees)
        {
            e.Accept(_pricingVisitor);
            salaryDetail += e.getClass().getName() + "： " + e.getName() + " ,應付薪資：" + Integer.toString(e.getSalary())+ "\n";
        }

        salaryDetail += "-----------------------------------------------------\n";
        salaryDetail += "本月應付員工總薪資為： " + Integer.toString(_pricingVisitor.getTotalPrice()) + "\n\n";
        salaryDetail += "================================";

        empTotalSalary = _pricingVisitor.getTotalPrice();

        return salaryDetail;
    }
   
    private String getOffice開銷明細()
    {
        String expenseDetail = "";

        List<Office> offices = this.getOffices();

        for(Office o : offices)
        {
            o.Accept(_pricingVisitor);
            expenseDetail += o.getClass().getName() + "： " + o.getName() + " ,開銷費用：" + Integer.toString(o.get支出費用())+ "\n";
        }

        officeTotalExpense = _pricingVisitor.getTotalPrice() - empTotalSalary;

        expenseDetail += "-----------------------------------------------------\n";
        expenseDetail += "本月所有辦公室開銷費用為： " + Integer.toString(officeTotalExpense) + "\n\n";
        expenseDetail += "================================";

        return expenseDetail;
    }


    // 統計公司資產。包括員工人數、辦公室數目等。
    public String calce公司資產總數()
    {
        String result = "本公司所有資產 (員工、辦公司)統計：\n" +
                        "================================\n\n";

        result += this.get員工人數() + "\n\n" +
            this.getOffice數目();

        return result;
    }

    private String get員工人數()
    {
        String empDetail = "";

        List<Employee> employees = this.getEmployees();

        for(Employee e : employees)
        {
            e.Accept(_inventoryVisitor);
            empDetail += e.getClass().getName() + "： " + e.getName() + "\n";
        }

        totalEmployees = _inventoryVisitor.getTotalInstances();
        empDetail += "-----------------------------------------------------\n";
        empDetail += "員工總人數： " + Integer.toString(totalEmployees) + "\n\n";
        empDetail += "================================";
        
        return empDetail;
    }

    private String getOffice數目()
    {
        String officeDetail = "";

        List<Office> offices = this.getOffices();

        for(Office o : offices)
        {
            o.Accept(_inventoryVisitor);
            officeDetail += o.getClass().getName()+ "： " + o.getName() + "\n";
        }

        totalOffices = _inventoryVisitor.getTotalInstances() - totalEmployees;
        officeDetail += "-----------------------------------------------------\n";
        officeDetail += "辦公室總數： " + Integer.toString(totalOffices)+ "\n\n";
        officeDetail += "================================";

        return officeDetail;
    }

    // 使用 List<T> 當為 in-memory 的儲庫 (repository)
    private List<Employee> getEmployees()
    {
        List<Employee> empList = new ArrayList<Employee>();

        empList.add(new Clerk("鳥哥", 36000));
        empList.add(new Clerk("阿天", 32000));
        empList.add(new Clerk("尚青", 46000));
        empList.add(new Manager("班森", 78000));
        empList.add(new Manager("棒棒伯", 88000));

        return empList;
    }

    // 使用 List<T> 當為 in-memory 的儲庫 (repository)
    private List<Office> getOffices()
    {
        List<Office> officeList = new ArrayList<Office>();

        officeList.add(new Office("101大樓88F88室", 240000));
        officeList.add(new Office("烘爐地資訊室", 68000));

        return officeList;
    }
}