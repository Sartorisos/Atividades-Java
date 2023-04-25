package JavaPoo;


import java.util.Locale;

public class TestaCliente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Cliente cliente1 = new Cliente("Sartori",26,"Dev Jr", 5500.00, "brasileiro");
        cliente1.visualizar();

        Cliente cliente2 = new Cliente("Fernando",33,"Dev Sr", 15000.00, "brasileiro");
        cliente2.visualizar();

    }
}

		