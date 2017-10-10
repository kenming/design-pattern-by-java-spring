package kenming.pattern.behavior.state;

import kenming.pattern.behavior.state.switchcase.*;
import kenming.pattern.behavior.state.refactor.*;

public class TrackOrderControl
{
    private OrderState_SwitchCase order_state_use_switch;
    private OrderStateContext state_context;

    // constructor
    public TrackOrderControl()
    {
        order_state_use_switch = new OrderState_SwitchCase();
        state_context = new OrderStateContext();
    }

    /// <summary>
    /// 作法一：使用 Switch-Case 的作法處理訂單的狀態
    /// </summary>
    /// <returns></returns>
    public String StampOrder_1()
    {
        String procResult = order_state_use_switch.StampIt();

        return procResult;
    }

    
    /// <summary>
    /// 作法二：使用 State Pattern 設計處理訂單的狀態 (完全消彌掉 Switch-If-then-else)
    /// </summary>
    /// <returns></returns>
    public String StampOrder_2()
    {
        String procResult = state_context.StampIt();

        return procResult;
    }    
}	
