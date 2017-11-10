package com.sanluis.MVC.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanluis.MVC.dao.CdDAO;
import com.sanluis.MVC.domain.Cd;
import com.sanluis.MVC.service.CdService;

@Service
public class CdServiceImpl implements CdService{
	
	@Autowired
	CdDAO cdDAO;

	public List<Cd> getCds() {
		return cdDAO.getCds();
	}
	
}
