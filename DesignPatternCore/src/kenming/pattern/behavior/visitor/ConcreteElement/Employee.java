package kenming.pattern.behavior.visitor.ConcreteElement;

import kenming.pattern.behavior.visitor.*;

/// <summary>
/// The 'ConcreteElement' class.
/// </summary>
public class Employee implements IElement
{
    private String name;           // Employee's name
    private int salary;             // 應領薪資
    //public int vocationDays { set; get; }       // 休假天數

    public Employee() { }   // default Constructor

    // Constructor
    public Employee(String _name, int _salary)
    {
        this.name = _name;
        this.salary = _salary;
        //this.vocationDays = vDays;
    }

    public void Accept(Visitor visitor)
    {
        visitor.VisitEmployee(this);
    }

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}  
}