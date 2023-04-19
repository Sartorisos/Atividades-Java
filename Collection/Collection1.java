/*
 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String.
 *  O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las 
 *  individualmente no ArrayList. Em seguida, faça o que se pede:
Mostre na tela todas as cores que foram adicionadas. 
Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.

 */

package Atividades3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Collection1 {

public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		//criar o meu ArrayList
		for(int i=0;i<5;i++) {
			System.out.println("\nDigite a cor de número"+(i+1)+" : ");
			String cor = ler.nextLine();
			cores.add(cor);
		}
		
		Iterator<String> iterator = cores.iterator();
		
		//Listando as cores
		System.out.println("\nListar todas as cores: ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Listar as cores em ordem alfabética
		Collections.sort(cores);
		System.out.println("\nCores Ordenadas");
		System.out.println("\n"+cores);
		
		ler.close();

	}

}
