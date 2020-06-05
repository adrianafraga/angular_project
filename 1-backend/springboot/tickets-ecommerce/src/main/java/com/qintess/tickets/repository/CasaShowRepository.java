package com.qintess.tickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.qintess.tickets.model.CasaShow;

@CrossOrigin("http://localhost:4200") //anotação para aceitar as chamadas de scripts do navegador da web
public interface CasaShowRepository extends JpaRepository <CasaShow, Long> { //JpaRepository possui vários metodos prontos pra fazer Persistência com um banco de dados (save, delete, findAll e findById)
 
	//método personalizado para procurar uma único usuário através do id
	CasaShow findById(long id);
}

	