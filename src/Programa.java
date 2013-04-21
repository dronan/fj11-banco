
public class Programa {

	public static void main(String[] args) {
		/*
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.dono = "Duke";
		minhaConta.saldo = 1000.0;
		
		
		
		System.out.println("Saldo atual: "+minhaConta.saldo);
		
		minhaConta.saca(5500);
		
		System.out.println("Saldo atual: "+minhaConta.saldo);
		
		minhaConta.deposita(2000);
		
		System.out.println("Saldo atual: "+minhaConta.saldo);
		
		
		Conta c1 = new Conta();
		c1.deposita(1000);
		
		Conta c2 = c1;
		
		c2.deposita(200);
		
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
		*/
		/*
		Conta c1 = new Conta();
		c1.dono = "Duke";
		c1.deposita(100);
		
		Conta c2 = new Conta();
		c2.dono = "Duke 2";
		c2.deposita(500);
		System.out.println("c1: " +c1.saldo);
		System.out.println("c2: " +c2.saldo);
		
		c2.transfere(c1, 100);
		
		System.out.println("c1: " +c1.saldo);
		System.out.println("c2: " +c2.saldo);
		
		
		if (c1.dono == c2.dono) {
			System.out.println("Contas iguais");
		}
		*/
		/*
		Cliente carlos = new Cliente();
		carlos.nome = "Carlos";
		
		Conta minhaConta = new Conta(carlos);
		System.out.println(minhaConta.titular.nome);
		*/
		
		//Cliente c = new Cliente();
		//minhaConta.titular = c;
		//c.nome = "Duke";
		//minhaConta.titular.nome = "Duke";
		/*
		minhaConta.saldo = 1000;
		minhaConta.numero = 123;
		minhaConta.titular = new Cliente();
		minhaConta.titular.nome = "teste";
		System.out.println(minhaConta.titular.nome);
		*/
		
		//minhaConta.teste("teste0101010");
		
		//System.out.println(minhaConta.retorno);
		Conta c = new Conta();
		c.numero = 123;

		Conta c1 = new Conta();
		c1.numero = 123;

		Conta c2 = new Conta();
		c2.numero = 123;
		
		//Conta c3 = new Conta();
		//c3.setTitular(new Cliente());


		
		int total = Conta.getTotalDeContas();
		System.out.println(total);
		
	}

}
