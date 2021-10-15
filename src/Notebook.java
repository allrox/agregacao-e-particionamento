import java.util.Scanner;

public class Notebook {

	private String modelo;
	private double preco;
	private int ano;
		
	/**
	 * Getter e setter modelo
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
	 * Getter e setter preco
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
	
	/**
	 * Getter e setter ano
	 * @param $ano
	 */
	public void setAno(int $ano) {
		if($ano > 1990) {
			ano = $ano;
		}
	}
	
	public int getAno() {
		return ano;
	}
	
	/**
	 * Método de impressão
	 */
	public void imprimirNotebook() {
		System.out.println("\nExibindo informações do Notebook");
		System.out.println("Modelo:\t " + getModelo());
		System.out.println("Ano:\t " + getAno());
		System.out.println("Preço:\t " + getPreco());		
	}
	
	/**
	 * Método de cadastro
	 */
	public void cadastrarNotebook() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nCadastrando um novo modelo Notebook");
		System.out.println("Modelo:\t");
		setModelo(scan.next());
		System.out.println("Ano:\t");
		setAno(Integer.parseInt(scan.next()));
		System.out.println("Preço:\t");
		setPreco(Double.parseDouble(scan.next()));
		scan.close();
	}
	
		
}
