package com.qintess.tickets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.qintess.tickets.model.CompraIngresso;
import com.qintess.tickets.repository.CompraIngressoRepository;

@RestController
@CrossOrigin("http://localhost:4200") 
@RequestMapping("/api")
public class CompraIngressoController {
	
	@Autowired
	CompraIngressoRepository compraRepository;
	
	@GetMapping("/compras")// lista todos as compras
	public List<CompraIngresso> listaCompra(){
		return compraRepository.findAll();
			
	}
	
	@GetMapping("/compras/{id}") //lista compra por id
	public CompraIngresso listaCompraId(@PathVariable(value="id")long id){
		return compraRepository.findById(id);
			
	}
	
	@PostMapping("/compras") //método post para salvar compra
	public CompraIngresso salvaCompra(@RequestBody CompraIngresso compra) {
		return compraRepository.save(compra);
		
	}
	
	@DeleteMapping("/compras") //método delete para deletar compra
	public void deletaCompra(@RequestBody CompraIngresso compra) {
		compraRepository.delete(compra);		
	}
	
	@PutMapping("/compras") //método put para atualizar compra
	public CompraIngresso atualizaCompra(@RequestBody CompraIngresso compra) {
		return compraRepository.save(compra);		
	}
	

}
