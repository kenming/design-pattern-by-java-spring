package kenming.pattern.behavior.visitor.ConcreteElement;

import kenming.pattern.behavior.visitor.*;

public class Office implements IElement
{       
    // 包括租金、水電費、辦公用具等採購費用
    // 此為簡化；實作應有 calc支出費用() 計算邏輯函數
    private int 支出費用;
    private String name;  // 辦公室名稱

	// Constructor
    public Office(String _name, int expense)
    {
        this.支出費用 = expense;
        this.name = _name;
    }
    
    public int get支出費用() {
		return 支出費用;
	}

	public String getName() {
		return name;
	}

    // realize the 'Accept()' operation.
    public void Accept(Visitor visitor)
    {
        visitor.VisitOffice(this);
    }
}