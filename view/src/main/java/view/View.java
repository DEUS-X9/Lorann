package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

public class View implements IView, Runnable {

	
	private ViewFrame viewFrame;


	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	
	public int getHeight()
	{
		return this.viewFrame.getHeight();
	}

	
	public int getWidth()
	{
		return this.viewFrame.getWidth();
	}

   
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
	
	

	public String getPseudo() {
		return this.viewFrame.pseudo();
	}

	
	public void run() {
		this.viewFrame.setVisible(true);
	}

	
	public void repaint(){
		this.viewFrame.update();
	}

	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}


	public void printMessage(String message) {
		this.viewFrame.printMessage(message);	
	}
}
