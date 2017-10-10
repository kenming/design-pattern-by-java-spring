package kenming.pattern.structure.bridge.dto;

public class Message {
    public String ID;
	public String Recipient;      // 收件人
    public String Subject;         // 主旨
    public String Body;             // 內容    
    
    // Getter & Setter properties
    public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
	public String getRecipient() {
		return Recipient;
	}
	public void setRecipient(String recipient) {
		Recipient = recipient;
	}
	
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	
	public String getBody() {
		return Body;
	}
	public void setBody(String body) {
		Body = body;
	}
}
