package com.alanlviana.modelo;

public class Cedula {

	private long id;
	private String nome;
	private float valor;
	private String numeroSerie;
	
	public Cedula(String nome, float valor, String numeroSerie) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.numeroSerie = numeroSerie;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
	
	
	
}
