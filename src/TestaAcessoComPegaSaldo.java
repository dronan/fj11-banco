
public class TestaAcessoComPegaSaldo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		minhaConta.deposita(1000);
		System.out.println("Saldo:" +minhaConta.getSaldo());

	}

}
