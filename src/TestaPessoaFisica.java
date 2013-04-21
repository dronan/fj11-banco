
public class TestaPessoaFisica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica pf = new PessoaFisica("teste", "123456789");
		pf.mostraDados();
		
		pf.setNome("Teste");
		pf.setCpf("12345678910");
		
		pf.mostraDados();
	}

}
