package kenming.pattern.behavior.behavior.memento;

/// <summary>
/// The 'Memento' Class.
/// </summary>
public class 複合彩Memento
{
    // 實務上是不應該使用 public 操作來存取這些屬性 (properties)
    // 這些屬性資訊，還是應該透過公開的操作介面來取得，如此才得以保護 Memento 物件的封裝性
    private int 彩券號碼;
    private String 字彩;
    
	public int get彩券號碼() {
		return 彩券號碼;
	}
	public void set彩券號碼(int 彩券號碼) {
		this.彩券號碼 = 彩券號碼;
	}
	public String get字彩() {
		return 字彩;
	}
	public void set字彩(String 字彩) {
		this.字彩 = 字彩;
	}
}
