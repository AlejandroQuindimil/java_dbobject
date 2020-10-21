package codigo.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import codigo.db.DbObject;

public class Usuario extends DbObject{

	private static final String TABLE = "usuario";
	private static final ArrayList COLS = getArrayCols();
	
	private int id = 0;
	public String login = ""; 
	private String pass = "";
	public int edad = 0;
	
	@Override
	public int getId() {
		return this.getId();
	}

	public void setId(int id) {
		this.id = id;
	}
	

	@Override
	public String getTable() {
		return TABLE;
	}

	@Override
	public ArrayList getCols() {
		return COLS;
	}

	private static ArrayList getArrayCols() {
		ArrayList list = new  ArrayList();
		list.add("login");
		list.add("pass");
		list.add("edad");
		return list;
	}
	@Override
	public ArrayList getValues() {
		ArrayList list = new  ArrayList();
		list.add(this.login);
		list.add(this.getPass());
		list.add(this.edad);
		return list;
	}

	@Override
	public DbObject parse(ResultSet rs) throws SQLException {
		Usuario user = new Usuario(); 
		user.login = rs.getString("login");
		user.setPass(rs.getString("pass"));
		user.edad = rs.getInt("edad");
		return user;
	}
	  
	@Override
	public String toString() {
		return"Login :"+this.login+"-> Password: "+this.getPass()+" - Edad" +this.edad ;
		
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
