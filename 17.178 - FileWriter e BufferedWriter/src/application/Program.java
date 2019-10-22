package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Goord afternoon", "Good night"};
		
		String path = "c:\\temp\\out.txt";
		
		// Para não sobrescrever o arquivo e adicionar o conteúdo no próprio arquivo, adicione "true" em FileWriter(path, true)
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
