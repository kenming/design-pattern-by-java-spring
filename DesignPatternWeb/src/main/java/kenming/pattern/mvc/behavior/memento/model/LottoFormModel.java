package kenming.pattern.mvc.behavior.memento.model;

import java.util.*;

// 複合彩投注表單 Model 
public class LottoFormModel {
	private int lottonum;		// 選注號
	private List<String> idiom;		// 字彩成語
	
	public int getLottonum() {
		return lottonum;
	}
	public void setLottonum(int lottonum) {
		this.lottonum = lottonum;
	}
	public List<String> getIdiom() {
		return idiom;
	}
	public void setIdiom(List<String> idiom) {
		this.idiom = idiom;
	}
}