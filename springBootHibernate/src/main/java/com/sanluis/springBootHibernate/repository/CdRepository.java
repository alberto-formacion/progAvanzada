package com.sanluis.springBootHibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanluis.springBootHibernate.domain.Cd;

public interface CdRepository extends JpaRepository<Cd, Integer>{
	Cd findByTitulo(String titulo);
}
