package JavaPoo;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Empregado[] lista = new Empregado[3];
		
		lista[0] = new Empregado("Vinicius Almeida",8000);
		lista[1] = new Empregado("Caique Ramos",8500);
		lista[2] = new Empregado("Thayna",15000);
		
		for(Empregado roda:lista) {
			
			roda.imprimir();
		}
		
		System.out.println("\n**************************************************");
		
		for(Empregado roda:lista) {
			
			roda.aumentarSalario(10);
			roda.imprimir();
		}

		
	}

}