package com.qintess.tickets.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;


@Entity
@Table(name="TB_CASASHOW")
public class CasaShow implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome_casashow;
	
	@Column(nullable = false)
	private String endereco;
	
	@Column(nullable = false)
	private String numero;
	
	@Column(nullable = false)
	private String telefone;
	
	@Column(nullable = false)
	private String cep;
	
	@Column(nullable = false)
	private String cidade;
	
	@Column(nullable = false)
	private String estado;
	
	
	@Column(nullable = false)
	private int capacidade_total;
	
	
	
	private CasaShow () {}
	
	
	public CasaShow(Long id, String nome_casashow, String endereco, String numero, String telefone, String cep, String cidade,
			String estado, int capacidade_total) {
		super();
		this.id = id;
		this.nome_casashow = nome_casashow;
		this.endereco = endereco;
		this.numero = numero;
		this.telefone = telefone;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.capacidade_total = capacidade_total;
		
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome_casashow() {
		return nome_casashow;
	}

	public void setNome(String nome_casashow) {
		this.nome_casashow = nome_casashow;
	}

	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCapacidade_total() {
		return capacidade_total;
	}

	public void setCapacidade_total(int capacidade_total) {
		this.capacidade_total = capacidade_total;
	}
	
	

	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public void setNome_casashow(String nome_casashow) {
		this.nome_casashow = nome_casashow;
	}

	
	
	@Override
	public String toString() {
		return "CasaShow [id=" + id + ", nome_casashow=" + nome_casashow + ", endereco=" + endereco + ", numero="
				+ numero + ", telefone="+ telefone +", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado + ", capacidade_total="
				+ capacidade_total +  "]";
	}

}
