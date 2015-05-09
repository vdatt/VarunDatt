//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:02:37 AM MST 
//


package org.hl7.fhir.model;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for Count complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Count"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://hl7.org/fhir}Quantity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" type="{http://hl7.org/fhir}decimal" minOccurs="0"/&gt;
 *         &lt;element name="comparator" type="{http://hl7.org/fhir}QuantityCompararator" minOccurs="0"/&gt;
 *         &lt;element name="units" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="system" type="{http://hl7.org/fhir}uri" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://hl7.org/fhir}id-primitive" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Count")
public class Count
    extends Quantity
    implements ToString
{


    public java.lang.String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        return buffer;
    }

    @Override
    public Count withValue(Decimal value) {
        setValue(value);
        return this;
    }

    @Override
    public Count withComparator(QuantityCompararator value) {
        setComparator(value);
        return this;
    }

    @Override
    public Count withUnits(org.hl7.fhir.model.String value) {
        setUnits(value);
        return this;
    }

    @Override
    public Count withSystem(Uri value) {
        setSystem(value);
        return this;
    }

    @Override
    public Count withCode(Code value) {
        setCode(value);
        return this;
    }

    @Override
    public Count withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Count withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Count withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
