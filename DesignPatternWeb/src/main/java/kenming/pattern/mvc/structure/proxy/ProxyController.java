package kenming.pattern.mvc.structure.proxy;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import kenming.pattern.mvc.structure.proxy.model.*;
import kenming.pattern.structure.proxy.*;

@Controller
@RequestMapping("/proxy")
public class ProxyController {
	
	private 販售服務Control control;
	
	public ProxyController()
	{
		control = new  販售服務Control();
	}
  
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView Index() { 

    	return new ModelAndView("structure/proxy/certifyForm", "turtleInfo", new 烏龜認證資訊());
    }
    
    @RequestMapping(value = "/Identify" , method = RequestMethod.POST)
    public ModelAndView Idenyify(@ModelAttribute("turtleInfo")烏龜認證資訊 turtleInfo, ModelMap model) { 

    	ModelAndView map = new ModelAndView("structure/proxy/result");
    	String result = control.get認證資訊(turtleInfo.get品種(), turtleInfo.get序號());
    	model.addAttribute("resultInfo", result);

        return map;
    }
    
    @ModelAttribute("varietyList")
    public Map<String, String> getVarietyList()
    {
	       Map<String, String> varietyList = new HashMap<String, String>();
	       varietyList.put("陸龜", "陸龜");
	       varietyList.put("澤龜", "澤龜");
	       varietyList.put("象龜", "象龜");
	       return varietyList;
    }
 } 
