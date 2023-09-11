package abstractF;

public class AbstractFRunner {
	public static Application configure(String input) {
		Application application;
		GUIFactory guiFactory;
		if(input.equalsIgnoreCase("Mac")) {
			guiFactory= new MacGUIFactory();
		}else {
			guiFactory= new WindowsGUIFactory();
		}
		application= new Application(guiFactory);
		return application;
	}
	public static void main(String[] args) {
		Application app = configure("Mac");
        app.paint();
	}

}
