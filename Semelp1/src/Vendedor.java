//pessoa->comum
public class Vendedor extends Pessoa{//Polimorfismo por inclusão
	//Atributo
	private double salario;
	//
	public double lerSalario() {
		return salario;
	}

	public void editarSalario(double s) {
		this.salario = s;
	}
	
	public void editarNome() {
		//this -> Própria classe
		//super-> Classe pai -> acessa os métodos
		
		super.editarNome();
	}
	
	public Vendedor(String nome, int idade,int salario) {
		super(nome,idade);
		
		this.salario = salario;
	}
	
	public void imprimirDados() {
		super.imprimirDados();//herança
		System.out.println("Salario: "+this.salario);
	}
	
}