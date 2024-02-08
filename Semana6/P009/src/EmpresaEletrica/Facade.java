package EmpresaEletrica;

import java.util.Date;

public class Facade {



	public static void main(String[] args) {

		Date data = new Date();
		//Clientes
		Cliente cliente = new Cliente("jose", 32);
		Cliente cliente2 = new Cliente("galo", 52);

		
		
		//Imoveis
		Imovel imovel = new Imovel(12, "Conceição", cliente);
		Imovel imovel2 = new Imovel(15, "Zizo", cliente2);


		//Faturas
		
		Fatura fatura1 = new Fatura(imovel, data);
		Fatura fatura2 = new Fatura(imovel2, data);
		
		//Incluindo o primeiro imovel em cliente
		imovel.incluirImovel(imovel);

	
		
		//Pagamento da fatura
		Pagamento pagamento = new Pagamento(fatura1, 160);
		
		//leitura da fatura
		fatura1.registrarLeitura(15);
		
		//Pagamento da fatura
		pagamento.registraPagamento();
		Reembolso reembolso = new Reembolso(pagamento);
		reembolso.registrarReembolso();
		
		fatura1.registrarLeitura(20);
		pagamento.registraPagamento();
		
		
		
		


		
		
		








	
	
		
	
	
	

		
		
		
		
		
		
		
		
	}
}
