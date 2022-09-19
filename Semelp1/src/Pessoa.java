//final -> final
public class Pessoa {
	//atributos
	public  String nome;
	public  int idade;
	
	//Construtor implicito
	
	//Construtor básico
	
	public Pessoa() {
		
	}
	
	public Pessoa(String n) {
		this.nome = n;
	}
	
	public Pessoa(String n, int i) {
		this.nome = n;
		this.idade = i;
	}
	//getters and setters
	
	public void editarNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public String lerNome() {
		return nome;
	}
	
	public void editarIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	
	public int lerIdade() {
		return this.idade;
	}
	
	public void editarIdade() {
		this.idade = 0;
	}
	
	public void editarNome() {
		this.nome = "";
	}
	
	public void imprimirDados() {
		System.out.println("-----------------------");
		
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade + " anos");
	}

}
