/*
 * Com base na tabela abaixo, escreva um algoritmo em Java, 
 * que simule uma Calculadora simples. O programa deverá ler dois números float: 
 * numero1 e numero2, e na sequência ler o Código da operação matemática 
 * (número inteiro de 1 a 4). A seguir, mostre na tela o resultado da operação entre 
 * os 2 números. Caso a operação seja diferente do intervalo 1 a 4, 
 * mostre a mensagem Operação Inválida!

 */

package Atividades2;

import java.util.Locale;
import java.util.Scanner;


public class LacosCondicionais7 {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float numero1, numero2, resultado = 0;
        int idOperacao;

        System.out.print("Digite o primeiro numero: ");
        numero1 = sc.nextFloat();

        System.out.print("Digite o segundo numero: ");
        numero2 = sc.nextFloat();

        System.out.print("Operacao: ");
        idOperacao = sc.nextInt();

        switch (idOperacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, resultado);
                break;
            case 4:
                if (numero2 == 0) {
                    System.out.println("Impossivel ocorrer uma divisao por zero!");
                } else {
                    resultado = numero1 / numero2;
                    System.out.printf("%.2f  %.2f = %.2f", numero1, numero2, resultado);
                    break;
                }
            default:
                System.out.println("Operacao invalida!");
        }

        sc.close();
    }

}
