/**
 * Model class, will permit to instantiate the map
 * 
 * @author Gauthier Parvillers
 * v1.2
 */

package model;

import java.awt.*;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Observable;

import contract.IElement;
import contract.IModel;
import model.mobile.*;
import model.motionless.*;
import model.dao.*;

public class Model extends Observable implements IModel {
	
	private String map = "";
			/**the map will be stocked here*/
			
	private int score = 0;
	/**creation of the score*/
	
	/**instantiation of a new model*/
	public Model() {
		
		
	}
		
		/**association of letter with a sprite*/
		
		public IElement element(char c, Point pos) {
			switch (c) {
			
			case '' :
				return new Bone();
				
			case '' :
				return new HorizontalBone();
				
			case '' :
				return new VerticalBone();
				
			case '' :
				return new EnergyBubble();
				
			case '' :
				return new ClosedDoor();
				
			case '' :
				return new Purse();
				
			case '' :
				return new Hero(pos);
				
			case '' :
				return new Sorcery(pos);
				
			case '' :
				return new Monster1(pos);
				
			case '' :
				return new Monster2(pos);
				
			case '' :
				return new Monster3(pos);
				
			case '' :
				return new Monster4(pos);
			
			case '' :
				return new Score();
				
			case '' :
				return new Title();
				
			case '' :
				return empty();
			}
			
			public Observable getObservable() {
				return this.map;
			}
			
			public String getMap() {
				return this.map;
				/**
				 * get the map and @return it
				 */
			}
			
			private void setMap(final String map) {
				this.map = map;
				this.setChanged();
				this.notifyObservers();
				/**Sets the map
				 * @param map contains the String of the map
				 */
			}
			
			public void loadMap(String key) {
				try {
					final DAOLoadMap daoLoadMap = new DAOLoadMap(LorannBDDConnector.getInstance().getConnection());
					this.setMap(daoLoadMap.find(key).getMap());
				} catch (final SQLException e) {
					e.printStackTrace();
				}}
				
				
				/** upload of the score to the database
				 * @param score contains the score
				 * @nickname contains the nickname of the player
				 */
				
				public void  upNameAndScore(int score, String nickname) {
					try
					
					{
						 final DAOUploadScore daoUploadScore = new DAOUploadScore(LorannBDDConnector.getInstance().getConnection());
						 daoUploadScore.upNameAndScore(score,nickname);
					}
					
					catch (final SQLException e)
					{
						e.printStackTrace();
					}
				}
				
				
				
				public String[][] getHighSore()
				{
					try {
						final DAOGetHighscore daoGetHighscore = new DAOGetHighscore(LorannBDDConnector.getInstance().getConnection());
						return (daoGetHighscore.getHighScore());
					}
					catch (final SQLException e)
					{
						e.printStackTrace();
					}
					return null;
				}
			}
			

			
}
