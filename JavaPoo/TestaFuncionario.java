/*
 * Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, 
 * crie a Classe Funcionario com os seus respectivos Métodos e Atributos. Na sequência, 
 * crie uma Classe chamada TestaFuncionario, instancie dois objetos da Classe Funcionario e 
 * apresente as informações destes 2 Objetos no console.

Boas práticas:

Crie a Classe Funcionario e defina pelo menos 5 Atributos relevantes ao Objeto Funcionario, a sua escolha;
Lembre-se de escolher Atributos genéricos, que descrevam as características gerais de qualquer Funcionario;
Crie o Método Construtor com parâmetros, contendo todos os Atributos definidos na Classe Funcionario nos argumentos do Método;
Crie os Métodos Get e Set para todos os Atributos da Classe Funcionario;
Crie o Método visualizar(), com a função de listar todos os Atributos de um Objeto da Classe Funcionario;
Crie a Classe TestaFuncionario no mesmo pacote da Classe Funcionario, contendo o Método main() e instancie 2 Objetos da Classe Funcionario;
Utilize o Método visualizar() para exibir os dados dos 2 Objetos Instanciados

 */

package JavaPoo;

public class TestaFuncionario {


	    public static void main(String[] args) {

	        Funcionario funcionario1 = new Funcionario("Sartori", 1, "Dev Jr", 5500.00, "Backend");
	        funcionario1.visualizar();

	        Funcionario funcionario2 = new Funcionario("Fernando", 2, "Dev Jr", 4200.00, "Frontend");
	        funcionario2.visualizar();

	    }
	}
	    