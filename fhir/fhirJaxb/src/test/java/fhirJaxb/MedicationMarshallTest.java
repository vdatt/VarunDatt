package fhirJaxb;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.hl7.fhir.model.*;
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.String;
import org.junit.Test;

public class MedicationMarshallTest {

	@Test
	public void testMedicationMarshall() throws Exception {
		Boolean flag = new Boolean();
		String dis = new String();
		dis.setValue("Phenoxymethylpenicillin 125mg/5mL oral solution (product)");
		Uri uri = new Uri();
		uri.setValue("http://snomed.info/sct");
		Code cod = new Code();
		cod.setValue("323418000");
		Coding sys = new Coding();
		sys.setSystem(uri);
		sys.setCode(cod);
		sys.setDisplay(dis);
		CodeableConcept cod1 = new CodeableConcept();
		cod1.getCodings().add(sys);;
		MedicationKind medk = new MedicationKind();
		medk.setValue(org.hl7.fhir.model.MedicationKindList.PRODUCT);
		
		
		
		 Medication med= new Medication();
		  med.setCode(cod1);
		  med.setIsBrand(flag);
		  med.setKind(medk);
		  
		  
		 JAXBContext c = JAXBContext.newInstance(Medication.class.getPackage().getName());
		 FileOutputStream file = new FileOutputStream(new File("patient_example_output.xml"));
		//OutputStream os = …
			//	Marshaller m = c.createMarshaller();
				//m.marshal( p, os );
		  Marshaller jaxbMarshaller = c.createMarshaller();
		  
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(med, file);
			jaxbMarshaller.marshal(med, System.out);
			
			Unmarshaller um = c.createUnmarshaller();
			//InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("patient_example_output.xml");
			File is = new File("patient_example_output.xml");
			Medication med1 = (Medication)um.unmarshal(is);
	}

}
