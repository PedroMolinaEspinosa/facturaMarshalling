package facturaMarshalling;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cliente")

public class Direccion {
	String tipoVia;
	String nombreVia;
	int cp;
	String localidad;

	public Direccion(String tipoVia, String nombreVia, int cp, String localidad) {
		super();
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.cp = cp;
		this.localidad = localidad;
	}

	public Direccion() {

	}

	// getters y setters

	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", cp=" + cp + ", localidad=" + localidad
				+ "]";
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
}
