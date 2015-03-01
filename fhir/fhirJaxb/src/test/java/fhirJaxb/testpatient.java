package fhirJaxb;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hl7.fhir.model.*;
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.String;
import org.junit.Test;
public class testpatient {

	@Test
	public void testPatient() throws ParseException{
		@SuppressWarnings("unused")
		DateTime dateTime = new DateTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		Date date = sdf.parse("06/21/1992 04:10");
		dateTime.setValue(date);
		
		CodeableConcept codcon = new CodeableConcept();
		String gender = new String();
		gender.setValue("male");
		Coding code = new Coding();
		code.setDisplay(gender);
		codcon.getCodings().add(code);
		
		Boolean flag = new Boolean();
		flag.setValue(false);
		
	
		CodeableConcept martstat = new CodeableConcept();
		String ms = new String();
		ms.setValue("single");
		Coding marital = new Coding();
		marital.setDisplay(ms);
		martstat.getCodings().add(marital);
		
		String id = new String();
		id.setValue("738472983");
		Identifier pID = new Identifier();
		pID.setValue(id);
		
		//relationship between patient and immunization resource; using reference 
		Immunization imm = new Immunization();
		String immid = new String();
		immid.setValue("396427003");
		Identifier immID = new Identifier();
		immID.setValue(immid);
		ResourceReference patientImm = new ResourceReference();
		String rr = new String();
		rr.setValue("738472983");
		patientImm.setReference(rr);
		imm.setSubject(patientImm);
		
		Patient patient = new Patient();
		patient.setBirthDate(dateTime);
		patient.setGender(codcon);
		patient.setMaritalStatus(martstat);
		patient.setDeceasedBoolean(flag);
		patient.getIdentifiers().add(pID);
		
		assertEquals(patient.getIdentifiers().get(0).getValue().getValue(),"738472983");
		assertEquals(patient.getBirthDate().getValue(),date);
		assertEquals(patient.getGender(), codcon);
		assertEquals(patient.getDeceasedBoolean().isValue(),false);
		assertEquals(patient.getMaritalStatus(), martstat);
		
		
	}

}
