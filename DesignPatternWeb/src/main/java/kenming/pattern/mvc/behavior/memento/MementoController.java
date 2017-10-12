package kenming.pattern.mvc.behavior.memento;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import kenming.pattern.behavior.memento.*;
import kenming.pattern.behavior.memento.dto.*;
import kenming.pattern.mvc.behavior.memento.model.*;
import kenming.pattern.mvc.structure.facade.model.ShopperForm;

@Controller
@RequestMapping("/memento")
public class MementoController {
	
	private 管理博彩Control control;
	
	public MementoController()
	{
		control = new  管理博彩Control ();
	}
  
    @RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView Index() { 	
		ModelAndView map = new ModelAndView("behavior/memento/LottoForm");
		複合彩DTO lottoModel = new 複合彩DTO();
		map.addObject("lottoModel", lottoModel);
    	
    	return map;
    }
   
    @RequestMapping(value="lottoForm", params="autoselect", method = RequestMethod.POST)
    public ModelAndView autoSelectNum(Model model) { 
    	ModelAndView map = new ModelAndView("behavior/memento/LottoForm"); 
		複合彩DTO lottoModel = new 複合彩DTO();
		lottoModel.set彩券號碼(control.選號());
		map.addObject("lottoModel", lottoModel);
		
        return map;
    }

    @RequestMapping(value="lottoForm", params="saveLotto", method = RequestMethod.POST)
    public ModelAndView saveLotto(@ModelAttribute("lottoModel")複合彩DTO lottoModel, Model model) { 
    	ModelAndView map = new ModelAndView("behavior/memento/LottoForm"); 
    	control.Save選號(lottoModel);
		map.addObject("lottoModel", lottoModel);

        return map;
    }
    
    @RequestMapping(value="lottoForm", params="restoreLotto", method = RequestMethod.POST)
    public ModelAndView restoreLotto(@ModelAttribute("lottoModel")複合彩DTO lottoModel, Model model) { 
    	ModelAndView map = new ModelAndView("behavior/memento/LottoForm"); 
    	//lottoModel.set彩券號碼(88);
    	//lottoModel.set成語字謎("明珠彈雀");
    	lottoModel = control.還原選號();
		map.addObject("lottoModel", lottoModel);

        return map;
    }
    
    @ModelAttribute("idiomList")
    // 實作上應透過 Domain Control 取得成語字組的資訊
    private List<String> getIdiomList()
    {
    	List<String> idioms = new ArrayList<String>();
    	idioms.add("晨星寥落");
    	idioms.add("明珠彈雀");
    	idioms.add("尾生之信");
    	idioms.add("遺大投艱");
    	idioms.add("人心不古");
    	
    	return idioms;
    }
}