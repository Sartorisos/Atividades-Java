/*
 * Utilizando os conceitos de Herança e Polimorfismo, da Programação Orientada a Objetos,
 *  crie as Classes PessoaFisica e PessoaJuridica, como Heranças da Classe Cliente 
 *  (criada na lista de exercícios anterior), com os seus respectivos Métodos e Atributos. Na sequência, 
 *  utilize a Classe TestaCliente para instanciar dois objetos da Classe PessoaFisica e 
 *  dois objetos da Classe PessoaJuridica, e apresente as informações destes 4 Objetos na tela.

 */

package JavaPoo;

import java.util.Locale;

public class TesteCliente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Cliente cliente1 = new Cliente("Fernando", 21, "Desenvolvedor Junior", 3500.00, "brasileiro");
        cliente1.visualizar();

        Cliente cliente2 = new Cliente("Sartori", 26, "Desenvolvedor Senior", 15500.00, "brasileiro");
        cliente2.visualizar();

        PessoaFisica clienteCPF1 = new PessoaFisica("PEDRO", 38, "Especialista Python", 15000.00, "Canadense", "33961915577");
        clienteCPF1.visualizar();

        PessoaFisica clienteCPF2 = new PessoaFisica("MARIA", 27, "Especialista react", 15000.00, "Canadense", "33961913244");
        clienteCPF2.visualizar();

        PessoaJuridica clienteCNPJ1 = new PessoaJuridica("Abraao", 62, "CEO", 32000.00, "Canadense", "12345678900001");
        clienteCNPJ1.visualizar();
        PessoaJuridica clienteCNPJ2 = new PessoaJuridica("Jeremias", 27, "Especialista java PJ", 15000.00, "Canadense", "12345678900005");
        clienteCNPJ2.visualizar();

    }
}