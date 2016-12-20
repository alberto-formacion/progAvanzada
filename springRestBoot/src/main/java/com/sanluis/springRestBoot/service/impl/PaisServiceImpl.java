package com.sanluis.springRestBoot.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanluis.springRestBoot.domain.Pais;
import com.sanluis.springRestBoot.repository.PaisDAO;
import com.sanluis.springRestBoot.service.PaisService;

@Service
public class PaisServiceImpl implements PaisService {
	
	@Autowired
	PaisDAO paisDAO;

	public ArrayList<Pais> getPaises() {
		return paisDAO.getPaises();
	}
	
	

}
