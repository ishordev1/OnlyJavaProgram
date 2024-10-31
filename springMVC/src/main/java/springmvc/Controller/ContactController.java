package springmvc.Controller;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.Model.User;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	/*
	//handler form
	@RequestMapping(path="/processform" , method=RequestMethod.POST)
	//featching data with using RequestParam also work HttpServletRequest
	public String handleForm(@RequestParam(name="name",required=false) String name,
			@RequestParam("email") String email,
			@RequestParam("password") String pass, Model model
			) {
	User user=new User(name, email, pass);                                                                              
		model.addAttribute("user", user);
		return "success";
	}
	*/
	
	
	
	//Using @ModelAttribute
	@RequestMapping(path="/processform" , method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
	
		return "success";
	}         
	
}
