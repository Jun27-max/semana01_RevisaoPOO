package entities;

import java.util.Random;

public class Dado {

	private Integer numero1;
	private Integer numero2;

	public Dado() {

	}

	public Dado(Integer numero1, Integer numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public Integer getNumero1() {
		return numero1;
	}

	public void setNumero1(Integer numero1) {
		if (numero1 > 0 && numero1 < 7)
			this.numero1 = numero1;
	}

	public Integer getNumero2() {
		return numero2;
	}

	public void setNumero2(Integer numero2) {
		if (numero2 > 0 && numero2 < 7)
			this.numero2 = numero2;
	}

	public Integer sum() {
		return numero1 + numero2;
	}

	public void jogarDados(Integer num1, Integer num2) {

		Random gerarAleatorios = new Random();

		num1 = gerarAleatorios.nextInt(6) + 1;
		this.numero1 = num1;
		num2 = gerarAleatorios.nextInt(6) + 1;
		this.numero2 = num1;

	}

}
