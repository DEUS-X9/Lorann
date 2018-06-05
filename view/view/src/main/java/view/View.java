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

	/** The frame. */
	private final ViewFrame viewFrame;

	/**
	 * constructor of the View class
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	/**
	 * height's getter
	 * @return height of the window
	 */
	public int getHeight()
	{
		return this.viewFrame.getHeight();
	}

	/**
	 * width's getter
	 * @return width of the window
	 */
	public int getWidth()
	{
		return this.viewFrame.getWidth();
	}

    /**
	 * Management of the user's actions
	 *
	 * @param keyCode
	 *          the key code
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
	 * Print a message via a frame
	 * @param message
	 * 	a message 
	 * 
	 */
	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}

	public String getPseudo() {
		return this.viewFrame.pseudo();
	}

	/**
	 * Launch the application
	 *	 
	 */
	public void run() {
		this.viewFrame.setVisible(true);
	}

	/**
	 * Update information and refresh
	 *	 
	 */
	public void repaint(){
		this.viewFrame.update();
	}

	/**
	 * controller's setter
	 *
	 * @param controller
	 *          the controller	 *
	 
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}
}
