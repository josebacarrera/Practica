package modelo.bean;

public class Noticia {

	int id;
	int id_categoria;
	String nombre;
	String texto;
	String img;
	String url;
	public Noticia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Noticia(int id, int id_categoria, String nombre, String texto, String img, String url) {
		super();
		this.id = id;
		this.id_categoria = id_categoria;
		this.nombre = nombre;
		this.texto = texto;
		this.img = img;
		this.url = url;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "Noticia [id=" + id + ", id_categoria=" + id_categoria + ", nombre=" + nombre + ", texto=" + texto
				+ ", img=" + img + ", url=" + url + "]";
	}
	
	
}
