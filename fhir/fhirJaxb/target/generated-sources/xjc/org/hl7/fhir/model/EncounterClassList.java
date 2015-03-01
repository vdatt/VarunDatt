//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.01 at 01:52:03 AM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncounterClass-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EncounterClass-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="inpatient"/&gt;
 *     &lt;enumeration value="outpatient"/&gt;
 *     &lt;enumeration value="ambulatory"/&gt;
 *     &lt;enumeration value="emergency"/&gt;
 *     &lt;enumeration value="home"/&gt;
 *     &lt;enumeration value="field"/&gt;
 *     &lt;enumeration value="daytime"/&gt;
 *     &lt;enumeration value="virtual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EncounterClass-list")
@XmlEnum
public enum EncounterClassList {


    /**
     * An encounter during which the patient is hospitalized and stays overnight.
     * 
     */
    @XmlEnumValue("inpatient")
    INPATIENT("inpatient"),

    /**
     * An encounter during which the patient is not hospitalized overnight.
     * 
     */
    @XmlEnumValue("outpatient")
    OUTPATIENT("outpatient"),

    /**
     * An encounter where the patient visits the practitioner in his/her office, e.g. a G.P. visit.
     * 
     */
    @XmlEnumValue("ambulatory")
    AMBULATORY("ambulatory"),

    /**
     * An encounter where the patient needs urgent care.
     * 
     */
    @XmlEnumValue("emergency")
    EMERGENCY("emergency"),

    /**
     * An encounter where the practitioner visits the patient at his/her home.
     * 
     */
    @XmlEnumValue("home")
    HOME("home"),

    /**
     * An encounter taking place outside the regular environment for giving care.
     * 
     */
    @XmlEnumValue("field")
    FIELD("field"),

    /**
     * An encounter where the patient needs more prolonged treatment or investigations than outpatients, but who do not need to stay in the hospital overnight.
     * 
     */
    @XmlEnumValue("daytime")
    DAYTIME("daytime"),

    /**
     * An encounter that takes place where the patient and practitioner do not physically meet but use electronic means for contact.
     * 
     */
    @XmlEnumValue("virtual")
    VIRTUAL("virtual");
    private final java.lang.String value;

    EncounterClassList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static EncounterClassList fromValue(java.lang.String v) {
        for (EncounterClassList c: EncounterClassList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
