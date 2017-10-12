package kenming.pattern.behavior.cor;

import kenming.pattern.behavior.cor.dto.*;

/// <summary>
/// The 'Client' class
/// </summary>
public class procDonateControl
{
    public String procDonation(Donation donate)
    { 
        String procResult = "";
        DonateHandler handler;
        
        handler = this.SetupHandlers();         // Setup all the donation handlers and return the first hander.
        try
        {
            procResult = handler.handleDonate(donate);
        }
        catch (DonateExceedException|NullHandlerException xe)
        {
            procResult = xe.getMessage();
        }

        return procResult;
    }
    
    /// <summary>
    /// 		設定 Donation Concrete Handlers whose extend DonateHandler. 
    /// </summary>
    /// <returns>The first handler instance.</returns>
    private DonateHandler SetupHandlers()
    {
        DonateHandler people, enterprise, organization;
        
        // new all the concreate handlers
        people = new 個人Handler();
        enterprise = new 營利事業Handler();
        organization = new 人民團體Handler();

        // Set the Handler's Successor
        people.Successor = enterprise;
        enterprise.Successor = organization;

        return people;
    }
}
