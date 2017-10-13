package kenming.pattern.mvc.creation.abstractfactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import kenming.pattern.creation.abstractfactory.*;
import kenming.pattern.mvc.behavior.strategy.model.StrategyForm;
import kenming.pattern.mvc.creation.abstractfactory.model.*;

@Controller
@RequestMapping("/abfactory")
public class AbstractFactoryController {
	
	private 管理工作單Control control;
	
	public AbstractFactoryController()
	{
		control = new  管理工作單Control ();
	}
  
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView Index() { 

    	ModelAndView map = new ModelAndView("creation/abfactory/sel-service-form");
    	map.addObject("participantModel", new participantModel());
    	
    	return map;
    }
    
    @RequestMapping(value = "/selectParticipant" , method = RequestMethod.POST)
    public ModelAndView selectParticipant(@ModelAttribute("participantModel")participantModel participantEnumModel) { 

    	// 設定所使用的參與者工廠
    	control.SetParticipantFactory(participantEnumModel.getParticipantEnum());
    	
    	ModelAndView map = new ModelAndView("creation/abfactory/WorkItemForm");
    	map.addObject("workItemModel", new WorkItemDTO());

        return map;
    }
    
    @RequestMapping(value = "/addWorkItem" , method = RequestMethod.POST)
    public ModelAndView addWorkItem(@ModelAttribute("workItemModel")WorkItemDTO workItemModel) { 

    	// 新增工作單
    	control.AddWorkItem(workItemModel);
    	
    	ModelAndView map = new ModelAndView("creation/abfactory/WorkItemForm");
    	map.addObject("workItemModel", new WorkItemDTO());

        return map;
    }
    
    @RequestMapping(value = "/listAllWorkItems" , method = RequestMethod.GET)
    public ModelAndView listAllWorkItems() { 
    	
    	ModelAndView map = new ModelAndView("creation/abfactory/listAllWorkItems");
    	map.addObject("workitemList", control.ListAllWorkItems());

        return map;
    }
    
    @RequestMapping(value = "/process/{id}" , method = RequestMethod.GET)
    public ModelAndView procWorkItem(@PathVariable("id") String procID) { 
    	
    	ModelAndView map = new ModelAndView("creation/abfactory/procResult");
    	String procResult = control.Process(procID);
    	procResult = procResult.replaceAll("(\r\n|\n\r|\r|\n)", "<br />");
    	map.addObject("procResult", procResult);

        return map;
    }
}
