package kenming.pattern.structure.proxy;

/// <summary>
/// The 'Client' class
/// 提供烏龜販售服務 Controller
/// </summary>
public class 販售服務Control
{
  // 取得來自 Form Controller 所輸入欲查詢烏龜認證的參數
  public String get認證資訊(String m品種, String m序號)
  {
      // new a proxy class which realize the subject interface
      I龜庫接口 subject = new 龜庫Proxy();

      // via the proxy object to get the result.
      String 認證結果 = subject.Get認證資訊(m品種, m序號);

      return 認證結果;
  }
}
