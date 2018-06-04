package view;

import javax.swing.JOptionPane;

import contract.IController;
import contract.IView;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {

    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

	public void setController(IController controller) {
		// TODO Auto-generated method stub
		
	}

	public void repaint() {
		// TODO Auto-generated method stub
		
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getPseudo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void printMessage(String message) {
		// TODO Auto-generated method stub
		
	}

}
