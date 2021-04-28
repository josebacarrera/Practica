package modelo.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Connector;
import modelo.bean.Categoria;
import modelo.bean.Noticia;

public class NoticiasModelo extends Connector{

	//1-Select all
	//2-Insert
	//3-Update
	//4-Delete
	//5-Get
	
	
	public ArrayList<Noticia> selectAll(){
		
		ArrayList<Noticia> noticia= new ArrayList<Noticia>();
		
		try {
			PreparedStatement st = super.conn.prepareStatement("Select * from noticia");
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Noticia n = new Noticia();
				n.setId(rs.getInt("id"));
				n.setId_categoria(rs.getInt("id_categoria"));
				n.setNombre(rs.getString("nombre"));
				n.setTexto(rs.getString("texto"));
				n.setImg(rs.getString("img"));
				n.setUrl(rs.getString("url"));
				
				noticia.add(n);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return noticia;
	}
	
	
	
	public void insert(Noticia n) {
		
		Noticia noticia = new Noticia();
		
		try {
			PreparedStatement st = super.conn.prepareStatement("Insert into noticias (id,id_categoria,nombre,texto,img,url)VALUES(?,?,?,?,?,?)");
			st.setInt(1, n.getId());
			st.setInt(2, n.getId_categoria());
			st.setString(3, n.getNombre());
			st.setString(4, n.getTexto());
			st.setString(5, n.getImg());
			st.setString(6, n.getUrl());
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
