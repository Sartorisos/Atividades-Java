package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class atividade3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite salario bruto");
		double salarioBruto = leia.nextDouble();

		System.out.println("Digite adicional noturno");
		double adicionalNoturno = leia.nextDouble();

		System.out.println("Digite horas extras");
		double horasExtras = leia.nextDouble();

		System.out.println("Digite descontos");
		double descontos = leia.nextDouble();

		double salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

		System.out.printf("Salario liquido:  %.2f%n ", salarioLiquido);

		leia.close();
	}

}