package com.mycompany.observer;

import java.text.DecimalFormat;

/**
 *
 * @author João Paulo
 */
public class PorcentoObserver extends DadosObserver {

	public PorcentoObserver(DadosSubject dados) {
		super(dados);
	}

	@Override
	public void update() {
		int somaDosValores = dados.getState().valor_A + dados.getState().valor_B
				+ dados.getState().valor_C;
		DecimalFormat formatador = new DecimalFormat("#.##");
		String porcentagemA = formatador.format((double) dados.getState().valor_A
				/ somaDosValores);
		String porcentagemB = formatador.format((double) dados.getState().valor_B
				/ somaDosValores);
		String porcentagemC = formatador.format((double) dados.getState().valor_C
				/ somaDosValores);
		System.out.println("Porcentagem:\nValor A: " + porcentagemA
				+ "%\nValor B: " + porcentagemB + "%\nValor C: " + porcentagemC
				+ "%");
	}

}
