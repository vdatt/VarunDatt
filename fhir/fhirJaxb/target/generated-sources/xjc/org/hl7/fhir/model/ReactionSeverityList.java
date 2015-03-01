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
 * <p>Java class for ReactionSeverity-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReactionSeverity-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="severe"/&gt;
 *     &lt;enumeration value="serious"/&gt;
 *     &lt;enumeration value="moderate"/&gt;
 *     &lt;enumeration value="minor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReactionSeverity-list")
@XmlEnum
public enum ReactionSeverityList {


    /**
     * Severe complications arose due to the reaction.
     * 
     */
    @XmlEnumValue("severe")
    SEVERE("severe"),

    /**
     * Serious inconvenience to the subject.
     * 
     */
    @XmlEnumValue("serious")
    SERIOUS("serious"),

    /**
     * Moderate inconvenience to the subject.
     * 
     */
    @XmlEnumValue("moderate")
    MODERATE("moderate"),

    /**
     * Minor inconvenience to the subject.
     * 
     */
    @XmlEnumValue("minor")
    MINOR("minor");
    private final java.lang.String value;

    ReactionSeverityList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ReactionSeverityList fromValue(java.lang.String v) {
        for (ReactionSeverityList c: ReactionSeverityList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
