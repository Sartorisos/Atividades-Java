package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		double n1, n2, n3, n4, calculo;

		System.out.println("Entre com o primeiro valor:");
		n1 = leia.nextFloat();

		System.out.println("Entre com o segundo valor:");
		n2 = leia.nextFloat();

		System.out.println("Entre com o terceiro valor:");
		n3 = leia.nextFloat();

		System.out.println("Entre com o quarto valor:");
		n4 = leia.nextFloat();

		calculo = (n1 * n2) - (n3 * n4);
		System.out.printf("Diferença: %.1f%n", calculo);
		leia.close();
	}

}
