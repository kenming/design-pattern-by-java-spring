package kenming.pattern.behavior.strategy;

/// <summary>
/// The 'Strategy' Interface
/// 制訂交易策略的共同介面
/// </summary>
public interface IStrategy
{
  // 執行策略的操作
  String execute();
}
