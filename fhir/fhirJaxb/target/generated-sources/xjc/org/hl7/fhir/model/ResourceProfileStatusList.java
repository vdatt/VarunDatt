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
 * <p>Java class for ResourceProfileStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceProfileStatus-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="draft"/&gt;
 *     &lt;enumeration value="active"/&gt;
 *     &lt;enumeration value="retired"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResourceProfileStatus-list")
@XmlEnum
public enum ResourceProfileStatusList {


    /**
     * This profile is still under development.
     * 
     */
    @XmlEnumValue("draft")
    DRAFT("draft"),

    /**
     * This profile is ready for normal use.
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * This profile has been deprecated, withdrawn or superseded and should no longer be used.
     * 
     */
    @XmlEnumValue("retired")
    RETIRED("retired");
    private final java.lang.String value;

    ResourceProfileStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ResourceProfileStatusList fromValue(java.lang.String v) {
        for (ResourceProfileStatusList c: ResourceProfileStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}