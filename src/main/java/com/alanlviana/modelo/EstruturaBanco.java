package com.alanlviana.modelo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(value="singleton")
public class EstruturaBanco {

	private List<CaixaEletronico> caixas;
	
	public EstruturaBanco(){
		caixas = new ArrayList<>();
		
		caixas.add(new CaixaEletronico(0,"ID_001", "Suzano - SP"));
		caixas.add(new CaixaEletronico(1,"ID_002", "Mogi das Cruzes - SP"));				
	}

	public List<CaixaEletronico> getCaixas() {
		return caixas;
	}

	public void setCaixas(List<CaixaEletronico> caixas) {
		this.caixas = caixas;
	}



	
	
	
	
}
