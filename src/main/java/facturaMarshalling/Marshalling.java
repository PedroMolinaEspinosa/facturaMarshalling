package facturaMarshalling;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshalling {
	public static void main(String[] args) {

		// Productos
		Producto p1 = new Producto(12345, "carcasa", "recarcasa", 100);
		Producto p2 = new Producto(12346, "carcaseta", "recarcasa", 101);
		Producto p3 = new Producto(12347, "carcasita", "recarcasa", 102);
		Producto p4 = new Producto(12348, "carcasota", "recarcasa", 103.99);

		// Direccion
		Direccion d1 = new Direccion("Calle", "ojete", 23006, "Jaén");
		Direccion d2 = new Direccion("Av", "panete", 23008, "Jaén");
		Direccion d3 = new Direccion("Calle", "ole", 23006, "Jaén");
		Direccion d4 = new Direccion("Av", "jujete", 23006, "Jaén");

		// Clientes
		Cliente c1 = new Cliente("pepe", "ojete", "nose@hot.com", 999999991, "27879364H", 123457, d1);
		Cliente c2 = new Cliente("ay", "ojete", "nose1@hot.com", 999999992, "27879344E", 123457, d2);
		Cliente c3 = new Cliente("que", "si", "nose2@hot.com", 999999993, "27879464A", 123457, d4);
		Cliente c4 = new Cliente("o", "no", "nose3@hot.com", 999999994, "27873364G", 123457, d3);

		Cliente clientes = new Cliente();
		clientes.addCliente(c1);
		clientes.addCliente(c2);
		clientes.addCliente(c3);
		clientes.addCliente(c4);

		try {
			JAXBContext jaxbContext;
			jaxbContext = JAXBContext.newInstance(clientes.getClass());
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			// Marshal the employees list in file
			jaxbMarshaller.marshal(clientes, new File("clientes.xml"));
		} catch (JAXBException ex) {
			// TODO Auto-generated catch block
			Logger.getLogger(Marshaller.class.getName()).log(Level.SEVERE, null, ex);
		}

		System.out.println(clientes.toString());

	}
}
