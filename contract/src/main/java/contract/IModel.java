package contract;
import java.awt.Point;
import java.util.Observable;

import model.IElement;

@SuppressWarnings("deprecation")
public interface IModel {
	@SuppressWarnings("deprecation")
	   Observable getObservable();
	   
	   String getMap();
	   
	   void loadMap(String key);
	   
	   IElement element(char c, Point pos);
	   
	   String[][] getHighScore();
	   
	   void upNameAndScore(final int score, final String nickname);


}
