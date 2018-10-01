package facturaMarshalling;

import java.util.Date;

public class Factura {
	Cliente cliente;
	String direccionFacturacion;
	Producto producto;
	Integer id;
	Date fecha;

	public Factura(Cliente cliente, String direccionFacturacion, Producto producto, Integer id, Date fecha) {
		super();
		this.cliente = cliente;
		this.direccionFacturacion = direccionFacturacion;
		this.producto = producto;
		this.id = id;
		this.fecha = fecha;
	}

	// getters y setters

	@Override
	public String toString() {
		return "Factura [cliente=" + cliente + ", direccionFacturacion=" + direccionFacturacion + ", producto="
				+ producto + ", id=" + id + ", fecha=" + fecha + "]";
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDireccionFacturacion() {
		return direccionFacturacion;
	}

	public void setDireccionFacturacion(String direccionFacturacion) {
		this.direccionFacturacion = direccionFacturacion;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
