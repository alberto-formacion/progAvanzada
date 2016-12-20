package com.sanluis.springRestBoot.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sanluis.springRestBoot.domain.Pais;
import com.sanluis.springRestBoot.service.PaisService;

@RestController
@RequestMapping("/pais")
public class PaisController {
	
	@Autowired
	PaisService paisService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ArrayList<Pais> getPaises(){
		return paisService.getPaises();
	}

}
