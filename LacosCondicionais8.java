/*
 * Desenvolva um algoritmo em Java para uma conta bancária.
 *  O programa deverá ler o tipo de operação a ser realizada com base na tabela abaixo 
 *  (número inteiro entre 1 e 3) e o valor a ser depositado ou sacado 
 *  (somente nas opções 2 e 3). Considere que um saque só pode ser realizado caso haja saldo suficiente. 
 *  Ao final de cada operação, exiba o novo Saldo na tela. 
 *  A variável saldo (float), será inicializada com o valor de R$ 1000.00. 
 *  Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida!

 */

package Atividades2;
import java.util.Scanner;

public class LacosCondicionais8 {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        float saldo = 1000.0f;

	        System.out.print("Operação (1 - Saldo, 2 - Saque, 3 - Depósito): ");
	        int operacao = input.nextInt();

	        switch (operacao) {
	            case 1:
	                System.out.println("Operação - Saldo");
	                System.out.printf("Saldo: R$ %.2f", saldo);
	                break;
	            case 2:
	                System.out.println("Operação - Saque");
	                System.out.print("Valor: R$ ");
	                float saque = input.nextFloat();
	                if (saque <= saldo) {
	                    saldo -= saque;
	                    System.out.printf("Novo Saldo: R$ %.2f", saldo);
	                } else {
	                    System.out.println("Saldo Insuficiente!");
	                }
	                break;
	            case 3:
	                System.out.println("Operação - Depósito");
	                System.out.print("Valor: R$ ");
	                float deposito = input.nextFloat();
	                saldo += deposito;
	                System.out.printf("Novo Saldo: R$ %.2f", saldo);
	                break;
	            default:
	                System.out.println("Operação Inválida!");
	                
	                input.close();
	        }
	    }
	}

