package com.sanluis.springBootHibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanluis.springBootHibernate.domain.Cd;
import com.sanluis.springBootHibernate.service.CdService;

@CrossOrigin(origins = {"http://localhost"})
@RestController
@RequestMapping("/cds")
public class CdController {
	
	@Autowired
	CdService cdService;
	
	@GetMapping(produces = "application/json")
	public List<Cd> getCds(){
		return cdService.getCds();
	}
	
	@GetMapping(path="/{titulo}", produces = "application/json")
	public Cd getCdByTitulo(@PathVariable String titulo){
		return cdService.getCdByTitulo(titulo);
	}
	
}
