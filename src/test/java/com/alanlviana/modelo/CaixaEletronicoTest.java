package com.alanlviana.modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CaixaEletronicoTest {

	private CaixaEletronico caixaCom170Reais;
	private CaixaEletronico caixaVazio;
	
	@Before
	public void preparaCaixa(){
		caixaCom170Reais = new CaixaEletronico(0, "ID_0001A", "Suzano - SP");
		caixaCom170Reais.adicionarCedula(new Cedula("50 reais", 50, "1A50"));
		caixaCom170Reais.adicionarCedula(new Cedula("50 reais", 50, "2A50"));
		caixaCom170Reais.adicionarCedula(new Cedula("50 reais", 50, "3A50"));
		caixaCom170Reais.adicionarCedula(new Cedula("20 reais", 20, "4A20"));
		
		caixaVazio = new CaixaEletronico(0, "ID_0002A", "Mogi - SP");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoDeveAceitarValoresNegativos(){
		caixaCom170Reais.saque(-20);
	}
	@Test(expected=IllegalArgumentException.class)
	public void naoDeveAceitarValorZero(){
		caixaCom170Reais.saque(0);
	}
	
	@Test(expected=RuntimeException.class)
	public void naoDeveSacarMaisQuePossui(){
		caixaCom170Reais.saque(180);
	}		
	
	@Test
	public void saldoDeveEstarCorreto(){
		Assert.assertEquals(170, caixaCom170Reais.getSaldo(),0.0001);
		Assert.assertEquals(0, caixaVazio.getSaldo(),0.0001);
	}
}
