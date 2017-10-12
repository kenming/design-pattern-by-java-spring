package kenming.pattern.mvc.structure.adapter;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import kenming.pattern.structure.adapter.*;

@Controller
@RequestMapping("/adapter")
public class AdapterController
{
	private 查詢商品Control control;
	
	public AdapterController()
	{
		control = new 查詢商品Control();
	}
  
    @RequestMapping(value = "/", method = RequestMethod.GET) 
    public ModelAndView BuyTurtleForm() { 
    	
    	ModelAndView map = new ModelAndView("structure/adapter/listTurtles");
        map.addObject("TurtleList", control.get可訂購烏龜清單());

        return map;
    }
 } 