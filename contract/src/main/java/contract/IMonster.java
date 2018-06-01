package contract;

import java.awt.Point;

public interface IMonster extends IMobile {
	
	MobileOrder getDirection(Point heroPos,IElement[][] tileMap);

}
