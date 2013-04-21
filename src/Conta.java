class Conta {
	/*
	 *  String dono;
	 */
	int numero;
	private double saldo;
	private double limite;
	private Cliente titular;
	private static int totalDeContas;
	
	/*Conta(){
		System.out.println("Construindo uma conta");
	}*/
	/*
	Conta(Cliente titular){
		this.titular = titular;
	}
	
	Conta(int numero, Cliente titular){
		this(titular);
		this.numero = numero;
	}*/
	
	Conta(){
		Conta.totalDeContas++;
	}
	
	public static int getTotalDeContas(){
		return Conta.totalDeContas;
	}
	
	void deposita(double quantidade) {
		this.saldo += quantidade;
		// System.out.println("Deposito realizado de: " +quantidade);
	}

	boolean saca(double quantidade) {
		if (this.saldo < quantidade) {
			return false;
		} else {
			this.saldo -= quantidade;
			// System.out.println("Saque realizado de: " +quantidade);
			return true;
		}
	}

	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
	}

	private double pegaSaldo() {
		return this.saldo;
	}

	public double getSaldo() {
		return this.saldo + this.limite;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	/*
	 * String retorno;
	 * 
	 * void teste(String retorno) { this.retorno = retorno; retorno = "teste";
	 * 
	 * System.out.println(retorno); System.out.println(this.retorno); }
	 */
}
