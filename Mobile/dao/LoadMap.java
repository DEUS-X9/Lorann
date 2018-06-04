package model.dao;

public class LoadMap extends Entity {
	
	private int id;
	
	private String key;
	
	private String map;
	
	
	public LoadMap(final int id, final String key, final String map)
	{
		this.setId(id);
		this.setKey(key);
		this.setMap(map);
		
	}
	
	public LoadMap() {
        this(0, "", "");
    }
	
	public int getId() {
        return this.id;
    }
	
	 public void setId(final int id) {
	        this.id = id;
	 }
	 
	 public String getKey() {
	        return this.key;
	 }
	 
	 public void setKey(final String key) {
	        this.key = key;
	    }

	 public String getMap() {
	        return this.map;
	    }
	 
	 public void setMap(final String map) {
	        this.map = map;
	    }
	 

}
