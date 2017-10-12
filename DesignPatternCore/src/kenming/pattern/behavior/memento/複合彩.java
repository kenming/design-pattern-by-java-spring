package kenming.pattern.behavior.memento;

/// <summary>
/// The 'Originator' Class.
/// </summary>
public class 複合彩
{
    private int 彩券號碼;							// 兩位數 00~99
    private String 字彩;							// 四字成語
    private String _其它屬性;					// 為表達封裝性，該屬性並不需要讓外界直接操作存取
    
    // 自動選號。目前以亂數產生，但可以搭配更多的策略來產生選號的結果
    public int 選號()
    {
        int num = (int)(Math.random()*100);
        return num;
    }

    // 設定 (還原)原來選號的狀態
    public void SetMemento(複合彩Memento memento)
    {
        this.彩券號碼 = memento.get彩券號碼();
        this.字彩 = memento.get字彩();
    }

    // 建立 (儲存) 選號的狀態
    public 複合彩Memento CreateMemento()
    { 
    	複合彩Memento memento = new 複合彩Memento();
    	memento.set彩券號碼(this.彩券號碼);
    	memento.set字彩(this.字彩);
    	
    	return memento;
    }

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
