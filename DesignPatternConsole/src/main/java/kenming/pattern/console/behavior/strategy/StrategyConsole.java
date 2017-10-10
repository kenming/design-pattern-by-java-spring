package kenming.pattern.console.behavior.strategy;

import java.io.IOException;
import java.util.Scanner;

import kenming.pattern.behavior.strategy.*;

public class StrategyConsole {
	
	public static void main(String[] args) throws IOException {		
		// new a control object.
		PlaceOrderControl control = new PlaceOrderControl(); 
		// enum type
		StrategyType stype;		
		// get the user's input
		Scanner inputReader = new Scanner(System.in);
		
		// 選擇交易策略
		System.out.println("選擇執行策略：" + "1: 均線黃金交叉" + "　　2: RSI 指標");
		int sid = inputReader.nextInt();
		if (sid == 1){
			System.out.println("執行策略：均線黃金交叉");
			stype = StrategyType.GoldenCross;
		}else{
			System.out.println("執行策略：RSI 指標");
			stype = StrategyType.RSI;
		}
		
		System.out.println("-------------------------------------");
		
		// 執行策略後的回傳結果
		String proceResult = control.ExecuteStrategy(stype);
		System.out.println("執行結果： \n" + proceResult);
		System.out.println("\n-------------------------------------");
		
		System.out.print("Press '1' then Enter to Exit ....");
		inputReader.nextInt();
		inputReader.close();
	}
}
