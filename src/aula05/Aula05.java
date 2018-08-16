package aula05;

public class Aula05 {
	
	public static void main (String[] args) {
	// Instanciando o objeto 
	ContaBanco p1 = new ContaBanco();
	p1.setNumConta(1268);
	p1.setDono("Barros");
	p1.abrirConta("CC");
	
	//Instanciando o Segundo Objeto
	ContaBanco p2 = new ContaBanco();
	p2.setNumConta(5432);
	p2.setDono("Astolfi");
	p2.abrirConta("CP");
	
	p1.depositar(100);
	p2.depositar(500);
	p2.sacar(1000);
	
	p1.sacar(150);
	p1.fecharConta();
	
    p1.estadoAtual();;
	p2.estadoAtual();
	
	
	}

}
