package aplicacao;
import classes.*;

public class aplicacao {

	public static void main(String[] args) {
		
		/**
		 * Declara��o das vari�veis
		 */
		Desktop pc = new Desktop();
		MemoriaRam memoria = new MemoriaRam();
		PlacaMae placaMae = new PlacaMae();
		
		/**
		 * Aplica��o dos m�todos de cadastro
		 */
		pc.cadastrarDesktop();
		placaMae.cadastrarPlacaMae();
		memoria.cadastrarMemoria();
	
		/**
		 * Impress�o dos dados coletados
		 */
		System.out.println("\n-----------------------------------------");
		System.out.println("Confira as especifica��es do equipamento:");
		System.out.println("-----------------------------------------\n");
		placaMae.imprimirPlacaMae();
		memoria.imprimirMemoriaRam();
		
		double total = placaMae.getPreco() + memoria.getPreco();
		System.out.println("\n\n*****************************************");
		System.out.println("Total do pedido: R$ " + total);
		System.out.println("*****************************************");
		
	}
		
}
