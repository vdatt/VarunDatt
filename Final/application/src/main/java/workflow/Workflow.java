package workflow;

import clinical.MedicationPrescriptions;
import clinical.PatientList;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by varun on 5/8/15.
 */
public class Workflow {

    public List<String> roomList() throws Exception {
        java.util.Date date= new java.util.Date();
        Timestamp currentTime = new Timestamp(date.getTime());  //To get list of patient's rooms that require medication at the current time

        List<String> rooms = new ArrayList<String>();

                                                                //List of rooms for medication administration in the present/ future
        //if(currentTime < medicationTime)
        PatientList pt = new PatientList();
        String pID = "123456";
        rooms.add(pt.getRoom(pID));

                                                                //medication time will be retrieved from medication prescription and List will be changed to HashMap
        return rooms;                                           //Sent to UI which displays the required list of rooms

    }

    public Map<String, List<String>> getmedRights(String pID) throws Exception {
        MedRights mr = new MedRights();
        return mr.getmedRights(pID);
    }


}
