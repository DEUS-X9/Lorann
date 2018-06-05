package view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.IController;
import contract.IModel;


class ViewFrame extends JFrame implements KeyListener {

		
	private IController controller;


	private ViewPanel viewPanel;
	
	
	public IController getController() {
		return this.controller;
	}


	protected void setController(final IController controller) {
		this.controller = controller;		
	}
	
	public ViewFrame() {
		this.setTitle("Lorann");
		this.viewPanel = new ViewPanel(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setContentPane(this.viewPanel);
		this.setSize(656, 464);
		this.setLocationRelativeTo(null);
	}

	
	public void update() {
		this.viewPanel.update();
        this.controller.getTileMap();        
	}    

	
	public void keyTyped(final KeyEvent e) {

	}

	
	public void keyPressed(final KeyEvent e) {
		this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode()));
	}

	
	public void keyReleased(final KeyEvent e) {

	}

	public String pseudo() {
		return JOptionPane.showInputDialog("Pseudo");
	}
}
