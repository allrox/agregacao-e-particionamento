import java.util.Scanner;

public class MemoriaRam {
	
	private String modelo;
	private double preco;

	/**
	 * Memória
	 * @param $memoria
	 */
	public void setModelo(String $modelo) {
		if(!$modelo.isEmpty()) {
			modelo = $modelo;
		}
	}
	
	public String getModelo() {
		return modelo;
	}
	
	/**
	 * Unidades
	 * @param $unidades
	 */
	public void setPreco(double $preco) {
		if($preco > 0) {
			preco = $preco;
		}
	}
	
	public double getPreco() {
		return preco;
	}
	
	@SuppressWarnings("resource")
	public void cadastrarMemoria() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nInformações da Memória RAM");
		System.out.println("-----------------------------------------");
		System.out.println("Descrição: ");
		this.setModelo(scan.nextLine());
		System.out.println("Preço: ");
		this.setPreco(Double.parseDouble(scan.next()));
	}
	
	public void imprimirMemoriaRam() {
		System.out.println("\nInformações da Memória RAM");
		System.out.println("-----------------------------------------");		
		System.out.println("Modelo:\t\t\t" + this.getModelo());
		System.out.println("Preço:\t\t\tR$ " + this.getPreco());
	}	
	
	
}
