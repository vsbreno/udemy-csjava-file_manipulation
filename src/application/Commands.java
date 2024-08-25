package application;

import java.io.File;
import java.util.Scanner;

public class Commands {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = scan.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName()); // retorna somente o nome do arquivo
		System.out.println("getParent: " + path.getParent()); // retorna o caminho, sem o arquivo
		System.out.println("getPath: " + path.getPath()); // retorna o caminho completo
		
		scan.close();
	}

}
