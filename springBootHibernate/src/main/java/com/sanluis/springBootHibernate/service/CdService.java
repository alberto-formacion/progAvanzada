package com.sanluis.springBootHibernate.service;

import java.util.List;

import com.sanluis.springBootHibernate.domain.Cd;

public interface CdService {
	
	public List<Cd> getCds();

	public Cd getCdByTitulo(String titulo);

}
