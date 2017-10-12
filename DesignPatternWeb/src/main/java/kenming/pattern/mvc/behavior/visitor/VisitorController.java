package kenming.pattern.mvc.behavior.visitor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import kenming.pattern.behavior.visitor.*;

@Controller
@RequestMapping("/visitor")
public class VisitorController {
	
	private ManageHRControl control;
	
	public VisitorController()
	{
		control = new  ManageHRControl ();
	}
  
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView Index() { 

    	ModelAndView map = new ModelAndView("behavior/visitor/ReportForm");
    	//map.addObject("donateModel", new Donation());
    	
    	return map;
    }
    
    @RequestMapping(value = "/Execute/{argument}", method = RequestMethod.GET)
    public ModelAndView Execute(@PathVariable("argument") String argument, Model model) { 

    	ModelAndView map = new ModelAndView("behavior/visitor/result"); 
    	
    	String result;
    	if (argument.equalsIgnoreCase("CalcTotalPrice"))    		
    		result = control.calc公司每月固定支出();
    	else
    		if (argument.equals("CalcInventory"))
    			result = control.calce公司資產總數();
    		else
    			result = argument;
    	
    	result = result.replaceAll("(\r\n|\n\r|\r|\n)", "<br />");
    	model.addAttribute("resultInfo", result);

        return map;
    }
}
