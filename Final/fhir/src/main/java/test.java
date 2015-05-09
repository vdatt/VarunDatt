import org.hl7.fhir.model.*;
import org.hl7.fhir.model.String;

/**
 * Created by varun on 5/8/15.
 */
public class test {

    public static void main(String[] args) {
        Patient pat = new Patient();

        pat.setGender((new CodeableConcept().withCodings(new Coding().withCode(new Code().withValue("hey")))));
        pat.setGender(new CodeableConcept().withCodings(new Coding().withDisplay(new String().withValue("yo"))));
        System.out.println(pat.getGender());
    }
}
