package abstractF;

public class Application {
	 private Button button;
	    private CheckBox checkbox;

	    public Application(GUIFactory factory) {
	        button = factory.createButton();
	        checkbox = factory.createCheckbox();
	    }

	    public void paint() {
	        button.createButton();
	        checkbox.createCheckBox();
	    }
}
