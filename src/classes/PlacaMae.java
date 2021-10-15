package classes;
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
	 * Pre�o
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
		
		System.out.println("\nInforma��es da Placa-M�e");
		System.out.println("-----------------------------------------");
		System.out.println("Modelo: ");
		setModelo(scan.nextLine());
		System.out.println("Fabricante: ");
		setFabricante(scan.nextLine());
		System.out.println("Ano de Fabrica��o: ");
		setAno(Integer.parseInt(scan.next()));
		System.out.println("Pre�o: ");
		setPreco(Double.parseDouble(scan.next()));
	}
	
	public void imprimirPlacaMae() {
		System.out.println("\nInforma��es da Placa-M�e");
		System.out.println("-----------------------------------------");
		System.out.println("Modelo:\t\t\t" + getModelo());
		System.out.println("Fabricante:\t\t" + getFabricante());
		System.out.println("Ano de Fabrica��o:\t" + getAno());
		System.out.println("Pre�o:\t\t\tR$ " + getPreco());
	}
	
	
}
