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
		/*ArrayList<Pais> paises = new ArrayList<Pais>();
		
		Pais p = new Pais();
		
		p.setIdPais("AAA");
		p.setNombre("Albertia");
		p.setRegion("EUROPE");
		p.setContinente("EUROPE");
		
		paises.add(p);
		
		return paises;*/
	}

}
