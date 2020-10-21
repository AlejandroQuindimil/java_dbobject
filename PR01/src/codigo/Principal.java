package codigo;
 
import java.sql.SQLException;
import java.util.ArrayList;

import codigo.cfg.Config;
import codigo.db.DbObject;
import codigo.models.Persona;
import codigo.models.Producto;
import codigo.models.Usuario;

public class Principal {

	public static void main(String[] args) { 
				
		Config.getInstance();
		
		
		try {
			Persona per = new Persona();
			
			// ----- 1º listar 
			System.out.println("Persona || Listar");
			for(DbObject obj : per.list()) {
				Persona p1 =(Persona) obj;
				System.out.println("=>"+p1.toString() );
			}
			
			// ----- 2º Insertar 
			per.name     = "Don Jose";
			per.lastname = "Pepito";
			per.insertar();
			
			per.name     = "Miguel ";
			per.lastname = "Suarez";
			per.insertar();
			
			// ----- 3º Update 
			per.name     = "Don Jose";
			per.lastname = "Rodriguez";
			per.setId(1);
			per.update();
			
			// ----- 4º listar 
			System.out.println("Persona || Listar");
			for(DbObject obj : per.list()) {
				Persona p1 =(Persona) obj;
				System.out.println("=>"+p1.toString() );
			}
			
			// ----- 5º Delete 
			per.setId(2);
			per.delete();
			
			// ----- 6º listar 
			System.out.println("Persona || Listar");
			for(DbObject obj : per.list()) {
				Persona p1 =(Persona) obj;
				System.out.println("=>"+p1.toString() );
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			Producto prod = new Producto();
			
			// ----- 1º listar 
			System.out.println("Persona || Listar");
			for(DbObject obj : prod.list()) {
				Persona pr1 =(Persona) obj;
				System.out.println("=>"+pr1.toString() );
			}
			
			// ----- 2º Insertar 
			prod.setName("Don Jose");
			prod.setDesc("5");
			prod.setPrecio(100);
			prod.setStock(60);
			prod.insertar();
			
			prod.setName("Don Jose");
			prod.setDesc("10");
			prod.setPrecio(250);
			prod.setStock(10);
			prod.insertar();
			
			// ----- 3º Update 
			
			prod.setName("Don Jose");
			prod.getDesc();
			prod.getPrecio();
			prod.getStock();
			prod.setId(3);
			prod.update();
			
			// ----- 4º listar 
			System.out.println("Persona || Listar");
			for(DbObject obj : prod.list()) {
				Persona pr1 =(Persona) obj;
				System.out.println("=>"+pr1.toString() );
			}
			
			// ----- 5º Delete
			prod.setId(2);
			prod.delete();
			
			// ----- 6º listar 
			System.out.println("Persona || Listar");
			for(DbObject obj : prod.list()) {
				Persona pr1 =(Persona) obj;
				System.out.println("=>"+pr1.toString() );
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			Usuario user = new Usuario();
			
			// ----- 1º listar 
			System.out.println("Usuario || Listar");
			for(DbObject obj : user.list()) {
				Usuario u1 =(Usuario) obj;
				System.out.println("=>"+u1.toString() );
			}
			
			// ----- 2º Insertar 
			user.login= "Manuel";
			user.setPass("54321");
			user.edad= 18;
			user.insertar();
			
			user.login= "JoseMiguel";
			user.setPass("12345");
			user.edad= 18;
			user.insertar();
			
			// ----- 3º Update 
			user.login="Manolo ";
			user.setPass("987456");
			user.setId(1);
			user.update();
			
			// ----- 4º listar 
			System.out.println("Usuario || Listar");
			for(DbObject obj : user.list()) {
				Usuario u1 =(Usuario) obj;
				System.out.println("=>"+u1.toString() );
			}
			
			// ----- 5º Delete 
			user.setId(2);
			user.delete();
			
			// ----- 6º listar 
			System.out.println("Usuario || Listar");
			for(DbObject obj : user.list()) {
				Usuario u1 =(Usuario) obj;
				System.out.println("=>"+u1.toString() );
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		try {
			Persona per = new Persona();
			
			per.name     = "Don Jose";
			per.lastname = "Pepito";
			per.setId(1);
			
			per.insertar();
			ArrayList lista = per.list();
			ArrayList<Persona> lista2 = lista;
			for (Persona persona : lista2) {
				System.out.println("1-Persona:"+persona.name);
			}
			
			per.name     = "Don";
			per.lastname = "Jose";
			
			per.update();
			
			lista = per.list();
			lista2 = lista;
			for (Persona persona : lista2) {
				System.out.println("Persona:"+persona.name);
			}
			
			per.delete();
			
		}catch(SQLException e) {
			System.out.println( e.getMessage() );
		}  

		// create a database connection

		/*
		 * 
		 * statement.executeUpdate("drop table if exists person");
		 * 
		 * statement.executeUpdate("create table person (id integer, name string)");
		 * 
		 * statement.executeUpdate("insert into person values(1, 'leo')");
		 * statement.executeUpdate("insert into person values(2, 'yui')");
		 * 
		 * 
		 * 
		 * ResultSet rs = statement.executeQuery("select * from person");
		 * while(rs.next()) { // read the result set System.out.println("name = " +
		 * rs.getString("name")); }
		 * 
		 * 
		 * //
		 */

	}

}
