package workflow;

import clinical.MedicationPrescriptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by varun on 5/8/15.
 */
public class MedRights {            //The five Rights of Medication Administration- Right Patient, Drug, Dose, Route & Time

    List<String> rights = new ArrayList<String>();

    Map<String, List<String>> medRights = new HashMap<String, List<String>>();

    MedicationPrescriptions medicationPrescriptions = new MedicationPrescriptions();

    public Map<String, List<String>> getmedRights(String pID) throws Exception {

        String drug = medicationPrescriptions.getMedicationNDC();
        String dose = medicationPrescriptions.getdose();
        String route = medicationPrescriptions.getRoute();
        String time = medicationPrescriptions.getTime();

        rights.add(0, drug);
        rights.add(1, dose);
        rights.add(2, route);
        rights.add(3, time);

        pID = medicationPrescriptions.getPatientId();

        medRights.put(pID, rights);
        return medRights;
    }

}
