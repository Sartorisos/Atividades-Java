package JavaPoo;

public class TesteAutomovel {

public static void main(String[] args) {
		
		//instanciando um objeto da classe Automovel
		//Portanto o auto1 será um objeto da classe Automovel
		
		Automovel auto1 = new Automovel("Charles","Audi Q8","CHA1998",2023);
		
		auto1.imprimirInfo();
		
		System.out.println("\n****Transferência de Proprietário");
		
		auto1.setNomeProprietario("Cinthia");
		
		auto1.imprimirInfo();
		
		System.out.println("\nAlteração da placa do automóvel");
		
		auto1.setPlaca("CIN2A00");
		
		auto1.imprimirInfo();
		
		

	}

}