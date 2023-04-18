/*
 * Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
Todos os elementos da Diagonal Principal
Todos os elementos da Diagonal Secundária
A Soma de todos os elementos da Diagonal Principal
A Soma de todos os elementos da Diagonal Secundária

 */

package Atividades3;

import java.util.Scanner;

public class Matriz1 {

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeros[][] = new int[3][3];
		int somaDiagonalPrincipal=0,somaDiagonalSecundaria=0;
		String valoresDiagonalPrincipal="",valoresDiagonalSecundaria="";
		
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				System.out.printf("\nDigite um número na posição [%d][%d]: ",linha,coluna);
				numeros[linha][coluna] = leia.nextInt();
				
				if(linha == coluna) {
					somaDiagonalPrincipal += numeros[linha][coluna];
					valoresDiagonalPrincipal += numeros[linha][coluna]+" ";
				}
				
				if(linha+coluna == 2) {
					somaDiagonalSecundaria += numeros[linha][coluna];
					valoresDiagonalSecundaria += numeros[linha][coluna]+" ";
				}
			}
		}
		
		System.out.println("\nElementos da diagonal principal: \n"+valoresDiagonalPrincipal);
		System.out.println("\nElementos da diagonal secundária: \n"+valoresDiagonalSecundaria);
		System.out.println("\nSomatório da diagonal principal: "+somaDiagonalPrincipal);
		System.out.println("\nSomatório da diagonal secundária: "+somaDiagonalSecundaria);
		
		leia.close();

	}

}
