/*
 * Utilizando os conceitos de Herança e Polimorfismo, da Programação Orientada a Objetos, crie as 
 * Classes PessoaFisica e PessoaJuridica, como Heranças da Classe Cliente (criada na lista de exercícios 
 * anterior), com os seus respectivos Métodos e Atributos. Na sequência, utilize a Classe TestaCliente para 
 * instanciar dois objetos da Classe PessoaFisica e dois objetos da Classe PessoaJuridica, e apresente as 
 * informações destes 4 Objetos na tela.


 */


package JavaPoo;

public class PessoaFisica extends Cliente {

    private String cpf;

    public PessoaFisica(String nome, int idade, String emprego, Double salario, String nacionalidade, String cpf) {
        super(nome, idade, emprego, salario, nacionalidade);
        this.cpf = cpf;
    }

    public String Cpf() {
        return cpf;
    }

    public void Cpf(String cpf) {
        this.cpf = cpf;
    }

    public void visualizar() {
        System.out.printf("\nNome do cliente: %s, idade: %d, emprego: %s, salario: %.2f, nacionalidade: %s, CPF: %s", getNome(), getIdade(), getEmprego(), getSalario(), getNacionalidade(), cpf);
    }



}