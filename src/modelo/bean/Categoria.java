package modelo.bean;

public class Categoria {

	int id;
	String nombre;
	String color;
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categoria(int id, String nombre, String color) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + ", color=" + color + "]";
	}
	
	
}
