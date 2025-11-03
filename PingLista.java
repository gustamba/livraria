import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;

public class PingLista {
	public static void main(String[] args) {
		String arquivo = "servers.txt";
		int timeout = 3000;
		
		System.out.println("=== Verificação de Ping ===");
		
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			String linha; 
			while ((linha = br.readLine()) != null) {
				if (linha.trim().isEmpty()) continue;
				
				String[] partes = linha.split(";");
				if (partes.length < 2) {
					System.out.println("Linha inválida " + linha);
					continue;
				}
				
				String nome = partes[0].trim();
				String ip = partes[1].trim();
			
				try {
					InetAddress address = InetAddress.getByName(ip);
					boolean reachable = address.isReachable(timeout);
					
					if (reachable) {
						System.out.println(nome + " -> Online");
					} else {
						System.out.println(nome + " -> Offline");
					}
				}
			}
		} catch (IOException e) {
		System.out.println(nome + " -> Erro: " + e.getMessage());
		}
	}
}