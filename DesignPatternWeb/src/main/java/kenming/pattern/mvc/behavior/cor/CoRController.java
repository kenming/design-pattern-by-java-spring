package kenming.pattern.mvc.behavior.cor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import kenming.pattern.behavior.cor.*;
import kenming.pattern.behavior.cor.dto.Donation;

@Controller
@RequestMapping("/cor")
public class CoRController {
	
	private procDonateControl control;
	
	public CoRController()
	{
		control = new  procDonateControl ();
	}
  
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView Index() { 

    	ModelAndView map = new ModelAndView("behavior/cor/DonateForm");
    	map.addObject("donateModel", new Donation());
    	
    	return map;
    }
    
    @RequestMapping(value = "/Execute" , method = RequestMethod.POST)
    public ModelAndView Execute(@ModelAttribute("donateModel")Donation donateModel, Model model) { 

    	ModelAndView map = new ModelAndView("behavior/cor/result");    	
    	String result = control.procDonation(donateModel);
    	result = result.replaceAll("(\r\n|\n\r|\r|\n)", "<br />");
    	model.addAttribute("resultInfo", result);

        return map;
    }
}