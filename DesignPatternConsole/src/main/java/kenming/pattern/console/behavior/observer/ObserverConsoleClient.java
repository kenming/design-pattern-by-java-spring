package kenming.pattern.console.behavior.observer;

import kenming.pattern.behavior.observer.*;
import kenming.pattern.behavior.observer.ConcreteObserver.*;

import java.io.IOException;
import java.util.Scanner;

public class ObserverConsoleClient {

	public static void main(String[] args) throws IOException {
		 ManageNewsControl control = new ManageNewsControl();            // new a domain controller
		 Scanner inputReader = new Scanner(System.in);
		 
         // UI 是不應該會直接接觸到 Observer 這類的 domain 物件 (違背封裝原則)
         // 正式的作法應該是傳入如 Enum 類型的 Observer 名稱，然後再由 domain controller 依其名稱來建立對應的物件
         IObserver activeMonitor = new ActiveMonitor();
         IObserver 狗仔 = new Reporter();

         System.out.println("新增訂閱者：ActiveMonitor");
         control.訂閱(activeMonitor);
         System.out.println("新增訂閱者：狗仔記者");
         control.訂閱(狗仔);
         System.out.println("--------------------------------------------------------------------------");
         inputReader.nextLine();		//This is needed to pick up the new line
         System.out.println("");
         
         String news1 = "2014/12/10-10:16 － 阿基師與熟女上摩鐵";
         System.out.println("發佈新聞 (Subject)：" + news1);
         System.out.println("--------------------------------------------------------------------------");
         inputReader.nextLine();	
         System.out.println("");

         System.out.println("新聞接收者 (Observers)： ");
         System.out.println("--------------------------------------------------------------------------");
         control.發佈(news1);
         System.out.println("--------------------------------------------------------------------------");
         inputReader.nextLine();	

         System.out.println("");
         System.out.println("取消訂閱：狗仔記者");
         control.取消訂閱(狗仔);
         System.out.println("--------------------------------------------------------------------------");
         inputReader.nextLine();	
         System.out.println("");

         String news2 = "2014/12/10-15:32 － 太陽花女王被壹週刊爆出援交";
         System.out.println("發佈新聞 (Subject)：" + news2);
         System.out.println("--------------------------------------------------------------------------");
         inputReader.nextLine();	
         System.out.println("");

         System.out.println("新聞接收者 (Observers)： ");
         System.out.println("--------------------------------------------------------------------------");
         control.發佈(news2);
         System.out.println("--------------------------------------------------------------------------");
         inputReader.nextLine();	

         System.out.println("\n\n------------------------- The End -------------------------");            
 		System.out.print("Press '1' then Enter to Exit ....");
 		inputReader.nextInt();
 		inputReader.close();
	}
}
