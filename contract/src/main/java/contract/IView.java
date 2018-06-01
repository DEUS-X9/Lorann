package contract;

public interface IView {
	
	void setController(IController controller);
	
	void repaint();
	
	int getHeight();
	
	int getWidth();
	
	void printMessage(final String message);

}
