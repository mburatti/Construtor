
public class Animal {
	private String nome;
	
	public Animal() {
		super();
		this.nome = "";
	}

	public Animal(String nome) {
		super();
		this.nome = nome;
	}

	public void falar() {
		if(nome.length()>0) {
			System.out.println("Olá eu sou o "+nome);
		}else {
			System.out.println("Olá, eu aind anão tenho nome.");
		}
		
	};
	
	
}
