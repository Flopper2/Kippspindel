public class Controller {
	GUI theGui;
	Variable variable;

	public static void main(String[] args) {
		new Controller();
	}

	public Controller() {
		theGui = new GUI(variable = new Variable());
		
	}
}
