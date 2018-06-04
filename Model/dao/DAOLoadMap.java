/**
 * data access object load map class
 * 
 * @author Gauthier  Parvillers
 * 
 * @version 1.7
 */

package model.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOLoadMap extends DAOEntity<LoadMap> {
	
	/**
	 * Instantiation of a new DAO Load Map
	 *
	 *@param connection = the connection
	 *
	 *@throws SQLException = the SQL exception
	 */
	
	public DAOLoadMap(final Connection connection) throws SQLException {
		super(connection);
	}
	
	
	//@Override
	public Entity find(final int score_id) {
		LoadMap loadmap = new LoadMap();
		
		try {
            final String sql = "{call loadmapById(?)}";
            final CallableStatement call = this.getConnection().prepareCall(sql);
            call.setInt(1, score_id);
            call.execute();
            final ResultSet resultSet = call.getResultSet();
            if (resultSet.first()) {
                loadmap = new LoadMap(score_id, resultSet.getString("key"), resultSet.getString("map"));
            }
            return loadmap;
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
	
	
	
	/**
    *
    *
    * @see model.DAOEntity#find(java.lang.String)
    */
	@Override
    public LoadMap find(final String key) {
        LoadMap loadMap = new LoadMap();

        try {
            final String sql = "{call loadmapByKey(?)}";
            final CallableStatement call = this.getConnection().prepareCall(sql);
            call.setString(1, key);
            call.execute();
            final ResultSet resultSet = call.getResultSet();
            if (resultSet.first()) {
                loadMap = new LoadMap(resultSet.getInt("id"), key, resultSet.getString("map"));
            }
            return loadMap;
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


	@Override
	public boolean create(LoadMap entity) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean delete(LoadMap entity) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean update(LoadMap entity) {
		// TODO Auto-generated method stub
		return false;
	}



}
