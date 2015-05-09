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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.w3._1999.xhtml.Div;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for Narrative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Narrative"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Element"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}NarrativeStatus"/&gt;
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}div"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Narrative", propOrder = {
    "status",
    "div"
})
public class Narrative
    extends Element
    implements ToString
{

    @XmlElement(required = true)
    protected NarrativeStatus status;
    @XmlElement(namespace = "http://www.w3.org/1999/xhtml", required = true)
    protected Div div;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link NarrativeStatus }
     *     
     */
    public NarrativeStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link NarrativeStatus }
     *     
     */
    public void setStatus(NarrativeStatus value) {
        this.status = value;
    }

    /**
     * The actual narrative content, a stripped down version of XHTML.
     * 
     * @return
     *     possible object is
     *     {@link Div }
     *     
     */
    public Div getDiv() {
        return div;
    }

    /**
     * Sets the value of the div property.
     * 
     * @param value
     *     allowed object is
     *     {@link Div }
     *     
     */
    public void setDiv(Div value) {
        this.div = value;
    }

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
        {
            NarrativeStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            Div theDiv;
            theDiv = this.getDiv();
            strategy.appendField(locator, this, "div", buffer, theDiv);
        }
        return buffer;
    }

    public Narrative withStatus(NarrativeStatus value) {
        setStatus(value);
        return this;
    }

    public Narrative withDiv(Div value) {
        setDiv(value);
        return this;
    }

    @Override
    public Narrative withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Narrative withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Narrative withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
