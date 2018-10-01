package facturaMarshalling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class UnMarshalling {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("clientes.xml");
			JAXBContext jc = JAXBContext.newInstance("com.iesvirgendelcarmen.acceso.pojo");
			Unmarshaller u = jc.createUnmarshaller();
			Cliente clientes = (Cliente) u.unmarshal(is);
			Unmarshaller um;
		} catch (Exception ex) {
			System.out.println(ex.getLocalizedMessage());
		} finally {
			try {
				is.close();
			} catch (IOException ex) {
				System.out.println(ex.getLocalizedMessage());
			}
		}
	}
}
