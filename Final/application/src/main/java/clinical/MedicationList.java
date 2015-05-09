package clinical;

import org.hl7.fhir.model.Medication;
import org.w3._1999.xhtml.Li;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by varun on 5/8/15.
 */
public class MedicationList {

    private String xmlFile = "medication-example(example).xml";
    Map<String,Medication> medList = new HashMap<String, Medication>();

    public Medication xmlMedication() throws Exception {

        JAXBContext c = JAXBContext.newInstance(Medication.class.getPackage().getName());
        Unmarshaller um = c.createUnmarshaller();
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(xmlFile);

        Medication med = (Medication)um.unmarshal(is);
        return med;
    }


    public MedicationList() throws Exception {

        Medication currentMed = xmlMedication();
        String ndc = currentMed.getCode().getCodings().get(1).getCode().getValue();
        medList.put(ndc, currentMed);

    }


    public String getMedication(String ndcCode) throws Exception {

        Medication med = medList.get(ndcCode);

        String drugName = med.getName().getValue();

        return drugName;

    }


    public void getRxNormDrugs(){
        String NDCcode;
        String drugName;


    }




    }

