/**
 * Hero class of the Lorann project, will permit to create the character
 * 
 * @author : Gauthier Parvillers
 * @version : 1.0
 * 
 * */

package model.mobile;

import model.Element;

import java.awt.*;

import contract.IElement;
import contract.IHero;
import contract.IView;
import contract.MobileOrder;

public class Hero extends Mobile implements IHero {
	
	public Hero(Point pos) {
		super("lorann_b.png", true, pos);
	}
	
	
	public void move(MobileOrder order, IElement[][] tileMap, IView view) {
		/**
		 * This function will permit to move the character around
		 * 
		 */
		
		switch (order) {
		
		case Left:
			if(this.direction == MobileOrder.Left && this.pos.y > 0 && tileMap[this.pos.x][this.pos.y - 1].getpermeability()){
				this.pos.setLocation(
					this.pos.getX(),
					this.pos.getY() - 1);
			} else {
                this.image = Element.loadSprite("lorann_l.png");
            }
            break;
			
			
		case Right:
			if(this.direction == MobileOrder.Right && this.pos.y > 0 && tileMap[this.pos.x][this.pos.y + 1].getpermeability()){
				this.pos.setLocation(
					this.pos.getX(),
					this.pos.getY() + 1);
			} else {
                this.image = Element.loadSprite("lorann_r.png");
            }
            break;
			
			
		case Up:
			if(this.direction == MobileOrder.Up && this.pos.y > 0 && tileMap[this.pos.x + 1][this.pos.y].getpermeability()){
				this.pos.setLocation(
					this.pos.getX() + 1,
					this.pos.getY());
			} else {
                this.image = Element.loadSprite("lorann_u.png");
            }
            break;
			
			
		case Down:
			if(this.direction == MobileOrder.Down && this.pos.y > 0 && tileMap[this.pos.x - 1][this.pos.y].getpermeability()){
				this.pos.setLocation(
					this.pos.getX() - 1,
					this.pos.getY());
			} else {
                this.image = Element.loadSprite("lorann_d.png");
            }
            break;
		
	}
		this.direction = order;
		}

}
