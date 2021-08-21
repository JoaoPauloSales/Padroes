package com.mycompany.observer;

/**
 *
 * @author João Paulo
 */
public class BarraObserver extends DadosObserver {

	public BarraObserver(DadosSubject dados) {
		super(dados);
	}

	@Override
	public void update() {
		String barraA = "", barraB = "", barraC = "";

		for (int i = 0; i < dados.getState().valor_A; i++) {
			barraA += '=';
		}

		for (int i = 0; i < dados.getState().valor_B; i++) {
			barraB += '=';
		}

		for (int i = 0; i < dados.getState().valor_C; i++) {
			barraC += '=';
		}

		System.out.println("Barras:\nValor A: " + barraA + "\nValor B: "
				+ barraB + "\nValor C: " + barraC);
	}

}
