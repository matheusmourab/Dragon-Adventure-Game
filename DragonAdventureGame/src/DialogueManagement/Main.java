package DialogueManagement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CommandManager comandManager = new CommandManager();
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		
		System.out.print("Digite os comandos: \n");
		while(!input.equals("sair")) {
			input = scanner.nextLine();
			String answer = comandManager.receiveInput(input);
			System.out.println(answer);
		}
		scanner.close();
	}

}
