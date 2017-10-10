package kenming.pattern.console.state;

import kenming.pattern.behavior.state.*;

public class StateConsole {
	
	public static void main(String[] args) {
		TrackOrderControl control = new TrackOrderControl();
		String procResult = "";
				
		// 模擬第一關執行人員執行簽署動作
		PressKey("第一關執行人員：【簽署按鍵】");
		procResult = control.StampOrder_2();			
		System.out.println(procResult + "\n");

		// 模擬第二關執行人員執行簽署動作
		procResult = "";
		PressKey("第二關執行人員：【簽署按鍵】");
		procResult = control.StampOrder_2();			
		System.out.println(procResult);
		
		// 模擬第三關執行人員執行簽署動作
		procResult = "";
		PressKey("第三關執行人員：【簽署按鍵】");
		procResult = control.StampOrder_2();			
		System.out.println(procResult);
		
		// 模擬第四關執行人員執行簽署動作
		procResult = "";
		PressKey("第四關執行人員：【簽署按鍵】");
		procResult = control.StampOrder_2();			
		System.out.println(procResult);			
	}
	
	@SuppressWarnings("resource")
	static void PressKey(String msg)
	{
		System.out.println(msg);
        new java.util.Scanner(System.in).nextLine();
	}
}
