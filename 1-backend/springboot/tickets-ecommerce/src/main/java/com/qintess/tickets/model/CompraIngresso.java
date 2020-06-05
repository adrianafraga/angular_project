package com.qintess.tickets.model;

import java.math.BigDecimal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="TB_COMPRA")
public class CompraIngresso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="compra_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "evento_id", nullable = false)
	private Evento evento;

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;
	
	@Column(name="qtd")
	private int qtd;
	
	@Column(name="valor_unit")
	private double valorUnit;
	
	@Column(name="valor_total")
	private double valorTotal;
	
	@Column(name="data_compra",nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate data_compra;
	
	
	private CompraIngresso() {}
	
	
	/*public void setValorTotal(double valorUnitario, Integer qtd, double valorTotal) {
			this.valorTotal = valorTotal - (valorUnitario * qtd);
		}*/
	
	
	public CompraIngresso(Long id, Evento evento, Usuario usuario, int qtd, double valorUnit, double valorTotal,
			LocalDate data_compra) {
		super();
		this.id = id;
		this.evento = evento;
		this.usuario = usuario;
		this.qtd = qtd;
		this.valorUnit = valorUnit;
		this.valorTotal = valorTotal;
		this.data_compra = data_compra;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Evento getEvento() {
		return evento;
	}



	public void setEvento(Evento evento) {
		this.evento = evento;
	}



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	public int getQtd() {
		return qtd;
	}



	public void setQtd(int qtd) {
		this.qtd = qtd;
	}



	public double getValorUnit() {
		return valorUnit;
	}



	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;
	}



	public double getValorTotal() {
		return valorTotal;
	}



	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}



	public LocalDate getData_compra() {
		return data_compra;
	}



	public void setData_compra(LocalDate data_compra) {
		this.data_compra = data_compra;
	}



	@Override
	public String toString() {
		return "Compra [id=" + id + ", evento=" + evento + ", usuario=" + usuario + ", qtd=" + qtd + ", valorUnit="
				+ valorUnit + ", valorTotal=" + valorTotal + ", data_compra=" + data_compra + "]";
	}
}

/*
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="usuario_id",nullable=false)
	private Usuario usuario;
	
	@Column(nullable = false)
	private BigDecimal valor_total;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate data_venda;
	
	@Column(nullable = false)
	private String status;
	
		
	@OneToMany(mappedBy = "compra", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CompraIngresso> compraIngressos = new ArrayList <CompraIngresso>();



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario (Usuario usuario) {
		this.usuario = usuario;
	}

	public BigDecimal getValor_total() {
		return valor_total;
	}

	public void setValor(BigDecimal valor) {
		this.valor_total = valor_total;
	}

	public LocalDate getData_venda() {
		return data_venda;
	}

	public void setData_venda(LocalDate data_venda) {
		this.data_venda = data_venda;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public List<CompraIngresso> getCompraIngresso() {
		return compraIngressos;
	}
	
	
	/*public void adicionaIngresso(Ingresso ingresso, int quantidade) {
		
		double valor_unitario;
		CompraIngressos compraIngressos = new CompraIngressos(this, ingresso,quantidade);
		
		ingresso.add(compraIngressos);
		ingresso.getCompraIngressos().add(compraIngressos);
		
		double valorCompraIngressos = this.valor.doubleValue();
		double valorIngressoUnit = ingresso.getValor_unitario().doubleValue();	
		
		valorCompraIngressos += (valorIngressoUnit * quantidade);
		this.valor = new BigDecimal (valorCompraIngressos);
	}*/
	


