package kenming.pattern.console.structure.proxy;

import java.io.IOException;
import java.util.Scanner;

import kenming.pattern.structure.proxy.*;

public class 販售烏龜Console {

	public static void main(String[] args) throws IOException {
		
		// new a control object.
		販售服務Control control = new 販售服務Control();
		// declare variables
		String m品種; String m序號;		
		// get the user's input
		Scanner inputReader = new Scanner(System.in);
		
		// 1.選擇烏龜品種
		System.out.println("選擇烏龜品種：" + "1: 陸龜" + "　　2: 澤龜" + "　　3: 象龜");
		int id = inputReader.nextInt();
		switch (id) {
            case 1:
            	m品種 = "陸龜";
                break;
            case 2:
            	m品種 = "澤龜";
                break;
            case 3:
            	m品種 = "象龜";
                break;            	
            default:
            	m品種 = "";	// Empty
                break;
        }		
		System.out.println("所選擇的烏龜品種：" + m品種);	
		System.out.println("-------------------------------------");
		inputReader.nextLine();		//This is needed to pick up the new line
		
		// 2.輸入序號
		System.out.print("請輸入序號： ");
		m序號 = inputReader.nextLine();        	
		System.out.println("\n-------------------------------------");
		
		// 回傳執行結果
		String proceResult = control.get認證資訊(m品種, m序號);
		System.out.println("執行結果： \n" + proceResult);
		System.out.println("\n-------------------------------------");
		
		System.out.print("Press '1' then Enter to Exit ....");
		inputReader.nextInt();
		inputReader.close();						
	}
}
