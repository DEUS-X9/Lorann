package contract;



public interface IController {
	
	void start();
	
	void orderPerform(ControllerOrder controllerOrder);

	IElement[][] getTileMap();
	
	int getScore();
	
	IElement[][] parser(String tileMap);
	
	String[][] getScores();
	
}
