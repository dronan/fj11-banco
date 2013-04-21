
public class TestaContaEstouro1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.setSaldo(1000.0);
		minhaConta.setLimite(1000.0);
		minhaConta.saca(50000);
	}

}
