package workflow;

import clinical.MedicationPrescriptions;
import org.hl7.fhir.model.*;

import java.lang.String;

/**
 * Created by varun on 5/9/15.
 */
public class BarcodeCheck {

    String patMRN;
    String drugNDC;

    public BarcodeCheck() throws Exception {
        MedicationPrescriptions medicationPrescriptions = new MedicationPrescriptions();
        patMRN = medicationPrescriptions.getPatientId();
        drugNDC= medicationPrescriptions.getMedicationNDC();
    }

    public boolean checkPatient(String barcode){      //barcode acquired by Glass barcode scanner application (Literal String)
        boolean flag= false;
        if (barcode.equals(patMRN)){
            flag = true;
        }
        return flag;
    }

    public boolean checkDrug(String barcode){
        boolean flag= false;
        if (barcode.equals(drugNDC)){
            flag = true;
        }
        return flag;
    }
}
