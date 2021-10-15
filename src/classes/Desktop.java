package classes;
import java.util.Scanner;

public class Desktop {

	private String modelo;
	private int ano;
	
	public MemoriaRam memoria = new MemoriaRam();
	
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
	 * Método de cadastro
	 */
	@SuppressWarnings("resource")
	public void cadastrarDesktop() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informações do Desktop");
		System.out.println("-----------------------------------------");
		System.out.println("Modelo:\t");
		setModelo(scan.nextLine());
		System.out.println("Ano:\t");
		setAno(Integer.parseInt(scan.next()));
	}
	
		
}
