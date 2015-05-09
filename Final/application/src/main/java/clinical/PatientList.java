package clinical;

import org.hl7.fhir.model.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Created by varun on 5/8/15.
 */
public class PatientList{


    private int numberofPatients = 1;
    private String xmlFile = "patient-example(example).xml";
    Map<String,Patient> patList = new HashMap<String, Patient>();


    public Patient xmlPatient() throws Exception {

        JAXBContext c = JAXBContext.newInstance(Patient.class.getPackage().getName());
        Unmarshaller um = c.createUnmarshaller();
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(xmlFile);

        Patient foo = (Patient)um.unmarshal(is);
        return foo;
    }


    public PatientList() throws Exception {

        Patient currentPat = xmlPatient();
        String patID = currentPat.getIdentifiers().get(0).getValue().getValue();
        patList.put(patID, currentPat);

    }


    public String getPatientName (String patID) throws Exception {

        Patient pat = patList.get(patID);

        String firstName = pat.getNames().get(0).getGivens().get(0).getValue();
        String middleName = pat.getNames().get(0).getGivens().get(1).getValue();
        String lastName = pat.getNames().get(0).getFamilies().get(0).getValue();

        String patName = firstName + " " + middleName + " " + lastName;


        return patName;

    }


    public String getRoom(String pID){      //will be converted to List
        String roomNum = "Room 201";
        return roomNum;
    }


}
