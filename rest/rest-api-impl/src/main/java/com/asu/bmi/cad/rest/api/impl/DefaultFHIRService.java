package com.asu.bmi.cad.rest.api.impl;

import org.springframework.stereotype.Service;

import com.asu.bmi.cad.fhir.*;
import com.asu.bmi.cad.fhir.Boolean;
import com.asu.bmi.cad.fhir.String;
import com.asu.bmi.cad.rest.api.FHIRService;


@Service( "fhirService#default" )
public class DefaultFHIRService
		implements FHIRService
{
		public Patient getPatient( java.lang.String pid ) {
				Patient pat = new Patient();
			// assign id and some other fields
				String id = new String();
				id.setValue("p123");
				Identifier pID = new Identifier();
				pID.setValue(id);
				pat.getIdentifiers().add(pID);
				pat.getIdentifiers().get(0);
				Boolean bool = new Boolean();
				bool.setValue(false);
				pat.setMultipleBirthBoolean(bool);
				pat.getMultipleBirthBoolean();
          return pat;
		}
}