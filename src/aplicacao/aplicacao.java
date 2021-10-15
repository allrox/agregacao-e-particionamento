package aplicacao;
import classes.*;

public class aplicacao {

	public static void main(String[] args) {
		
		/**
		 * Declaração das variáveis
		 */
		Desktop pc = new Desktop();
		MemoriaRam memoria = new MemoriaRam();
		PlacaMae placaMae = new PlacaMae();
		
		/**
		 * Aplicação dos métodos de cadastro
		 */
		pc.cadastrarDesktop();
		placaMae.cadastrarPlacaMae();
		memoria.cadastrarMemoria();
	
		/**
		 * Impressão dos dados coletados
		 */
		System.out.println("\n-----------------------------------------");
		System.out.println("Confira as especificações do equipamento:");
		System.out.println("-----------------------------------------\n");
		placaMae.imprimirPlacaMae();
		memoria.imprimirMemoriaRam();
		
		double total = placaMae.getPreco() + memoria.getPreco();
		System.out.println("\n\n*****************************************");
		System.out.println("Total do pedido: R$ " + total);
		System.out.println("*****************************************");
		
	}
		
}
