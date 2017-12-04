package com.sanluis.springBootHibernate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanluis.springBootHibernate.domain.Cd;
import com.sanluis.springBootHibernate.repository.CdRepository;
import com.sanluis.springBootHibernate.service.CdService;

@Service
public class CdServiceImpl implements CdService {
	
	@Autowired
	CdRepository cdRepository;

	public List<Cd> getCds() {
		return cdRepository.findAll();
	}

	public Cd getCdByTitulo(String titulo) {
		return cdRepository.findByTitulo(titulo);
	}

}
