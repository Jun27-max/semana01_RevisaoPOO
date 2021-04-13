package application;

import javax.swing.JOptionPane;

import entities.Dado;

public class Program {

	public static void main(String[] args) {

		int num1, num2, soma, tentativas, aposta, op;
		boolean acertou;

		num1 = 1;
		num2 = 1;

		Dado jogar = new Dado();

		jogar.jogarDados(num1, num2);

		do {

			soma = jogar.sum();

			System.out
					.println(" Dado 1 = " + jogar.getNumero1() + " Dado 2 = " + jogar.getNumero2() + " Soma = " + soma);

			tentativas = 3;
			acertou = false;

			while (!acertou && tentativas > 0) {
				aposta = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua aposta: "));
				tentativas--;

				if (soma == aposta) {
					acertou = true;
				} else {
					JOptionPane.showMessageDialog(null,
							" Não acertou!. Você possui mais " + tentativas + " Tentativas. Come on! ");
				}

			}

			if (acertou) {
				JOptionPane.showMessageDialog(null, " Você acertou!!!. Tá na hora de jogar na loteria.");
			} else {
				JOptionPane.showMessageDialog(null, "Fim de jogo.");
			}

			op = JOptionPane.showConfirmDialog(null, "Quer jogar novamente?.");

		} while (op == 0);

	}

}
