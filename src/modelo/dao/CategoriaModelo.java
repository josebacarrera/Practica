package modelo.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.eclipse.jdt.internal.compiler.ast.FalseLiteral;

import modelo.Connector;
import modelo.bean.*;

public class CategoriaModelo extends Connector {

	/*Genérico
	1-SelectAll
	2-Insert
	3-Update
	4-Delete
	5-Get
	*/
	
	//1-SelectAll
	public ArrayList<Categoria> selectAll(){
		ArrayList<Categoria> categoria = new ArrayList<Categoria>();
		
		try {
			PreparedStatement st = super.conn.prepareStatement("Select * from categoria");
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Categoria c = new Categoria();
				c.setId(rs.getInt("id"));
				c.setNombre(rs.getString("Nombre"));
				c.setColor(rs.getString("Color"));
				
				categoria.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return categoria;
	}

	//2-Insert
	
	public void insert(Categoria c) {
		try {
			PreparedStatement st = super.conn.prepareStatement("Insert into categoria(id,nombre,color)Values(?,?,?)");
			st.setInt(1, c.getId());
			st.setString(2, c.getNombre());
			st.setString(3, c.getColor());
			
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//3-Update-Añadir
	
	public void update(Categoria c) {
		try {
			PreparedStatement st = super.conn.prepareStatement("Update categoria set nombre=?,color=? where id?");
			
			st.setString(1, c.getNombre());
			st.setString(2, c.getColor());
			st.setInt(3, c.getId());
			
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//4-Delete
	
	public void delete(int id) {
		
		try {
			PreparedStatement st = super.conn.prepareStatement("Delete from categoria where id=?");
			
			st.setInt(1, id);			
			
			st.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//5-Get

	public Categoria get(int id) {
		
		Categoria categoria = new Categoria();
		
		try {
			PreparedStatement st = super.conn.prepareStatement("Select * from categoria where id=?");
			
			st.setInt(1, id);			
			
			ResultSet rs = st.executeQuery();
			rs.next(); //reeplaza al if o while
			categoria.setId(rs.getInt("id"));
			categoria.setNombre(rs.getString("nombre"));
			categoria.setColor(rs.getString("color"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return categoria;
	}
	
	
	//AVANZADO
	
	public boolean verify(int id) {
		
		boolean status = false ;
		
		try {
			PreparedStatement st = super.conn.prepareStatement("Select id from categoria where id=?");
			
			st.setInt(1, id);			
			
			ResultSet rs = st.executeQuery();
			status=rs.next(); //reeplaza al if o while
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
}
