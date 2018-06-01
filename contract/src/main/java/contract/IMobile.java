package contract;

import java.awt.Point;

public interface IMobile {

	void setLocation(Point loc);
	
	Point getPos();
	
	void move(MobileOrder order);
	
	MobileOrder getDirection();
	
}
