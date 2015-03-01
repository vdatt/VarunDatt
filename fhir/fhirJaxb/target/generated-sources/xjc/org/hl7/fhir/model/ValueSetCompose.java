//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.01 at 01:52:03 AM MST 
//


package org.hl7.fhir.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * A value set specifies a set of codes drawn from one or more code systems.
 * 
 * <p>Java class for ValueSet.Compose complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueSet.Compose"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="import" type="{http://hl7.org/fhir}uri" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="include" type="{http://hl7.org/fhir}ValueSet.Include" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="exclude" type="{http://hl7.org/fhir}ValueSet.Include" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSet.Compose", propOrder = {
    "imports",
    "includes",
    "excludes"
})
public class ValueSetCompose
    extends BackboneElement
    implements Serializable, ToString
{

    @XmlElement(name = "import")
    protected List<Uri> imports;
    @XmlElement(name = "include")
    protected List<ValueSetInclude> includes;
    @XmlElement(name = "exclude")
    protected List<ValueSetInclude> excludes;

    /**
     * Gets the value of the imports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uri }
     * 
     * 
     */
    public List<Uri> getImports() {
        if (imports == null) {
            imports = new ArrayList<Uri>();
        }
        return this.imports;
    }

    /**
     * Gets the value of the includes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSetInclude }
     * 
     * 
     */
    public List<ValueSetInclude> getIncludes() {
        if (includes == null) {
            includes = new ArrayList<ValueSetInclude>();
        }
        return this.includes;
    }

    /**
     * Gets the value of the excludes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSetInclude }
     * 
     * 
     */
    public List<ValueSetInclude> getExcludes() {
        if (excludes == null) {
            excludes = new ArrayList<ValueSetInclude>();
        }
        return this.excludes;
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
            List<Uri> theImports;
            theImports = (((this.imports!= null)&&(!this.imports.isEmpty()))?this.getImports():null);
            strategy.appendField(locator, this, "imports", buffer, theImports);
        }
        {
            List<ValueSetInclude> theIncludes;
            theIncludes = (((this.includes!= null)&&(!this.includes.isEmpty()))?this.getIncludes():null);
            strategy.appendField(locator, this, "includes", buffer, theIncludes);
        }
        {
            List<ValueSetInclude> theExcludes;
            theExcludes = (((this.excludes!= null)&&(!this.excludes.isEmpty()))?this.getExcludes():null);
            strategy.appendField(locator, this, "excludes", buffer, theExcludes);
        }
        return buffer;
    }

}
