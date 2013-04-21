public class TestaContaEstouro3 {
	public static void main(String[] args) {
		Conta minhaConta = new Conta();
		minhaConta.setLimite(100);
		minhaConta.setSaldo(100);

		double novoSaldo = -200;

		if (novoSaldo < -minhaConta.getLimite()) {
			System.out.println("N‹o posso mudar o saldo");

		} else {
			minhaConta.setSaldo(novoSaldo);
		}
	}

}
