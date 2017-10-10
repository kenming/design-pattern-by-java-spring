package kenming.pattern.behavior.behavior.cor.dto;

// User-defined Exception : 政治獻金超出法定限額
public class DonateExceedException extends java.lang.Exception
{
	private static final long serialVersionUID = 1L;
	
	public DonateExceedException()
	{}
	
	public DonateExceedException(String message)
	{
		super(message);
	}
}
