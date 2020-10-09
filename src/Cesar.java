import java.util.Scanner;

public class Cesar {
	public String encriptar(int chave, String texto){
		StringBuilder textoCifrado = new StringBuilder();
		int tamanhoTexto = texto.length();
		
		for(int c=0; c < tamanhoTexto; c++){
			int letraCifradaASCII = ((int) texto.charAt(c)) + chave;
			
			while(letraCifradaASCII > 126)
				letraCifradaASCII -= 94;

			textoCifrado.append( (char)letraCifradaASCII );
		}
		
		return textoCifrado.toString();
	}
	
	public String decriptar(int chave, String textoCifrado){
		StringBuilder texto = new StringBuilder();
		int tamanhoTexto = textoCifrado.length();
		
		for(int c=0; c < tamanhoTexto; c++){
			int letraDecifradaASCII = ((int) textoCifrado.charAt(c)) - chave;
			
			while(letraDecifradaASCII < 32)
				letraDecifradaASCII += 94;

			texto.append( (char)letraDecifradaASCII );
		}
		
		return texto.toString();
	}
	
	public void start() {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("1 - Encriptar\n2 - Decriptar");
			int opcao = sc.nextInt();
			
			if (opcao == 1) {
				System.out.println("Informe a chave para a criptografia: (Número inteiro)");
				int chave = sc.nextInt();
				
				System.out.println("Informe o texto a ser criptografado: ");
				String text = sc.next();
				
				System.out.println(encriptar(chave, text));
			} else if (opcao == 2) {
				System.out.println("Informe a chave para a decriptografia: (Número inteiro)");
				int chave = sc.nextInt();
				
				System.out.println("Informe o texto a ser decriptografado: ");
				String text = sc.next();
				
				System.out.println(decriptar(chave, text));
			} else {
				System.out.println("Opção inválida, execute o programa novamente.");
			}
			
			sc.close();
		} catch (RuntimeException e) {
			System.out.println("A chave de deslocamento foi informada incorretamente.");
		    System.out.println("Execute o programa novamente e entre com uma chave valida.");
		}
	}
}