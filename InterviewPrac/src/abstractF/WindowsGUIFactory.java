package abstractF;

public class WindowsGUIFactory implements GUIFactory{
	@Override
	public Button createButton() {
		return new WindowButton();
	}
	@Override
	public CheckBox createCheckbox() {
		return new WindowsCheckBox();
	}
}
