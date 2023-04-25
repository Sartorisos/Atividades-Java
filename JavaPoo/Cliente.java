/*
 * Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos, 
 * crie a Classe Cliente com os seus respectivos Métodos e Atributos. 
 * Na sequência, crie uma Classe chamada TestaCliente, instancie dois objetos da Classe Cliente 
 * e apresente as informações destes 2 Objetos no console.

 */

package JavaPoo;

public class Cliente {

private String nome;
private int idade;
private String emprego;
private Double salario;
private String nacionalidade;

public Cliente(String nome, int idade, String emprego, Double salario, String nacionalidade) {
    this.nome = nome;
    this.idade = idade;
    this.emprego = emprego;
    this.salario = salario;
    this.nacionalidade = nacionalidade;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public String getEmprego() {
    return emprego;
}

public void setEmprego(String emprego) {
    this.emprego = emprego;
}

public Double getSalario() {
    return salario;
}

public void setSalario(Double salario) {
    this.salario = salario;
}

public String getNacionalidade() {
    return nacionalidade;
}

public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
}

public void visualizar() {
    System.out.printf("\nNome do cliente: %s, idade: %d, emprego: %s, salario: %.2f, nacionalidade: %s", nome, idade, emprego, salario, nacionalidade);
}

}