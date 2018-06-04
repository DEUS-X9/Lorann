package contract;

import java.awt.image.BufferedImage;

	/**
	 * Represent a simple Element with a Sprite and a permeability
	 * @author pierre fleury
	 */
public interface IElement {
	
	 /**
     * @return permeability
     * @author pierre fleury
     */
    boolean getPermeability();

    /**
     * @return image
     * @author pierre fleury
     */
    BufferedImage getImage();

}
