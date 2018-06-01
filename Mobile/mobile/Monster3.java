/**
 * Monster class class of the Lorann project, will permit to create an enemy
 * 
 * @author : Gauthier Parvillers
 * @version : 1.0
 * 
 * */

package model.mobile;

import java.awt.Point;

import contract.*;
import java.awt.*;
import java.util.ArrayList;

public class Monster3 extends Mobile implements IMonster {
	
	public Monster3(Point pos) {
		super("monster_3.png", true, pos);
	}
	
	point pos = this.getPos().getLocation();
	
	MobileOrder direction = MobileOrder.random();
	
	
	@Override
    public MobileOrder getDirection(Point heroPos, IElement[][] tileMap) {
        MobileOrder direction = MobileOrder.random();
    
	}
	
}
