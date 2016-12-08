package com.alanlviana.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.management.RuntimeErrorException;

public class CaixaEletronico {

	public CaixaEletronico(long id,String identificacao, String endereco) {
		super();
		this.id = id;
		this.identificacao = identificacao;
		this.endereco = endereco;
	}

	private long id;
	private String identificacao;
	private String endereco;
	private List<Cedula> cedulas = new ArrayList<>();
	
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
	public void saque(float valor) {
			
		if (valor <= 0) {
			throw new IllegalArgumentException("O valor do saque deve ser positivo.");
		}
		
		if (valor > this.getSaldo()) {
			throw new RuntimeException("Quantia não disponível.");
		}
		
		
	}
	public float getSaldo() {
		float saldo = 0;
		
		for (Cedula cedula : cedulas){
			saldo += cedula.getValor();
		}
		
		return saldo;
	}

	
}
