package springmvc.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
	
@RequestMapping("/home")
public ModelAndView home() {
	ModelAndView mav=new ModelAndView();
mav.addObject("name", "nabin");
LocalDateTime time=LocalDateTime.now();
	mav.addObject("time", time);
	List<String> list=new ArrayList<String>();
	list.add("77");
	list.add("767676");
	list.add("657453");
	mav.addObject("list",list);
	mav.setViewName("index");
	return mav;
}

//Redirect page
// 1). Redirect prifix
 
@RequestMapping("/about")
public String about(Model model) {
	
	return "redirect";
}


////2. RedirectView
//@RequestMapping("/about")
//public RedirectView  about(Model model) {
//RedirectView r=new RedirectView();
//	r.setUrl("contact");
//	return r;
//}


}
