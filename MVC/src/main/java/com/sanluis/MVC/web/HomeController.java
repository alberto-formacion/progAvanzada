package com.sanluis.MVC.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sanluis.MVC.domain.Cd;
import com.sanluis.MVC.service.CdService;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	CdService cdService;

	@RequestMapping(method=RequestMethod.GET)
	public String home(ModelMap model){
		List<Cd> cds = cdService.getCds();
		
		model.addAttribute("cds", cds);
		
		return "home";
	}
}
