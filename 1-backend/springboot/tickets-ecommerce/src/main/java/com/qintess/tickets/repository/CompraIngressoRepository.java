package com.qintess.tickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.qintess.tickets.model.CompraIngresso;


@CrossOrigin("http://localhost:4200") //anotação para aceitar as chamadas de scripts do navegador da web

public interface CompraIngressoRepository extends JpaRepository <CompraIngresso, Long> {
	
		//método personalizado para procurar uma único usuário através do id
		CompraIngresso findById(long id);


}


