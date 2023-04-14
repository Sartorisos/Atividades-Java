/*
Escreva um algoritmo em Java, que leia um número inteiro via teclado
e mostre na tela uma mensagem indicando
se este número é par ou ímpar e se o número é positivo ou negativo.
Na construção do Algoritmo, utilize os seguintes conteúdos:
 -Entrada e Saída de dados
 - Operadores
 - Laço Condicional IF
 
 */





package Atividades2;

import java.util.Scanner;

public class LacosCondicionais2 {
	
	public static void main(String[] args) {
		
		int n1;
		
		Scanner ler= new Scanner(System.in);
		
		System.out.println("\nDigite um numero: ");
		n1 = ler.nextInt();
		
		if (n1>0 && n1%2==0) {
			System.out.println("\nO Numero é par e positivo!");
		}
		else if (n1>0 && n1%2!=0) {
			System.out.println("\nO Numero é impar e positivo!");
		}
		else if (n1<0 && n1%2==0) {
			System.out.println("\nO Numero é Negativo e par!");
		}
		else {
			System.out.println("\nO Numero é negativo e impar!");
		}
		
		ler.close();
		
	}

}
