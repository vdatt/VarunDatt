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
 * <p>Java class for MediaType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MediaType-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="photo"/&gt;
 *     &lt;enumeration value="video"/&gt;
 *     &lt;enumeration value="audio"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MediaType-list")
@XmlEnum
public enum MediaTypeList {


    /**
     * The media consists of one or more unmoving images, including photographs, computer-generated graphs and charts, and scanned documents.
     * 
     */
    @XmlEnumValue("photo")
    PHOTO("photo"),

    /**
     * The media consists of a series of frames that capture a moving image.
     * 
     */
    @XmlEnumValue("video")
    VIDEO("video"),

    /**
     * The media consists of a sound recording.
     * 
     */
    @XmlEnumValue("audio")
    AUDIO("audio");
    private final java.lang.String value;

    MediaTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static MediaTypeList fromValue(java.lang.String v) {
        for (MediaTypeList c: MediaTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
