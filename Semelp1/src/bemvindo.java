import javax.swing.JOptionPane;

public class bemvindo{

	public static void main(String[] args){
		//Scanner scan = new Scanner(System.in);
		int idade;
		String nome,entrada;
		Pessoa p1 = new Pessoa();
		
		
		
		//
	
		
		
		nome = JOptionPane.showInputDialog("Digite um nome");
		
		entrada = JOptionPane.showInputDialog("Digite sua idade");
		idade=Integer.parseInt(entrada);
		
		//
		
		p1.editarNome(nome);
		p1.editarIdade(idade);
		
		//
		System.out.println("Seja bem vindo "+p1.lerNome());
		System.out.println(p1.lerNome()+" "+p1.lerIdade()+" anos");
		
		Pessoa p2 = new Pessoa("joao",45);
		p2.imprimirDados();
		
		//
		Vendedor v1 = new Vendedor("maurinho",99,1000);
		
		v1.imprimirDados();
		
	}
	
}