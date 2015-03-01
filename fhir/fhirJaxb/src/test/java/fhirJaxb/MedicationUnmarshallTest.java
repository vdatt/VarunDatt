package fhirJaxb;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.hl7.fhir.model.*;
import org.junit.Test;

public class MedicationUnmarshallTest {

	@Test
	public void testMedicationUnmarshaller() throws Exception {
		JAXBContext c = JAXBContext.newInstance( Medication.class.getPackage().getName() );
		Unmarshaller um = c.createUnmarshaller();
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("Medication.xml");
	// or import from URL url = new URL( "http://www.hl7.org/implement/standards/fhir/medication-example.xml" );
		Medication pen = (Medication)um.unmarshal( is);
		
		System.out.println(pen.getName().getValue());
		System.out.println(pen.getIsBrand().isValue());
		System.out.println(pen.getKind().getValue());
		System.out.println(pen.getCode().getCodings().get(0).getSystem().getValue());
		System.out.println(pen.getCode().getCodings().get(0).getCode().getValue());
		System.out.println(pen.getCode().getCodings().get(0).getDisplay().getValue());
		System.out.println(pen.getProduct().getForm().getCodings().get(0).getSystem().getValue());
		System.out.println(pen.getProduct().getForm().getCodings().get(0).getCode().getValue());
		System.out.println(pen.getProduct().getForm().getCodings().get(0).getDisplay().getValue());
		
		assertEquals(pen.getName().getValue(),"Penicillin VK oral suspension 125mg/5ml");
		assertEquals(pen.getIsBrand().isValue(),false);
		assertEquals(pen.getKind().getValue(),org.hl7.fhir.model.MedicationKindList.PRODUCT);
		assertEquals(pen.getCode().getCodings().get(0).getSystem().getValue(),"http://snomed.info/sct");
		assertEquals(pen.getCode().getCodings().get(0).getCode().getValue(),"323418000");
		assertEquals(pen.getCode().getCodings().get(0).getDisplay().getValue(),"Phenoxymethylpenicillin 125mg/5mL oral solution (product)");
		assertEquals(pen.getProduct().getForm().getCodings().get(0).getSystem().getValue(),"http://snomed.info/sct");
		assertEquals(pen.getProduct().getForm().getCodings().get(0).getCode().getValue(),"37595005");
		assertEquals(pen.getProduct().getForm().getCodings().get(0).getDisplay().getValue(),"Suspension");
	}

}
