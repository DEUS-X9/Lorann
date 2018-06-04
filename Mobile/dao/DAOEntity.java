/**
 * Class DAOEntity
 * 
 * @author Gauthier Parvillers
 * @version 1.0
 */

package model.dao;

import java.sql.Connection;
import java.sql.SQLException;

abstract class DAOEntity<E extends Entity> {
	
	/**Connection*/
	private final Connection connection;
	
	
	/**
	 * Instantiate new DAO entity
	 * 
	 * @param connection
	 * 
	 * @throws SQL exception
	 */
	public DAOEntity(final Connection connection) throws SQLException{
		this.connection = connection;
		
	}
	
	
	protected Connection getConnection() {
		return this.connection;
	}
	
	
	/**creates entity
	 * 
	 * 
	 * @param entity
	 * 
	 * @return true if successful
	 * 
	 * */
	
	public abstract boolean create(E entity);
	
	
	
	/**
	 * Delete entity
	 * 
	 * @param entity
	 * @return true if successful
	 * 
	 */
	public abstract boolean delete(E entity);
	
	/**
	 * Update entity
	 * 
	 * @param entity
	 * @return true if successful
	 */
	public abstract boolean update(E entity);
	
	
	
	/**
	 * find entity
	 *
	 *@param key
	 *@return the entity
	 */
	
	public abstract E find (String key);
	
	
}
