//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.01 at 01:52:03 AM MST 
//


package w3._1999.xhtml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Shape.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Shape"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="rect"/&gt;
 *     &lt;enumeration value="circle"/&gt;
 *     &lt;enumeration value="poly"/&gt;
 *     &lt;enumeration value="default"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Shape")
@XmlEnum
public enum Shape {

    @XmlEnumValue("rect")
    RECT("rect"),
    @XmlEnumValue("circle")
    CIRCLE("circle"),
    @XmlEnumValue("poly")
    POLY("poly"),
    @XmlEnumValue("default")
    DEFAULT("default");
    private final String value;

    Shape(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Shape fromValue(String v) {
        for (Shape c: Shape.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
