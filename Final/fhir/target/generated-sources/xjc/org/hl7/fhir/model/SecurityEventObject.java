//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 10:02:37 AM MST 
//


package org.hl7.fhir.model;

import java.util.ArrayList;
import java.util.Collection;
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
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * 
 * <p>Java class for SecurityEvent.Object complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityEvent.Object"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="reference" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}SecurityEventObjectType" minOccurs="0"/&gt;
 *         &lt;element name="role" type="{http://hl7.org/fhir}SecurityEventObjectRole" minOccurs="0"/&gt;
 *         &lt;element name="lifecycle" type="{http://hl7.org/fhir}SecurityEventObjectLifecycle" minOccurs="0"/&gt;
 *         &lt;element name="sensitivity" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="query" type="{http://hl7.org/fhir}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="detail" type="{http://hl7.org/fhir}SecurityEvent.Detail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityEvent.Object", propOrder = {
    "identifier",
    "reference",
    "type",
    "role",
    "lifecycle",
    "sensitivity",
    "name",
    "description",
    "query",
    "details"
})
public class SecurityEventObject
    extends BackboneElement
    implements ToString
{

    protected Identifier identifier;
    protected ResourceReference reference;
    protected SecurityEventObjectType type;
    protected SecurityEventObjectRole role;
    protected SecurityEventObjectLifecycle lifecycle;
    protected CodeableConcept sensitivity;
    protected org.hl7.fhir.model.String name;
    protected org.hl7.fhir.model.String description;
    protected Base64Binary query;
    @XmlElement(name = "detail")
    protected List<SecurityEventDetail> details;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setReference(ResourceReference value) {
        this.reference = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityEventObjectType }
     *     
     */
    public SecurityEventObjectType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityEventObjectType }
     *     
     */
    public void setType(SecurityEventObjectType value) {
        this.type = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityEventObjectRole }
     *     
     */
    public SecurityEventObjectRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityEventObjectRole }
     *     
     */
    public void setRole(SecurityEventObjectRole value) {
        this.role = value;
    }

    /**
     * Gets the value of the lifecycle property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityEventObjectLifecycle }
     *     
     */
    public SecurityEventObjectLifecycle getLifecycle() {
        return lifecycle;
    }

    /**
     * Sets the value of the lifecycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityEventObjectLifecycle }
     *     
     */
    public void setLifecycle(SecurityEventObjectLifecycle value) {
        this.lifecycle = value;
    }

    /**
     * Gets the value of the sensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSensitivity() {
        return sensitivity;
    }

    /**
     * Sets the value of the sensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSensitivity(CodeableConcept value) {
        this.sensitivity = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setName(org.hl7.fhir.model.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setDescription(org.hl7.fhir.model.String value) {
        this.description = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    public Base64Binary getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    public void setQuery(Base64Binary value) {
        this.query = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the details property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityEventDetail }
     * 
     * 
     */
    public List<SecurityEventDetail> getDetails() {
        if (details == null) {
            details = new ArrayList<SecurityEventDetail>();
        }
        return this.details;
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
            Identifier theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier);
        }
        {
            ResourceReference theReference;
            theReference = this.getReference();
            strategy.appendField(locator, this, "reference", buffer, theReference);
        }
        {
            SecurityEventObjectType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            SecurityEventObjectRole theRole;
            theRole = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theRole);
        }
        {
            SecurityEventObjectLifecycle theLifecycle;
            theLifecycle = this.getLifecycle();
            strategy.appendField(locator, this, "lifecycle", buffer, theLifecycle);
        }
        {
            CodeableConcept theSensitivity;
            theSensitivity = this.getSensitivity();
            strategy.appendField(locator, this, "sensitivity", buffer, theSensitivity);
        }
        {
            org.hl7.fhir.model.String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            org.hl7.fhir.model.String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            Base64Binary theQuery;
            theQuery = this.getQuery();
            strategy.appendField(locator, this, "query", buffer, theQuery);
        }
        {
            List<SecurityEventDetail> theDetails;
            theDetails = (((this.details!= null)&&(!this.details.isEmpty()))?this.getDetails():null);
            strategy.appendField(locator, this, "details", buffer, theDetails);
        }
        return buffer;
    }

    public SecurityEventObject withIdentifier(Identifier value) {
        setIdentifier(value);
        return this;
    }

    public SecurityEventObject withReference(ResourceReference value) {
        setReference(value);
        return this;
    }

    public SecurityEventObject withType(SecurityEventObjectType value) {
        setType(value);
        return this;
    }

    public SecurityEventObject withRole(SecurityEventObjectRole value) {
        setRole(value);
        return this;
    }

    public SecurityEventObject withLifecycle(SecurityEventObjectLifecycle value) {
        setLifecycle(value);
        return this;
    }

    public SecurityEventObject withSensitivity(CodeableConcept value) {
        setSensitivity(value);
        return this;
    }

    public SecurityEventObject withName(org.hl7.fhir.model.String value) {
        setName(value);
        return this;
    }

    public SecurityEventObject withDescription(org.hl7.fhir.model.String value) {
        setDescription(value);
        return this;
    }

    public SecurityEventObject withQuery(Base64Binary value) {
        setQuery(value);
        return this;
    }

    public SecurityEventObject withDetails(SecurityEventDetail... values) {
        if (values!= null) {
            for (SecurityEventDetail value: values) {
                getDetails().add(value);
            }
        }
        return this;
    }

    public SecurityEventObject withDetails(Collection<SecurityEventDetail> values) {
        if (values!= null) {
            getDetails().addAll(values);
        }
        return this;
    }

    @Override
    public SecurityEventObject withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public SecurityEventObject withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public SecurityEventObject withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public SecurityEventObject withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public SecurityEventObject withId(java.lang.String value) {
        setId(value);
        return this;
    }

}
