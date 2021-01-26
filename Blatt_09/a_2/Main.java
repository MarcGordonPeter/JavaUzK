package a_2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
	
	final static String path = "/Users/Marc/Desktop/JavaUzK/datei";
	
	final static int TAB_INT = java.lang.Character.getType('\t');
	
	public static void main(String[] args) {
		File f = new File(path);
		File fneu = new File(path + ".stripped");
		if(f.exists()) {
			try {
				fneu.delete();
				f.createNewFile();
				int i;
				FileReader fr = new FileReader(f);
				FileWriter fw = new FileWriter(fneu);
				while ((i = fr.read()) != -1) {
					if(i != ' ' && i != '\t') {
						fw.write(i);
					}
				}
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} else {
			try {
				String message = "Hallo \nMein Name ist:\n\t\t Marc";
				f.createNewFile();
				FileWriter fw = new FileWriter(f);
				fw.write(message);
				fw.close();
				System.out.println("Datei erstellt");
				main(args);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
