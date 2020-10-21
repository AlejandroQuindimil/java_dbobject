package codigo.models;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import codigo.db.DbObject;


public class Producto extends DbObject{

	private static final String TABLE = "producto";
	private static final ArrayList COLS = getArrayCols();

	private int id = 0;
	private String name = "";
	private String desc = "";
	private int precio = 0; 
	private int stock = 1;
	
	private static ArrayList getArrayCols() {
		ArrayList list = new ArrayList();
		list.add("name");
		list.add("desc"); 
		list.add("precio");
		list.add("stock"); 
		return list;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String i) {
		this.desc = i;
	}
	/**
	 * 
	 * @return 100 = 1,00
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * 
	 * @return 100 = 1,00
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public int getId() {
		return this.id;
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

	@Override
	public ArrayList<Object> getValues() {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(this.name);
		list.add(this.desc);
		list.add(this.precio);
		list.add(this.stock);
		
		return list;
	}

	@Override
	public DbObject parse(ResultSet rs) throws SQLException {
		Producto prod = new Producto();
		prod.id = rs.getInt("id");
		prod.name= rs.getString("name");
		prod.desc= rs.getString("desc");
		prod.precio = rs.getInt("precio");
		prod.stock = rs.getInt("stock");
		return prod;
	}

	@Override
	public String toString() {
		return"ID:"+this.id+"-> Nombre: "+this.name+" - Descuento: " +this.desc+" - Precio "+this.precio+" - Stock: "+this.stock ;
		
	}

	
	
}

