/*
 * Motionless class, abstract, will define the common properties of object created in the motionless package
 * depends on the Element Class from Model
 * 
 * @Author: Parvillers Gauthier
 * @version : 1.0
 * */

package model.motionless;

import model.Element;

/* Class used to initiate a motionless element*/
public abstract class Motionless extends Element {
	
	public Motionless(String imagePath,final boolean permeability) {
		super(imagePath, permeability);
		
	}

}
