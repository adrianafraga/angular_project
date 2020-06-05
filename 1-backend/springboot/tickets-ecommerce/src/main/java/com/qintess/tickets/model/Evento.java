package com.qintess.tickets.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="TB_EVENTO")
public class Evento implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome_evento;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String data_evento;
	
	@Column(nullable = false)
	private int qtd_estoque;
		
	@Column(nullable = false)
	private int faixa_etaria;
	
	@Column(nullable = false)
	private String descricao;
	
	
	@OneToMany(mappedBy="evento",cascade = CascadeType.ALL)
	private List <CompraIngresso> compraingresso;
	
	
	@ManyToOne
	@JoinColumn(name = "casa_show_id", nullable = false)
	private CasaShow casashow ;
	
	
	private Evento () {}
	
	public Evento(Long id, String nome_evento, String data_evento, int qtd_estoque, int preco, int faixa_etaria,
			String descricao, List<CompraIngresso> compraingresso, CasaShow casashow) {
		super();
		this.id = id;
		this.nome_evento = nome_evento;
		this.data_evento = data_evento;
		this.qtd_estoque = qtd_estoque;
		this.faixa_etaria = faixa_etaria;
		this.descricao = descricao;
		this.compraingresso = compraingresso;
		this.casashow = casashow;
	}




	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome_evento() {
		return nome_evento;
	}



	public void setNome_evento(String nome_evento) {
		this.nome_evento = nome_evento;
	}



	public String getData_evento() {
		return data_evento;
	}



	public void setData_evento(String data_evento) {
		this.data_evento = data_evento;
	}



	public int getQtd_estoque() {
		return qtd_estoque;
	}



	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}


	public int getFaixa_etaria() {
		return faixa_etaria;
	}



	public void setFaixa_etaria(int faixa_etaria) {
		this.faixa_etaria = faixa_etaria;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public List<CompraIngresso> getCompraingresso() {
		return compraingresso;
	}



	public void setCompraingresso(List<CompraIngresso> compraingresso) {
		this.compraingresso = compraingresso;
	}



	public CasaShow getCasashow() {
		return casashow;
	}



	public void setCasashow(CasaShow casashow) {
		this.casashow = casashow;
	}



	@Override
	public String toString() {
		return "Evento [id=" + id + ", nome_evento=" + nome_evento + ", data_evento=" + data_evento + ", qtd_estoque="
				+ qtd_estoque + ", faixa_etaria=" + faixa_etaria + ", descricao=" + descricao
				+ ", compraIngresso=" + compraingresso + ", casashow=" + casashow + "]";
	}

	
	
}
