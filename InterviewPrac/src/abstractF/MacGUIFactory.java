package abstractF;

public class MacGUIFactory implements GUIFactory{
	@Override
	public Button createButton() {
		return new MacButton();
	}
	@Override
	public CheckBox createCheckbox() {
		return new MacCheckBox();
	}
}
