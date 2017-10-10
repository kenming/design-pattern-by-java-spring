package kenming.pattern.creation.abstractfactory;

import kenming.pattern.creation.abstractfactory.participant.*;

public class WorkItemDTO
{
    public String ID;
    public String item_title;			// 項目名稱
    public AssigneeType assign_type;	// 指派者類型
    public String assignee_name;		// 指派者名稱
    
    // Getter & Setter properties
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getItem_title() {
		return item_title;
	}
	public void setItem_title(String item_title) {
		this.item_title = item_title;
	}
	public AssigneeType getAssign_type() {
		return assign_type;
	}
	public void setAssign_type(AssigneeType assign_type) {
		this.assign_type = assign_type;
	}
	public String getAssignee_name() {
		return assignee_name;
	}
	public void setAssignee_name(String assignee_name) {
		this.assignee_name = assignee_name;
	}       
}