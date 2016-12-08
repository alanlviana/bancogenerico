package com.alanlviana.modelo;

import java.util.Collections;
import java.util.List;

public class CaixaEletronico {

	public CaixaEletronico(String identificacao, String endereco) {
		super();
		this.identificacao = identificacao;
		this.endereco = endereco;
	}

	private long id;
	private String identificacao;
	private String endereco;
	private List<Cedula> cedulas = Collections.emptyList();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public List<Cedula> getCedulas() {
		return cedulas;
	}
	
	public void adicionarCedula(Cedula cedula){
		cedulas.add(cedula);
	}

	
}
