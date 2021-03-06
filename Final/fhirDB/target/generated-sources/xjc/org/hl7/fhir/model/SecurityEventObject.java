//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.09 at 01:15:06 AM MST 
//


package org.hl7.fhir.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
 * 
 * <p>Java class for SecurityEvent.Object complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityEvent.Object">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}SecurityEventObjectType" minOccurs="0"/>
 *         &lt;element name="role" type="{http://hl7.org/fhir}SecurityEventObjectRole" minOccurs="0"/>
 *         &lt;element name="lifecycle" type="{http://hl7.org/fhir}SecurityEventObjectLifecycle" minOccurs="0"/>
 *         &lt;element name="sensitivity" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="query" type="{http://hl7.org/fhir}base64Binary" minOccurs="0"/>
 *         &lt;element name="detail" type="{http://hl7.org/fhir}SecurityEvent.Detail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
@Entity(name = "SecurityEventObject")
@Table(name = "SECURITYEVENTOBJECT")
public class SecurityEventObject
    extends BackboneElement
    implements Serializable, Equals, HashCode
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
    @ManyToOne(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIER_SECURITYEVENTOBJE_0")
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
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "REFERENCE_SECURITYEVENTOBJEC_0")
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
    @ManyToOne(targetEntity = SecurityEventObjectType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPE__SECURITYEVENTOBJECT_HJ_0")
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
    @ManyToOne(targetEntity = SecurityEventObjectRole.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ROLE__SECURITYEVENTOBJECT_HJ_0")
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
    @ManyToOne(targetEntity = SecurityEventObjectLifecycle.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LIFECYCLE_SECURITYEVENTOBJEC_0")
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
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SENSITIVITY_SECURITYEVENTOBJ_0")
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
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NAME__SECURITYEVENTOBJECT_HJ_0")
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
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DESCRIPTION_SECURITYEVENTOBJ_0")
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
    @ManyToOne(targetEntity = Base64Binary.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "QUERY_SECURITYEVENTOBJECT_HJ_0")
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
    @OneToMany(targetEntity = SecurityEventDetail.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DETAILS_SECURITYEVENTOBJECT__0")
    public List<SecurityEventDetail> getDetails() {
        if (details == null) {
            details = new ArrayList<SecurityEventDetail>();
        }
        return this.details;
    }

    /**
     * 
     * 
     */
    public void setDetails(List<SecurityEventDetail> details) {
        this.details = details;
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

    public SecurityEventObject withDetails(List<SecurityEventDetail> details) {
        setDetails(details);
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
    public SecurityEventObject withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
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
    public SecurityEventObject withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public SecurityEventObject withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SecurityEventObject)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SecurityEventObject that = ((SecurityEventObject) object);
        {
            Identifier lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            Identifier rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier)) {
                return false;
            }
        }
        {
            ResourceReference lhsReference;
            lhsReference = this.getReference();
            ResourceReference rhsReference;
            rhsReference = that.getReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reference", lhsReference), LocatorUtils.property(thatLocator, "reference", rhsReference), lhsReference, rhsReference)) {
                return false;
            }
        }
        {
            SecurityEventObjectType lhsType;
            lhsType = this.getType();
            SecurityEventObjectType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            SecurityEventObjectRole lhsRole;
            lhsRole = this.getRole();
            SecurityEventObjectRole rhsRole;
            rhsRole = that.getRole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "role", lhsRole), LocatorUtils.property(thatLocator, "role", rhsRole), lhsRole, rhsRole)) {
                return false;
            }
        }
        {
            SecurityEventObjectLifecycle lhsLifecycle;
            lhsLifecycle = this.getLifecycle();
            SecurityEventObjectLifecycle rhsLifecycle;
            rhsLifecycle = that.getLifecycle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lifecycle", lhsLifecycle), LocatorUtils.property(thatLocator, "lifecycle", rhsLifecycle), lhsLifecycle, rhsLifecycle)) {
                return false;
            }
        }
        {
            CodeableConcept lhsSensitivity;
            lhsSensitivity = this.getSensitivity();
            CodeableConcept rhsSensitivity;
            rhsSensitivity = that.getSensitivity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sensitivity", lhsSensitivity), LocatorUtils.property(thatLocator, "sensitivity", rhsSensitivity), lhsSensitivity, rhsSensitivity)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsName;
            lhsName = this.getName();
            org.hl7.fhir.model.String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsDescription;
            lhsDescription = this.getDescription();
            org.hl7.fhir.model.String rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                return false;
            }
        }
        {
            Base64Binary lhsQuery;
            lhsQuery = this.getQuery();
            Base64Binary rhsQuery;
            rhsQuery = that.getQuery();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "query", lhsQuery), LocatorUtils.property(thatLocator, "query", rhsQuery), lhsQuery, rhsQuery)) {
                return false;
            }
        }
        {
            List<SecurityEventDetail> lhsDetails;
            lhsDetails = (((this.details!= null)&&(!this.details.isEmpty()))?this.getDetails():null);
            List<SecurityEventDetail> rhsDetails;
            rhsDetails = (((that.details!= null)&&(!that.details.isEmpty()))?that.getDetails():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "details", lhsDetails), LocatorUtils.property(thatLocator, "details", rhsDetails), lhsDetails, rhsDetails)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Identifier theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier);
        }
        {
            ResourceReference theReference;
            theReference = this.getReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reference", theReference), currentHashCode, theReference);
        }
        {
            SecurityEventObjectType theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            SecurityEventObjectRole theRole;
            theRole = this.getRole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "role", theRole), currentHashCode, theRole);
        }
        {
            SecurityEventObjectLifecycle theLifecycle;
            theLifecycle = this.getLifecycle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lifecycle", theLifecycle), currentHashCode, theLifecycle);
        }
        {
            CodeableConcept theSensitivity;
            theSensitivity = this.getSensitivity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sensitivity", theSensitivity), currentHashCode, theSensitivity);
        }
        {
            org.hl7.fhir.model.String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            org.hl7.fhir.model.String theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
        }
        {
            Base64Binary theQuery;
            theQuery = this.getQuery();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "query", theQuery), currentHashCode, theQuery);
        }
        {
            List<SecurityEventDetail> theDetails;
            theDetails = (((this.details!= null)&&(!this.details.isEmpty()))?this.getDetails():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "details", theDetails), currentHashCode, theDetails);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
