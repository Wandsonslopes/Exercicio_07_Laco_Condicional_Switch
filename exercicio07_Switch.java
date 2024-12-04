package exercicio07_Switch;

import java.util.Scanner;

public class exercicio07_Switch {

	public static void main(String[] args) {
		float numero1, numero2, total;
		int operacao;
		Scanner leia = new Scanner(System.in);

		System.out.println("- -- ---   Opções   --- -- -");
		System.out.println("--Digite 1 para Soma--");
		System.out.println("--Digite 2 para Subtração--");
		System.out.println("--Digite 3 para Multiplicação--");
		System.out.println("--Digite 4 para Divisão--");

		System.out.println("Digite o número 1: ");
		numero1 = leia.nextFloat();

		System.out.println("Digite o númmero 2: ");
		numero2 = leia.nextFloat();

		System.out.println("Digite a operação desejada: ");
		operacao = leia.nextInt();

		switch (operacao) {
		case 1:
			total = numero1 + numero2;
			System.out.println(numero1 + " + " + numero2 + " = " + total);
			break;
		case 2:
			total = numero1 - numero2;
			System.out.println(numero1 + " - " + numero2 + " = " + total);
			break;
		case 3:
			total = numero1 * numero2;
			System.out.println(numero1 + " * " + numero2 + " = " + total);
			break;
		case 4:
			total = numero1 % numero2;
			System.out.println(numero1 + " / " + numero2 + " = " + total);
			break;
		default:
			System.out.println("Opção Inválida");

		}
	}

}
