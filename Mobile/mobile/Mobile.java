/*
 * Mobile class of the Lorann project
 * 
 * @author : Gauthier Parvillers
 * @version : 1.0
 * 
 * */

package model.mobile;

import java.awt.Point;

import model.Element;
import contract.IMobile;
import contract.IModel;
import contract.MobileOrder;

public abstract class Mobile extends Element implements IMobile {
	/*Class creating mobile class, using the Element class and the Interface IMobile*/

	Mobile(String imagePath,final boolean permeability, point pos){
		super(imagePath, permeability);
		this.pos.setLocation(pos);
	}
	/*
	 * Constructor of the Mobile Class
	 */
	
	
	public Point getPos() {
		return pos.location;
	}
	/*
	 * method returning the mobile position
	 * */
	
	
	protected Point pos = new Point();
	/*
	 * Variable containing the mobile position of the object associated
	 */
	
	
	protected MobileOrder direction = MobileOrder.Down
	/*
	 * Variable containing the Direction of the mobile object, initiated at down
	 */
	
	public void setLocation(Point loc) {
		this.pos.setLocation(loc);
	}
	
	public MobileOrder getDirection() {
		return direction;
		
	}
	
	
	
	public move(MobileOrder movement) {
		
		switch (movement) {
		case Left:
			this.pos.setLocation(
					this.pos.getX(),
					this.pos.getY() - 1);
			
			break;
			
			
			
		case Right :
			this.pos.setLocation(
					this.pos.getX(),
					this.pos.getY() + 1);
			
			break;
			
			
			
		case Up :
			this.pos.setLocation(
					this.pos.getX() + 1,
					this.pos.getY());
			
			break;
			
			
		case Down :
			this.pos.setLocation(
					this.pos.getX() - 1,
					this.pos.getY());
			
			break;
		}
		this.direction = movement;
		System.out.println("POS : " + pos);
	}
	
	/*
	 * The move method will transcribe the directional key entered into a "real" movement on the game world
	 * */

}
