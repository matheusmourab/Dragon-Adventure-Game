package DialogueManagement;
import Mapping.NavigationManager;

public class CommandManager {
	
		private NavigationManager navigation;
	
		public CommandManager(){
			navigation = new NavigationManager();
		}
		
		public String receiveInput(String input){
			
			switch(input) {
				case "oi":
					return "Ol�";
				case "onde estou?":
					return this.position();
				case "mover para direita":
					if(navigation.moveRight()) {
						return this.position();
					} else {
						return "there are no rooms there";
					}
				case "mover para esquerda":
					if(navigation.moveLeft()) {
						return this.position();
					} else {
						return "there are no rooms there";
					}
				case "mover para frente":
					if(navigation.moveUp()) {
						return this.position();
					} else {
						return "there are no rooms there";
					}
				case "mover para traz":
					if(navigation.moveDown()) {
						return this.position();
					} else {
						return "N�o h� quartos para este lado";
					}
				case "sair":
					return "Saindo...";
				default:
					return "Comando inv�lido";
			}
		}

		private String position() {
			return "Voc� est� no " + navigation.getPosition() + ". " + navigation.getDescription();
		}
	
}
