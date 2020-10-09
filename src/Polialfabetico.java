import java.util.Scanner;

public class Polialfabetico {
	public static String encriptar(int chave, String texto) {
	    StringBuilder textoCifrado = new StringBuilder();
	    int tamanhoTexto = texto.length();

	    for (int c = 0; c < tamanhoTexto; c++) {
	        int letraCifradaASCII = ((int) texto.charAt(c)) + chave;

	        while (letraCifradaASCII > 126) {
	            letraCifradaASCII -= 94;
	        }

	        textoCifrado.append((char) letraCifradaASCII);
	    }

	    return textoCifrado.toString();
	}

	public static String decriptar(int chave, String textoCifrado) {
	    StringBuilder texto = new StringBuilder();
	    int tamanhoTexto = textoCifrado.length();

	    for (int c = 0; c < tamanhoTexto; c++) {
	        int letraDecifradaASCII = ((int) textoCifrado.charAt(c)) - chave;

	        while (letraDecifradaASCII < 32) {
	            letraDecifradaASCII += 94;
	        }

	        texto.append((char) letraDecifradaASCII);
	    }

	    return texto.toString();
	}

	public void start() {

		 try {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Informe o texto: ");
		        String texto = sc.nextLine();
		        System.out.print("Informe a chave de deslocamento: ");
		        int chave = sc.nextInt();
		        
		        System.out.println("1 - Encriptar\n2 - Decriptar");
		        int opcao = sc.nextInt();
		        
		        if (opcao == 1) {
		        	String textoCriptografado = encriptar(chave, texto);
		        	
		        	System.out.println("\n\nTEXTO CRIPTOGRAFADO: " + textoCriptografado);
		        } else if (opcao == 2) {
		        	String textoDescriptografado = decriptar(chave, texto);
		        	
		        	System.out.println("TEXTO DESCRIPTOGRAFADO: " + textoDescriptografado);
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
