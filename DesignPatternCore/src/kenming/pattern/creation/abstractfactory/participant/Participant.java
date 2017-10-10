package kenming.pattern.creation.abstractfactory.participant;

/// <summary>
/// The root class of Participant.
/// </summary>
public abstract class Participant
{
  public AssigneeType assignType;        // 參與者類型
	public String aggignee_name;           // 參與者名稱

  // Getter & Setter properties
  public String getAggignee_name() {
		return aggignee_name;
	}
	public void setAggignee_name(String aggignee_name) {
		this.aggignee_name = aggignee_name;
	}
	
  public AssigneeType getAssignType() {
		return assignType;
	}
	public void setAssignType(AssigneeType assignType) {
		this.assignType = assignType;
	}	
	
	// 定義處理行為的介面
  public abstract String process();
}
