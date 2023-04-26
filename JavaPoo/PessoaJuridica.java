/*
 * Utilizando os conceitos de Herança e Polimorfismo, da Programação Orientada a Objetos,
 *  crie as Classes PessoaFisica e PessoaJuridica, como Heranças da Classe Cliente 
 *  (criada na lista de exercícios anterior), com os seus respectivos Métodos e Atributos. Na sequência,
 *   utilize a Classe TestaCliente para instanciar dois objetos da Classe PessoaFisica e dois objetos da 
 *   Classe PessoaJuridica, e apresente as informações destes 4 Objetos na tela.

 */




package JavaPoo;

public class PessoaJuridica extends Cliente{

    private String cnpj;

    public PessoaJuridica(String nome, int idade, String emprego, Double salario, String nacionalidade, String cnpj) {
        super(nome, idade, emprego, salario, nacionalidade);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void visualizar() {
        System.out.printf("\nNome do cliente: %s, idade: %d, emprego: %s, salario: %.2f, nacionalidade: %s, CNPJ: %s", getNome(), getIdade(), getEmprego(), getSalario(), getNacionalidade(), cnpj);
    }

}