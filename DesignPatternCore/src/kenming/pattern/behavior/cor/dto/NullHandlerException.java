package kenming.pattern.behavior.cor.dto;

//User-defined Exception : 沒有Handler處理的錯誤Exception

public class NullHandlerException extends java.lang.Exception
{
	private static final long serialVersionUID = 1L;
	
	public NullHandlerException() {};
	
	public NullHandlerException(String message) {
		super(message);
	};
}
