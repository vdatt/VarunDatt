package com.asu.bmi.cad.rest.api.impl;

import static org.junit.Assert.assertEquals;

import javax.xml.bind.JAXBException;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.junit.Test;

import com.asu.bmi.cad.fhir.Patient;
import com.asu.bmi.cad.rest.api.FHIRService;

public class TestDefaultFHIRService {

	String endpoint = "http://localhost:8080";
	String path = "/test";
	String rest = "/restServices";
	String server = "/testServices/";
	
	
	
	
	@Test
	public void testFHIR() throws JAXBException
	{
	FHIRService service =
	JAXRSClientFactory.create(
	endpoint + path + rest + server, FHIRService.class );
	String pid = "p123";
	Patient p = service.getPatient( pid );
	
	com.asu.bmi.cad.fhir.Boolean bool = new com.asu.bmi.cad.fhir.Boolean();
	bool.setValue(false);

		/*JAXBContext c = JAXBContext.newInstance(Patient.class.getPackage().getName());
		Marshaller m = c.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(p,System.out);*/
		
		assertEquals(p.getMultipleBirthBoolean(),bool);
	}

}
