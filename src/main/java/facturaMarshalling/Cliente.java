package facturaMarshalling;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cliente")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cliente {
	@XmlAttribute
	private String nif;
	@XmlElement
	private String nombre;
	@XmlElement
	private String apellidos;
	@XmlElement
	private String email;
	@XmlElement
	private long telefono;
	@XmlElement
	private long id;
	@XmlElement
	private Direccion direccion;
	@XmlElement
	List cliente = new ArrayList<Cliente>();

	public Cliente(String nombre, String apellidos, String email, long telefono, String nif, long id,
			Direccion direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;
		this.nif = nif;
		this.id = id;
		this.direccion = direccion;
	}

	public Cliente() {

	}

	public void addCliente(Cliente cliente) {
		this.cliente.add(cliente);
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", telefono=" + telefono
				+ ", nif=" + nif + ", id=" + id + ", direccion=" + direccion + ", cliente=" + cliente + "]";
	}

	public Cliente(List cliente) {
		super();
		this.cliente = cliente;
	}

	// getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
}
