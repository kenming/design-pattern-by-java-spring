package kenming.pattern.structure.proxy;

/// <summary>
/// The 'Subject' interface
/// 提供所出售烏龜相關服務的介面定義
/// 龜庫 = Tortoise Library Information Provider
/// </summary>
public interface I龜庫接口
{
  /// <summary>
  /// 提供烏龜認證的資訊
  /// </summary>
  /// <param name="品種">賣出烏龜的品種</param>
  /// /// <param name="序號">賣出烏龜的序號</param>
  /// <returns>認證資訊</returns>
	
  String Get認證資訊(String 品種, String 序號);
}
