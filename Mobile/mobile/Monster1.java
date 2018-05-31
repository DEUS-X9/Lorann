/*
 * Monster class class of the Lorann project, will permit to create an enemy
 * 
 * @author : Gauthier Parvillers
 * @version : 1.0
 * 
 * */

package model.mobile;

import java.awt.Point;

import contract.IElement;
import contract.IMonster;
import contract.MobileOrder;

public class Monster1 extends Mobile implements IMonster {
	
	public Monster1(Point pos) {
		super("monster_1.png", true, pos);
	}
	
	
	
	@Override
    public MobileOrder getDirection(Point heroPos, IElement[][] tileMap) {
	
	point pos = this.getPos().getLocation();
	
	MobileOrder direction = MobileOrder.random();
	
	int distance = 10000;
	
	for (MobileOrder dir : MobileOrder.values()) {
		Point aroundPos = MobileOrer.getPos(pos, dir);
		if (tileMap[aroundPos.x][aroundPos.y].getPermeability()) {
			int aroundDist = (heroPos.x-aroundPos.x)*(herosPos.x-aroundPos.x) + (heroPos.y-aroundPos.y)*(herosPos.y-aroundPos.y);
			
			if(aroundDist < distance) {
				distance = aroundDist;
				direction = dir;
		}
	}

}
	return direction;
	/** Method used to get the direction of the monster depending of the hero position
	 * @param heroPos contains the position of the hero, so the monster knows what's up
	 * @param tileMap contains the map loaded in memory
	 * @return contains the direction of the monster
	 */
}

}
