
public class Singleton {

	private int teste;
	
	
	public int getTeste(){ return this.teste; }
	
	public void setTeste(int teste){
		this.teste = teste;
	}

	private static Singleton instance = new Singleton();
	
	private Singleton(){}
	
	public static Singleton getInstance(){
		return instance;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton teste01 = Singleton.getInstance();
		teste01.setTeste(3);
		teste01.getTeste();
		System.out.println("--------------");
		Singleton teste02 = Singleton.getInstance();
		teste02.setTeste(1);
		teste01.getTeste();
		teste02.getTeste();
		System.out.println("--------------");
		Singleton teste03 = Singleton.getInstance();
		teste03.setTeste(1);
		teste01.getTeste();
		teste02.getTeste();
		teste03.getTeste();
		
	

	}

	

}
