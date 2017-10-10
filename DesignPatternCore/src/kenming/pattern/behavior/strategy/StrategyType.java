package kenming.pattern.behavior.strategy;

public enum StrategyType
{
    GoldenCross("黃金交叉"),        // 黃金交叉買賣策略
    RSI ("RSI 指標");              	     // RSI 指標買賣策略
	
    private String strategyType;
    
    private StrategyType(String strategyName) {
        this.strategyType = strategyName;
    }
 
    public String getStrategyType() {
        return this.strategyType;
    }
}