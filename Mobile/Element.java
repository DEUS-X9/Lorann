/**
 * Element class of the Lorann project
 * 
 * @author : Gauthier Parvillers
 * @version : 1.0
 * 
 * */


package model;

import java.awt.image.BufferedImage;
import java.util.Observable;


public abstract class Element implements IElement {
	
	protected BufferedImage image;
	protected boolean permeability;
	
	public BufferedImage getImage() {
		return image;
		/**
		 * 
		 * This will permit to access the image and use it here
		 * 
		 * 
		 * */
	}

	public boolean isPermeability() {
		return permeability;
		
		/**
		 * will permit to get the permeability of the "surface"
		 * true or false
		 * */
	}


	
	public Element(String path, boolean permability) {
		
	}
	
	protected static BufferedImage loadSprite(String path) {
		
	}
	
	

}
