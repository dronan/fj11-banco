
public class Cliente {
	String nome;
	private String sobrenome;
	private String cpf;
	private String endereco;
	private int idade;
	
	public void mudaCPF(String cpf){
		if (this.idade < 60){
			validaCPF(cpf);
		}
		this.cpf = cpf;
	}
	
	private void validaCPF(String cpf){
		
	}
	
	
	
}
