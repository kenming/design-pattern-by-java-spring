package kenming.pattern.behavior.behavior.cor.dto;

// 政治獻金 Data Type
public class Donation
{
    public String name;
    public DonateType type;			// 個人；營利事業；人民團體；UNKNOWN
    public int money;					// 捐款金額
    public String ext_info;				// 關於捐款相關事宜的備註/摘要
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DonateType getType() {
		return type;
	}
	public void setType(DonateType type) {
		this.type = type;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getExt_info() {
		return ext_info;
	}
	public void setExt_info(String ext_info) {
		this.ext_info = ext_info;
	}
}