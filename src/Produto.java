import java.util.Scanner;

public class Produto {
	public static String criptografar(String msg, int chave) {
		String msgCript = "";
		
		for (int i = 0; i < msg.length(); i++) {
			msgCript  += (char) (msg.charAt(i) + chave);
		}
		
		return msgCript;
	}
	
	public static String decriptografar(String msgCript, int chave) {
		String msg = "";
		
		for (int i = 0; i < msgCript.length(); i++) {
			msg  += (char) (msgCript.charAt(i) - chave);
		}
		
		return msg;
	}
	
	public void start() {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Informe o texto: ");
			String texto = sc.next();
			
			System.out.println("Informe a chave");
			int chave = sc.nextInt();
			
			System.out.println("1 - Encriptar\n2 - Decriptar");
	        int opcao = sc.nextInt();
			
	        if (opcao == 1) {
	        	String msgCifrada = criptografar(texto, chave);
	        	
	        	System.out.println("Mensagem criptografada: " + msgCifrada);
	        } else if (opcao == 2) {
	        	String msgReal = decriptografar(texto, chave);
	        	
	        	System.out.println("Mensagem decriptografada: " + msgReal);
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
