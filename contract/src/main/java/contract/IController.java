package contract;

import java.awt.Point;

public interface IController {
		/**
	 	* The Interface IController.
	 	*
	 	* 
		*/
		void start();

		/**
		 * @param controllerOrder
		 * Method use in every mobile object, and also when load map, to execute the predefined order contain in the ControllerOrder list
		 * @author pierre fleury
		 */
		void orderPerform(ControllerOrder controllerOrder);

		/**
		 * @return tileMap
	     	 * @author pierre fleury
		 */
		IElement[][] getTileMap();

		/**
		 * @return Score
	         * @author pierre fleury
		 */
		int getScore();

	    /**
	     * @param direction
	     * @param currentPos
	     * @return 
	     */
	    Point computeNextPos(MobileOrder direction, Point currentPos);

		/**
	     	 * Get the level according to the number of the map played for the draw string at the bottom of the window
		 * @return Level
	    	 * @author pierre fleury
		 */
		int getLevel();

	    /**
	     * @param tilemap String representing map with binding of letter with Element
	     * @return 2-dimensional array representing game (map + mobile)
	     * @author pierre fleury
	     */
	    IElement[][] parser(String tilemap);

		String[][] getScores();
	}

}
