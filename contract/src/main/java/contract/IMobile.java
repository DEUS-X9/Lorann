package contract;

import java.awt.*;

public interface IMobile {
  
   void setLocation(Point loc);

    /**
     * Only for mobile element. Get the position on the map before apply motion
     * @return the Abscissa and ordinate of the mobile element
     */
    Point getPos();

    /**
     * @param order
     * Use the order to move the element on the array map removes or decreases the abscissa OR the ordinate frome its actual position
     */
    void move(MobileOrder order);

    /**
     * @return the direction of the element
     */
    MobileOrder getDirection();

}
