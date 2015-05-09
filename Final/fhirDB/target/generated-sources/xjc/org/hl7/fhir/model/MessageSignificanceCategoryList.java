//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.09 at 01:15:06 AM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageSignificanceCategory-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageSignificanceCategory-list">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Consequence"/>
 *     &lt;enumeration value="Currency"/>
 *     &lt;enumeration value="Notification"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageSignificanceCategory-list")
@XmlEnum
public enum MessageSignificanceCategoryList {


    /**
     * The message represents/requests a change that should not be processed more than once. E.g. Making a booking for an appointment.
     * 
     */
    @XmlEnumValue("Consequence")
    CONSEQUENCE("Consequence"),

    /**
     * The message represents a response to query for current information. Retrospective processing is wrong and/or wasteful.
     * 
     */
    @XmlEnumValue("Currency")
    CURRENCY("Currency"),

    /**
     * The content is not necessarily intended to be current, and it can be reprocessed, though there may be version issues created by processing old notifications.
     * 
     */
    @XmlEnumValue("Notification")
    NOTIFICATION("Notification");
    private final java.lang.String value;

    MessageSignificanceCategoryList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static MessageSignificanceCategoryList fromValue(java.lang.String v) {
        for (MessageSignificanceCategoryList c: MessageSignificanceCategoryList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
