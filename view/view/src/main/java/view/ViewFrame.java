package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.IController;
import contract.IModel;

/**
 * The ViewFrame class
 * @author Méline AMBROSINI
 *@version v.4
 */

public class ViewFrame extends JFrame implements KeyListener {

	/**
	 * the serialVersionUID
	 */
	private static final long serialVersionUID = -7431742421957875716L;

	/** The controller. */
	private IController controller;

	/** The view panel*/
	private ViewPanel viewPanel;	
	
	/**
	 * Controller class's getter
	 *
	 * @return the controller
	 */
	public IController getController() {
		return this.controller;
	}

	/**
	 * Controller class's setter
	 *
	 * @param controller
	 *          the new controller
	 */
	protected void setController(final IController controller) {
		this.controller = controller;		
	}


	/**
	 * constructor of this class
	 * instantiates a new view frame
	 * 	  
	 * @param model
	 * 	the model
	 */
	public ViewFrame(IModel model) {
		this.setTitle("Lorann");
		this.viewPanel = new ViewPanel(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setContentPane(this.viewPanel);
		this.setSize(656, 464);
		this.setLocationRelativeTo(null);
	}

	/**
	 * Update tileMap informations
	 */
	public void update() {
		this.viewPanel.update(
                this.controller.getTileMap()
        );
	}
	
	/**
     * Modified windows size taking border in count
     *
     * @param width
     * @param height
     */
    public void setSize(int width, int height) {
        super.setSize(width + this.getInsets().left + this.getInsets().right,
                height + this.getInsets().top + this.getInsets().bottom);
    }
    

	/**
	 * Print a message.
	 *
	 * @param message
	 *          the message
	 */
	public void printMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	/**
	 * method used to capture the user's action
	 */
	public void keyTyped(final KeyEvent e) {

	}

	/**
	 * method used to capture the user's actions and send them to the controller
	 *
	 */
	public void keyPressed(final KeyEvent e) {
		this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode()));
	}

	/**
	 * method used to capture the user's action
	 */
	public void keyReleased(final KeyEvent e) {

	}

	/**
	 * Get the user's pseudo
	 * @return user pseudo
	 */
	public String pseudo() {
		return JOptionPane.showInputDialog("Pseudo");
	}
}