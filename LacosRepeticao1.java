/*Escreva um algoritmo em Java, que leia 2 números inteiros via teclado,
onde o primeiro número deve ser menor do que o segundo número.
Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa.
Dentro do intervalo informado, mostre na tela todos os números que são múltiplos de 3 e 5 */


package Atividades3;

import java.util.Scanner;

public class LacosRepeticao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");
        int numeroA = sc.nextInt();
        
        System.out.print("Agora o segundo numero inteiro: ");
        int numeroB = sc.nextInt();
        

        if (numeroA < numeroB) {
            for (int i = numeroA; i <= numeroB; i++) {
                if (i % 3 == 0 & i % 5 == 0) {
                    System.out.printf("\n%d é múltiplo de 3 e 5",i);
                }
            }
        } else {
            System.out.println("Intervalo inválido!");
        }


        sc.close();
    }
}
		

	