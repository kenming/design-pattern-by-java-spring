package kenming.pattern.mvc.behavior.state;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import kenming.pattern.behavior.state.*;

@Controller
@RequestMapping("/state")
public class StateController {
	
	private TrackOrderControl control;
	
	public StateController()
	{
		control = new  TrackOrderControl();
	}
  
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView Index() { 
    	
    	ModelAndView map = new ModelAndView("behavior/state/TrackOrderForm");

        return map;
    }
    
    @RequestMapping(value = "/stamp" , method = RequestMethod.POST)
    public ModelAndView Stamp(ModelMap model) { 
    	
    	// Todo: Not yet implement the session state handling
    	String procMessage = control.StampOrder_1();			// 第一版作法
    	// String procMessage = control.StampOrder_2();		// 重構後作法
    	
    	ModelAndView map = new ModelAndView("behavior/state/TrackOrderForm");
    	model.addAttribute("procMessage", procMessage);

        return map;
    }
 } 
