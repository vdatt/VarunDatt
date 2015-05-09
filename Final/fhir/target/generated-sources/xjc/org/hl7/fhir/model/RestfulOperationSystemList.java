//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:02:37 AM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestfulOperationSystem-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RestfulOperationSystem-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="transaction"/&gt;
 *     &lt;enumeration value="search-system"/&gt;
 *     &lt;enumeration value="history-system"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RestfulOperationSystem-list")
@XmlEnum
public enum RestfulOperationSystemList {

    @XmlEnumValue("transaction")
    TRANSACTION("transaction"),
    @XmlEnumValue("search-system")
    SEARCH_SYSTEM("search-system"),
    @XmlEnumValue("history-system")
    HISTORY_SYSTEM("history-system");
    private final java.lang.String value;

    RestfulOperationSystemList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static RestfulOperationSystemList fromValue(java.lang.String v) {
        for (RestfulOperationSystemList c: RestfulOperationSystemList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
