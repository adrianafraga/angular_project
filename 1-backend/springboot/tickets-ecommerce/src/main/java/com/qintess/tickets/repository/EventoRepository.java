package com.qintess.tickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.qintess.tickets.model.Evento;


@CrossOrigin("http://localhost:4200") //anotação para aceitar as chamadas de scripts do navegador da web

public interface EventoRepository extends JpaRepository <Evento, Long> {
	
	//método personalizado para procurar uma único usuário através do id
	Evento findById(long id);


}

