package contract;

public class IView {
	
	/**
	 * @param controller
     * Initialize the controller
     * @author Dorian
	 */
	void setController(IController controller);

    /**
     * In the loop, refresh the view for animation, movement, and update made on the map
     * @author pierre fleury
     */
    void repaint();

    /**
     * @return height of the window
     */
    int getHeight();

    /**
     * @return width of the window
     */
    int getWidth();

    /**
     * @return pseudo
     * @author pierre fleury
     */
    String getPseudo();

	/**
	 * @param message
     * POPUP to show a message like a println but not in the console
     * @author fleury
	 */
	void printMessage(final String message);

}
