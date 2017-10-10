package kenming.pattern.creation.abstractfactory;

import kenming.pattern.creation.abstractfactory.participant.*;

/// <summary>
/// The 'Client' class
/// 工作項目
/// </summary>
public class WorkItem
{
  public String ID;
  public String item_title;
  public Participant assignee;
  
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
	public Participant getAssignee() {
		return assignee;
	}
	public void setAssignee(Participant assignee) {
		this.assignee = assignee;
	}
}