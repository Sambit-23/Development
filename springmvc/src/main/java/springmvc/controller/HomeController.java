package springmvc.controller;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	
	@RequestMapping()
	public String base() {
		
		System.out.println("This is base page");
		return "base";
	}

	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "dibya");
		model.addAttribute("id", 64732);

		List<String> friends = new ArrayList<String>();
		friends.add("kamala");
		friends.add("bimala");
		friends.add("haria");
		friends.add("priya");

		model.addAttribute("f", friends);

		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about url");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help url");

		// Creating ModelAndView object
		ModelAndView modelAndView = new ModelAndView();
		LocalDateTime now = LocalDateTime.now();

		// setting the data
		modelAndView.addObject("name", "Kumar Magalam");
		modelAndView.addObject("rollnumber", 76888);
		modelAndView.addObject("time", now);
		//marks
		
		List<Integer> mark=new ArrayList<Integer>();
		mark.add(12);
		mark.add(23);
		mark.add(127);
		mark.add(132);
		mark.add(212);
		mark.add(412);
		
		modelAndView.addObject("marks", mark);
		
		
		// setting the view name
		modelAndView.setViewName("help");

		return modelAndView;

	}

}
