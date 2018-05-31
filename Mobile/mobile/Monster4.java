/*
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

public class Monster2 extends Mobile implements IMonster {
	
	public Monster1(Point pos) {
		super("monster_2.png", true, pos);
	}
	
	point pos = this.getPos().getLocation();
	
	MobileOrder direction = MobileOrder.random();
	
	
	@Override
    public MobileOrder getDirection(Point heroPos, IElement[][] tileMap) {
        MobileOrder direction = MobileOrder.random();
    
	}
	
}