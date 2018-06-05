package contract;

public class IView {
	
	/**
	 * @param controller
    	 * Initialize the controller
     	 * @author  pierre fleury
	 */
	void setController(IController controller);

    /**
     * In the loop, refresh the view for animation, movement, and update made on the map
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
     */
    String getPseudo();

	/**
	 * @param message
         * POPUP to show a message like a println but not in the console
	 */
	void printMessage(final String message);

}
