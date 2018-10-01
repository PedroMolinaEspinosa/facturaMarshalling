package facturaMarshalling;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nombre;
	String apellidos;
	String email;
	long telefono;
	String nif;
	long id;
	Direccion direccion;
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
