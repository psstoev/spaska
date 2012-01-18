package spaska.gui;

import java.io.File;

public class DataInputResource {
	
	public static final int FILE = 0;
	public static final int TABLE = 1;
	
	private int type;
	private String tableName = null;
	private String jdbcConnectionString = null;
	private File openedFile = null;
	
	public DataInputResource(String tableName, String jdbcConnectionString) {
		this.tableName = tableName;
		this.jdbcConnectionString = jdbcConnectionString;
		this.type = TABLE;
	}
	
	public DataInputResource(File file) {
		this.openedFile = file;
		this.type = FILE;
	}
	
	public int getType() {
		return this.type;
	}
	
	public Object getResource() {
		if (this.type == TABLE) {
			return this.tableName;
		} else if (this.type == FILE) {
			return this.openedFile;
		}
		return null;
	}
	
	public String getJdbcConnectionString() {
		return this.jdbcConnectionString;
	}

}
