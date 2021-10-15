import java.util.Scanner;

public class PlacaMae {
	
	private String modelo, fabricante;
	private int ano;
	private double preco;

	/**
	 * Modelo
	 * @param $modelo
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
	 * Fabricamte
	 * @param $fabricante
	 */
	public void setFabricante(String $fabricante) {
		if(!$fabricante.isEmpty()) {
			fabricante = $fabricante;
		}
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	/**
	 * Ano
	 * @param $ano
	 */
	public void setAno(int $ano) {
		if($ano > 0) {
			ano = $ano;
		}
	}
	
	public int getAno() {
		return ano;
	}
	
	/**
	 * Preço
	 * @param $preco
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
	public void cadastrarPlacaMae() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nInformações da Placa-Mãe");
		System.out.println("-----------------------------------------");
		System.out.println("Modelo: ");
		this.setModelo(scan.nextLine());
		System.out.println("Fabricante: ");
		this.setFabricante(scan.nextLine());
		System.out.println("Ano de Fabricação: ");
		this.setAno(Integer.parseInt(scan.next()));
		System.out.println("Preço: ");
		this.setPreco(Double.parseDouble(scan.next()));
	}
	
	public void imprimirPlacaMae() {
		System.out.println("\nInformações da Placa-Mãe");
		System.out.println("-----------------------------------------");
		System.out.println("Modelo:\t\t\t" + this.getModelo());
		System.out.println("Fabricante:\t\t" + this.getFabricante());
		System.out.println("Ano de Fabricação:\t" + this.getAno());
		System.out.println("Preço:\t\t\tR$ " + this.getPreco());
	}
	
	
}
