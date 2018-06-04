/**
 *
 * Sorcery Class of the Lorann project
 * 
 * @author : Gauthier Parvillers
 * @version : 1.0
 * 
 *
 */

package model.mobile;

import model.Element;

public class Sorcery extends Mobile implements ISorcery {
/**
 * Class which will permit thou to cast a powerful spell to defeat your enemy!!
 */
	
	private int speed = 1;
	/**
	 * Speed of the sorcery
	 * @variable  speed permit to do the multicolor aspect during the movement
	 */
	
	public int getSpeed() {
		return speed;
		/**
		 *  @return the "speed" of the sorcery
		 */
	}

	public Sorcery(Point pos) {
		super("fireball_1", true, pos);
		/**
		 * creation of the sorcery object
		 * @param pos permit to know it's position
		 * @param permeability permit to know if object can move on it
		 */
	}
	
	public void setDirection(MobileOrder direction){
		this.direction = direction;
		/**
		 * set the direction to go for the spell
		 */
		
	}
	
	
	public void animate() {
		this.speed++;
		if(this.speed > 0 && this.speed < 6) {
			this.image = Element.loadSprite(String.format("fireball_%d.png", this.speed));
		}
	}
	
	
	
	
}
