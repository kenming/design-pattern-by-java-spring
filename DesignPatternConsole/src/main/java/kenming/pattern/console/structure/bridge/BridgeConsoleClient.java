package kenming.pattern.console.structure.bridge;

import kenming.pattern.structure.bridge.*;
import kenming.pattern.structure.bridge.dto.*;
import java.io.IOException;
import java.util.Scanner;

public class BridgeConsoleClient {

	public static void main(String[] args) throws IOException {
		傳送訊息Control control = new 傳送訊息Control();
		Types.NotifyType notifytype;		// NotifyType enum
		Types.SenderType sendertype;		// SenderType enum
		Message message = new Message();
		Scanner inputReader = new Scanner(System.in);
		
		// 1.選擇通知 (Notifier)類別
		System.out.println("選擇通知類別：" + "1: 使用者訊息" + "　　2: 系統訊息");
		int notifyno = inputReader.nextInt();
		if (notifyno == 1){
			System.out.println("通知類型：使用者訊息");
			notifytype = Types.NotifyType.User;
		}else{
			System.out.println("通知類型：系統訊息");
			notifytype = Types.NotifyType.System;
		}
		
		System.out.println("-------------------------------------");
		
		// 2.選擇傳送類型
		System.out.println("選擇傳送類型：" + "1: Email" + "　　2: Line");
		int senderno = inputReader.nextInt();
		if (senderno == 1){
			System.out.println("傳送類型：Email");
			sendertype = Types.SenderType.Email;
		}else{
			System.out.println("傳送類型：Line");
			sendertype = Types.SenderType.Line;
		}
				
		System.out.println("-------------------------------------");
		inputReader.nextLine();		//This is needed to pick up the new line
				
		// 3.收件人
		System.out.print("收件人： ");
		String recipant = inputReader.nextLine();
		message.Recipient = recipant;		        	
		System.out.println("\n-------------------------------------");		
				
		// 4.主旨
		System.out.print("主旨： ");
		String subject = inputReader.nextLine();
		message.Subject = subject;		
		System.out.println("\n-------------------------------------");
		
		
		// 5.內容
		System.out.print("內容： ");
		String content = inputReader.nextLine();
		message.Body = content;
		System.out.println("\n-------------------------------------");

		// 回傳執行結果
		String proceResult = control.Notify(notifytype, sendertype, message);
		System.out.println("執行結果： \n" + proceResult);
		System.out.println("\n-------------------------------------");
		
		System.out.print("Press '1' then Enter to Exit ....");
		inputReader.nextInt();
		inputReader.close();
	}
}