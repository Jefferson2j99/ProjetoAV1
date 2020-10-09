import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Digite o número do método que você deseja utilizar para criptografia: \n"
				+ "1 - CESAR\n"
				+ "2 - Playfair\n"
				+ "3 - Polialfabético\n"
				+ "4 - Produto");
		
		Scanner sc = new Scanner(System.in);
		
		switch(sc.nextInt()) {
		case 1: 
			Cesar cesar = new Cesar();
			
			cesar.start();
			break;
		case 2: 
			Playfair playfair = new Playfair();
			
			playfair.start();
			break;
		case 3:
			Polialfabetico polialfabetico = new Polialfabetico();
			
			polialfabetico.start();
			break;
		case 4:
			Produto produto = new Produto();
			
			produto.start();
		}
		
		sc.close();
	}
}
