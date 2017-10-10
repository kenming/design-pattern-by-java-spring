package kenming.pattern.mvc.structure.facade;

import java.util.*;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import kenming.pattern.mvc.structure.facade.model.*;
import kenming.pattern.structure.facade.*;
import kenming.pattern.structure.facade.dto.*;

@Controller
@RequestMapping("/facade")
public class FacadeController {
	private 買烏龜Control control;
	
	public FacadeController()
	{
		control = new 買烏龜Control();
	}
  
    @RequestMapping(value = "/", method = RequestMethod.GET) 
    public ModelAndView BuyTurtleForm() { 
        
    	ShopperForm shopper = new ShopperForm();
    	shopper.setShoppingList(control.list烏龜清單());
    	
		// Debug: System.out.println(shopper.getShoppingList().get(0).getName());
    	
    	ModelAndView map = new ModelAndView("structure/facade/listTurtles");
        map.addObject("shopper", shopper);

        return map;
    }
    
	@RequestMapping(value = "/addToCart", method = RequestMethod.POST)
	public ModelAndView checkout(@ModelAttribute("shopper")ShopperForm shopper) {
		ShoppingCart shoppingCart = new ShoppingCart();
		List<烏龜商品> shopList = new ArrayList<烏龜商品>();
		
		for (烏龜商品 item : shopper.getShoppingList() )
		{
			if (item.getQuantity() != 0) {
				烏龜商品 turtle = new 烏龜商品();
				turtle.setId(item.getId());
				turtle.setName(item.getName());
				turtle.setPrice(item.getPrice());
				turtle.setQuantity(item.getQuantity());
				shopList.add(turtle);
			}
		}
		
		shoppingCart.setCartList(shopList);
		shoppingCart = control.確認訂購資訊(shoppingCart);
		
		return new ModelAndView("structure/facade/addToCart", "shoppingCart", shoppingCart);
	}
	
	@RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
	public String saveOrder() {
		
		return "structure/facade/saveOrder";
	}
 } 
