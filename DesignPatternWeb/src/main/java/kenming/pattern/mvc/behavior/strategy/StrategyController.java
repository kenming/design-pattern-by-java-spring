package kenming.pattern.mvc.behavior.strategy;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import kenming.pattern.behavior.strategy.*;
import kenming.pattern.mvc.behavior.strategy.model.*;

@Controller
@RequestMapping("/strategy")
public class StrategyController {
	
	private PlaceOrderControl control;
	
	public StrategyController()
	{
		control = new  PlaceOrderControl();
	}
  
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView Index() { 

    	ModelAndView map = new ModelAndView("behavior/strategy/PlaceStrategyForm");
    	map.addObject("strategyModel", new StrategyForm());
    	
    	return map;
    }
    
    @RequestMapping(value = "/Execute" , method = RequestMethod.POST)
    public ModelAndView Execute(@ModelAttribute("strategyModel")StrategyForm strategyForm, Model model) { 

    	ModelAndView map = new ModelAndView("behavior/strategy/result");    	
    	String result = control.ExecuteStrategy(strategyForm.getStrategyType());
    	result = result.replaceAll("(\r\n|\n\r|\r|\n)", "<br />");
    	model.addAttribute("resultInfo", result);

        return map;
    }
}
