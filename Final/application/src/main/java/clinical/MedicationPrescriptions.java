package clinical;

import org.hl7.fhir.model.MedicationPrescription;
import org.hl7.fhir.model.UnitsOfTimeList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.math.BigDecimal;

/**
 * Created by varun on 5/8/15.
 */
public class MedicationPrescriptions {

    private String xmlFile = "medicationprescription-example(example).xml";
    private String patientId;
    private String practitionerID;
    private String medicationNDC;

    public MedicationPrescription xmlMedicationPrescription() throws Exception {

        JAXBContext c = JAXBContext.newInstance(org.hl7.fhir.model.MedicationPrescription.class.getPackage().getName());
        Unmarshaller um = c.createUnmarshaller();
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(xmlFile);

        MedicationPrescription medPres = (MedicationPrescription) um.unmarshal(is);
        return medPres;
    }

    public String getPatientId() throws Exception {
        return xmlMedicationPrescription().getPatient().getReference().getValue();
    }

    public String getPrescriberID() throws Exception {
        return xmlMedicationPrescription().getPrescriber().getReference().getValue();
    }


    public String getMedicationNDC() throws Exception {
        return xmlMedicationPrescription().getMedication().getReference().getValue();
    }

    public String getdose() throws Exception {
        BigDecimal dose = xmlMedicationPrescription().getDosageInstructions().get(2).getDoseQuantity().getValue().getValue();
        String units = xmlMedicationPrescription().getDosageInstructions().get(2).getDoseQuantity().getUnits().getValue();

        String dosage = dose + " " + units;
        return dosage;
    }

    public String getRoute() throws Exception {
        return xmlMedicationPrescription().getDosageInstructions().get(1).getRoute().getCodings().get(3).getDisplay().getValue();
    }

    public String getTime() throws Exception {
        Integer frequency = xmlMedicationPrescription().getDosageInstructions().get(0).getTimingSchedule().getRepeat().getFrequency().getValue();
        BigDecimal duration = xmlMedicationPrescription().getDosageInstructions().get(0).getTimingSchedule().getRepeat().getDuration().getValue();
        String units = xmlMedicationPrescription().getDosageInstructions().get(0).getTimingSchedule().getRepeat().getUnits().getValue().toString();
        String Time = frequency + " " + duration + " " + units;

        return Time;
    }
}
