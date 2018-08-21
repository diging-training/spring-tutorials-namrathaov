package edu.asu.diging.tutorial.spring.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.asu.diging.tutorial.spring.service.IMoodService;

/*
 * Author: Namratha
 * Handles request URLs to respective requests.
*/
@Controller
public class HomeController {

	@Autowired
	private IMoodService service;
	
	@RequestMapping(value = "/")
	public String home(ModelMap map) {
		map.addAttribute("mood", service.getCurrentMood()); 	
	    return "home";
	}
	@RequestMapping(value = "/feels")
	public String feels(ModelMap map) {
		map.addAttribute("feels", service.getCurrentMood()); 	
	    return "feels";
	}
}
