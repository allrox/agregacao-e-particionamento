import java.util.Scanner;

public class MemoriaRam {
	
	private String modelo;
	private double preco;

	/**
	 * Mem�ria
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
		
		System.out.println("\nInforma��es da Mem�ria RAM");
		System.out.println("-----------------------------------------");
		System.out.println("Descri��o: ");
		this.setModelo(scan.nextLine());
		System.out.println("Pre�o: ");
		this.setPreco(Double.parseDouble(scan.next()));
	}
	
	public void imprimirMemoriaRam() {
		System.out.println("\nInforma��es da Mem�ria RAM");
		System.out.println("-----------------------------------------");		
		System.out.println("Modelo:\t\t\t" + this.getModelo());
		System.out.println("Pre�o:\t\t\tR$ " + this.getPreco());
	}	
	
	
}
