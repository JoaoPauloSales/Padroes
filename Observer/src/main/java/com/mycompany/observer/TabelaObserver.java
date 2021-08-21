package com.mycompany.observer;

/**
 *
 * @author João Paulo
 */
public class TabelaObserver extends DadosObserver {

	public TabelaObserver(DadosSubject dados) {
		super(dados);
	}

	@Override
	public void update() {
		System.out.println("Tabela:\nValor A: " + dados.getState().valor_A
				+ "\nValor B: " + dados.getState().valor_B + "\nValor C: "
				+ dados.getState().valor_C);
	}

}
