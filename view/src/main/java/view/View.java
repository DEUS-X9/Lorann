package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The View class
 * @author Méline AMBROSINI
 *@version v.4
 */

public class View implements IView, Runnable {

	/** The frame */
	private ViewFrame viewFrame;

	/** 
	 * constructor of the View class
	 * Instantiates a new view
	 * 
	 * @param model
	 * 			the model
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	/**	 
	 * @return height of the window
	 */
	public int getHeight()
	{
		return this.viewFrame.getHeight();
	}

	/**
	 * @return width of the window
	 */
	public int getWidth()
	{
		return this.viewFrame.getWidth();
	}

   /**Management of the users' actions
    * 
    * @param keyCode
    * 	the key code
    * @return the controller order
    */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_NUMPAD1:
				return ControllerOrder.MAP1;
			case KeyEvent.VK_NUMPAD2:
				return ControllerOrder.MAP2;
			case KeyEvent.VK_NUMPAD3:
				return ControllerOrder.MAP3;
			case KeyEvent.VK_NUMPAD4:
				return ControllerOrder.MAP4;
            		case KeyEvent.VK_NUMPAD5:
            			return ControllerOrder.MAP5;			
            		case KeyEvent.VK_M:
                		return ControllerOrder.MENU;            
			case KeyEvent.VK_LEFT:
				return ControllerOrder.MOVELEFT;
			case KeyEvent.VK_RIGHT:
				return ControllerOrder.MOVERIGHT;
			case KeyEvent.VK_DOWN:
				return ControllerOrder.MOVEDOWN;
			case KeyEvent.VK_UP:
				return ControllerOrder.MOVEUP;
            		case KeyEvent.VK_SPACE:
                		return ControllerOrder.FIRE;
            		case KeyEvent.VK_ESCAPE:
            			return ControllerOrder.ESCAPE;
			
			default:
				return null;
		}
	}
	
	/**
	 * Get the user's pseudo
	 * @ return User's pseudo
	 */

	public String getPseudo() {
		return this.viewFrame.pseudo();
	}

	/**
	 * Launch the application
	 */
	public void run() {
		this.viewFrame.setVisible(true);
	}

	/**
	 * update informations and refresh
	 */
	public void repaint(){
		this.viewFrame.update();
	}

	/**
	 * Set the controller
	 * @param controller
	 * 	the controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}

/**
 * Print a message
 * @param message
 * 	a message
 */
	public void printMessage(String message) {
		this.viewFrame.printMessage(message);	
	}
}
