package kenming.pattern.creation.abstractfactory;

import kenming.pattern.creation.abstractfactory.participant.*;

/// <summary>
/// The 'Client' class
/// 工作項目
/// </summary>
public class WorkItem
{
  private String ID;
  private String itemTitle;
  private Participant assignee;
  
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
	public Participant getAssignee() {
		return assignee;
	}
	public void setAssignee(Participant assignee) {
		this.assignee = assignee;
	}
}