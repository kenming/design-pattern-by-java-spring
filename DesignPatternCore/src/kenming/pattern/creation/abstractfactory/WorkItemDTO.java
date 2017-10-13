package kenming.pattern.creation.abstractfactory;

import kenming.pattern.creation.abstractfactory.participant.*;

public class WorkItemDTO
{
    private String ID;
    private String itemTitle;						// 項目名稱
    private AssigneeType assignType;		// 指派者類型
    private String assigneeName;				// 指派者名稱
    
    // Getter & Setter properties
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getItemTitle() {
		return itemTitle;
	}
	public void setItemTitle(String item_title) {
		this.itemTitle = item_title;
	}
	public AssigneeType getAssignType() {
		return assignType;
	}
	public void setAssignType(AssigneeType assign_type) {
		this.assignType = assign_type;
	}
	public String getAssigneeName() {
		return assigneeName;
	}
	public void setAssigneeName(String assignee_name) {
		this.assigneeName = assignee_name;
	}       
}