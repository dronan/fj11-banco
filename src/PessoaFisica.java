/*
 * 
 * É) (opcional) Crie a classe PessoaFisica. Queremos ter a garantia de que pessoa física alguma tenha CPF invalido,
nem seja criada PessoaFisica sem cpf inicial. (você não precisa escrever o algoritmo de validação
de cpf, basta passar o cpf por um método valida(String x)....)
*
*/
public class PessoaFisica {
	private String cpf;
	private String nome;
	
	public String getCpf(){
		return this.cpf;
	}
	
	public void setCpf(String cpf){
		if (!valida(cpf)){
			this.cpf = "0";
			System.out.println("O cpf é invalido!");
		}else{
			this.cpf = cpf;
			System.out.println("O cpf é valido!");
		}		
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	
	PessoaFisica(){
		System.out.println("cadastro iniciando!");
	}
	
	PessoaFisica(String nome, String cpf){
		this();
		setNome(nome);
		setCpf(cpf);
	}
	
	
	private boolean valida(String cpf){
		if (cpf == "123456789")
			return true;
		return false;
	}
	
	public void mostraDados(){
		System.out.println("Nome:" +getNome());
		System.out.println("CPF:" +getCpf());
	}
}
