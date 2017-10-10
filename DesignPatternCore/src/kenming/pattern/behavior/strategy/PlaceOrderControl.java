package kenming.pattern.behavior.strategy;

/// <summary>
/// The 'Client' Class
/// 處理交易的控制類別
/// </summary>
public class PlaceOrderControl
{
  private StrategyContext context;

  // constructor
  public PlaceOrderControl()
  {
      this.context = new StrategyContext();
  }

  // 執行交易策略
  public String ExecuteStrategy(StrategyType type)
  {
      String procResult;

      // TODO: 這一段未來重構(refactor)時應該要交給工廠物件產生
      switch (type)
      {
          case GoldenCross:
              context.SetStrategy(new 黃金交叉Strategy());
              break;
          case RSI:
              context.SetStrategy(new RSI指標Strategy());
              break;
          default:
              procResult = "";	// Empty
              break;
      }
      procResult = context.UpdateOnTick();
      
      return procResult;
  }
}
