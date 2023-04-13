package Atividades;


import java.util.Locale;
import java.util.Scanner;

	public class atividade1 {
		
		public static void main (String[] args) {
			
			Locale.setDefault(Locale.US );
			Scanner leia = new Scanner (System.in);
			
			System.out.println("Escreva seu Salario: ");
			float salario = leia.nextFloat();
			
			System.out.println("Escreva seu Abono: ");
			float abono = leia.nextFloat();
			
			float novoSalario = salario + abono;
			
			System.out.printf("\nNovo salario: %.2f%100n", novoSalario);
			
			leia.close();
			
		}
		

	}

