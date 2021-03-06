package contract;

import java.awt.*;

public interface IMonster {
  
  /**
     * @param heroPos for Monster 1, act as an pathfinder, an "AI" for the monster
     * @param tileMap check elements permeability and size map
     * @return direction (change position of the monster on the map)
     */
    MobileOrder getDirection(Point heroPos, IElement[][] tileMap);

}
