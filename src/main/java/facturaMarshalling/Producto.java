package facturaMarshalling;

public class Producto {
	long id;
	String nombre;
	String descrip;
	double precio;

	public Producto(long id, String nombre, String descrip, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descrip = descrip;
		this.precio = precio;
	}

	// getters y setters

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
