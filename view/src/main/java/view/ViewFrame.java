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

class ViewFrame extends JFrame implements KeyListener {

	/** The constant serialVersionUID */		
	private static final long serialVersionUID = 1L;

	/**The controller*/
	private IController controller;

	/** the view panel*/
	private ViewPanel viewPanel;
	
	/**
	 * getter of the controller class
	 * @return the controller
	 */
	public IController getController() {
		return this.controller;
	}

	/**
	 * setter of the controller
	 * @param controller
	 * 	the controller
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
	 * update tileMap information
	 */
	public void update() {
		this.viewPanel.update(
        this.controller.getTileMap());       
	}    

	/**
	 * method used to capture the user's action
	 */
	public void keyTyped(final KeyEvent e) {

	}

	/**
	 * method used to capture the user's actions and send them to the controller
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
	 * get the user's pseudo
	 * @return a panel in which the user can enter his pseudo
	 */
	public String pseudo() {
		return JOptionPane.showInputDialog("Pseudo");
	}
	
	/**
	 * print a message
	 * @param message
	 * 	a message
	 */
	public void printMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
}