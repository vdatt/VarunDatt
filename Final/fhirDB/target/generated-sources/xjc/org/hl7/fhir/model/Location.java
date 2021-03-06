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
import javax.xml.bind.annotation.XmlRootElement;
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
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="address" type="{http://hl7.org/fhir}Address" minOccurs="0"/>
 *         &lt;element name="physicalType" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="position" type="{http://hl7.org/fhir}Location.Position" minOccurs="0"/>
 *         &lt;element name="managingOrganization" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}LocationStatus" minOccurs="0"/>
 *         &lt;element name="partOf" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://hl7.org/fhir}LocationMode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "identifier",
    "name",
    "description",
    "type",
    "telecoms",
    "address",
    "physicalType",
    "position",
    "managingOrganization",
    "status",
    "partOf",
    "mode"
})
@XmlRootElement(name = "Location")
@Entity(name = "Location")
@Table(name = "LOCATION_")
public class Location
    extends Resource
    implements Serializable, Equals, HashCode
{

    protected Identifier identifier;
    protected org.hl7.fhir.model.String name;
    protected org.hl7.fhir.model.String description;
    protected CodeableConcept type;
    @XmlElement(name = "telecom")
    protected List<Contact> telecoms;
    protected Address address;
    protected CodeableConcept physicalType;
    protected LocationPosition position;
    protected ResourceReference managingOrganization;
    protected LocationStatus status;
    protected ResourceReference partOf;
    protected LocationMode mode;

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
    @JoinColumn(name = "IDENTIFIER_LOCATION__HJID")
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
    @JoinColumn(name = "NAME__LOCATION__HJID")
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
    @JoinColumn(name = "DESCRIPTION_LOCATION__HJID")
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TYPE__LOCATION__HJID")
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * Gets the value of the telecoms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecoms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecoms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    @OneToMany(targetEntity = Contact.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TELECOMS_LOCATION__HJID")
    public List<Contact> getTelecoms() {
        if (telecoms == null) {
            telecoms = new ArrayList<Contact>();
        }
        return this.telecoms;
    }

    /**
     * 
     * 
     */
    public void setTelecoms(List<Contact> telecoms) {
        this.telecoms = telecoms;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    @ManyToOne(targetEntity = Address.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ADDRESS_LOCATION__HJID")
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the physicalType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PHYSICALTYPE_LOCATION__HJID")
    public CodeableConcept getPhysicalType() {
        return physicalType;
    }

    /**
     * Sets the value of the physicalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setPhysicalType(CodeableConcept value) {
        this.physicalType = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link LocationPosition }
     *     
     */
    @ManyToOne(targetEntity = LocationPosition.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "POSITION__LOCATION__HJID")
    public LocationPosition getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationPosition }
     *     
     */
    public void setPosition(LocationPosition value) {
        this.position = value;
    }

    /**
     * Gets the value of the managingOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MANAGINGORGANIZATION_LOCATIO_0")
    public ResourceReference getManagingOrganization() {
        return managingOrganization;
    }

    /**
     * Sets the value of the managingOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setManagingOrganization(ResourceReference value) {
        this.managingOrganization = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStatus }
     *     
     */
    @ManyToOne(targetEntity = LocationStatus.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "STATUS_LOCATION__HJID")
    public LocationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStatus }
     *     
     */
    public void setStatus(LocationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the partOf property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PARTOF_LOCATION__HJID")
    public ResourceReference getPartOf() {
        return partOf;
    }

    /**
     * Sets the value of the partOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setPartOf(ResourceReference value) {
        this.partOf = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link LocationMode }
     *     
     */
    @ManyToOne(targetEntity = LocationMode.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MODE__LOCATION__HJID")
    public LocationMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationMode }
     *     
     */
    public void setMode(LocationMode value) {
        this.mode = value;
    }

    public Location withIdentifier(Identifier value) {
        setIdentifier(value);
        return this;
    }

    public Location withName(org.hl7.fhir.model.String value) {
        setName(value);
        return this;
    }

    public Location withDescription(org.hl7.fhir.model.String value) {
        setDescription(value);
        return this;
    }

    public Location withType(CodeableConcept value) {
        setType(value);
        return this;
    }

    public Location withTelecoms(Contact... values) {
        if (values!= null) {
            for (Contact value: values) {
                getTelecoms().add(value);
            }
        }
        return this;
    }

    public Location withTelecoms(Collection<Contact> values) {
        if (values!= null) {
            getTelecoms().addAll(values);
        }
        return this;
    }

    public Location withTelecoms(List<Contact> telecoms) {
        setTelecoms(telecoms);
        return this;
    }

    public Location withAddress(Address value) {
        setAddress(value);
        return this;
    }

    public Location withPhysicalType(CodeableConcept value) {
        setPhysicalType(value);
        return this;
    }

    public Location withPosition(LocationPosition value) {
        setPosition(value);
        return this;
    }

    public Location withManagingOrganization(ResourceReference value) {
        setManagingOrganization(value);
        return this;
    }

    public Location withStatus(LocationStatus value) {
        setStatus(value);
        return this;
    }

    public Location withPartOf(ResourceReference value) {
        setPartOf(value);
        return this;
    }

    public Location withMode(LocationMode value) {
        setMode(value);
        return this;
    }

    @Override
    public Location withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public Location withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public Location withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public Location withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public Location withContaineds(List<ResourceInline> containeds) {
        setContaineds(containeds);
        return this;
    }

    @Override
    public Location withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Location withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Location withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public Location withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Location withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Location withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public Location withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Location)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Location that = ((Location) object);
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
            CodeableConcept lhsType;
            lhsType = this.getType();
            CodeableConcept rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            List<Contact> lhsTelecoms;
            lhsTelecoms = (((this.telecoms!= null)&&(!this.telecoms.isEmpty()))?this.getTelecoms():null);
            List<Contact> rhsTelecoms;
            rhsTelecoms = (((that.telecoms!= null)&&(!that.telecoms.isEmpty()))?that.getTelecoms():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telecoms", lhsTelecoms), LocatorUtils.property(thatLocator, "telecoms", rhsTelecoms), lhsTelecoms, rhsTelecoms)) {
                return false;
            }
        }
        {
            Address lhsAddress;
            lhsAddress = this.getAddress();
            Address rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress)) {
                return false;
            }
        }
        {
            CodeableConcept lhsPhysicalType;
            lhsPhysicalType = this.getPhysicalType();
            CodeableConcept rhsPhysicalType;
            rhsPhysicalType = that.getPhysicalType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "physicalType", lhsPhysicalType), LocatorUtils.property(thatLocator, "physicalType", rhsPhysicalType), lhsPhysicalType, rhsPhysicalType)) {
                return false;
            }
        }
        {
            LocationPosition lhsPosition;
            lhsPosition = this.getPosition();
            LocationPosition rhsPosition;
            rhsPosition = that.getPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "position", lhsPosition), LocatorUtils.property(thatLocator, "position", rhsPosition), lhsPosition, rhsPosition)) {
                return false;
            }
        }
        {
            ResourceReference lhsManagingOrganization;
            lhsManagingOrganization = this.getManagingOrganization();
            ResourceReference rhsManagingOrganization;
            rhsManagingOrganization = that.getManagingOrganization();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "managingOrganization", lhsManagingOrganization), LocatorUtils.property(thatLocator, "managingOrganization", rhsManagingOrganization), lhsManagingOrganization, rhsManagingOrganization)) {
                return false;
            }
        }
        {
            LocationStatus lhsStatus;
            lhsStatus = this.getStatus();
            LocationStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            ResourceReference lhsPartOf;
            lhsPartOf = this.getPartOf();
            ResourceReference rhsPartOf;
            rhsPartOf = that.getPartOf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partOf", lhsPartOf), LocatorUtils.property(thatLocator, "partOf", rhsPartOf), lhsPartOf, rhsPartOf)) {
                return false;
            }
        }
        {
            LocationMode lhsMode;
            lhsMode = this.getMode();
            LocationMode rhsMode;
            rhsMode = that.getMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mode", lhsMode), LocatorUtils.property(thatLocator, "mode", rhsMode), lhsMode, rhsMode)) {
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
            CodeableConcept theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            List<Contact> theTelecoms;
            theTelecoms = (((this.telecoms!= null)&&(!this.telecoms.isEmpty()))?this.getTelecoms():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "telecoms", theTelecoms), currentHashCode, theTelecoms);
        }
        {
            Address theAddress;
            theAddress = this.getAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "address", theAddress), currentHashCode, theAddress);
        }
        {
            CodeableConcept thePhysicalType;
            thePhysicalType = this.getPhysicalType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "physicalType", thePhysicalType), currentHashCode, thePhysicalType);
        }
        {
            LocationPosition thePosition;
            thePosition = this.getPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "position", thePosition), currentHashCode, thePosition);
        }
        {
            ResourceReference theManagingOrganization;
            theManagingOrganization = this.getManagingOrganization();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "managingOrganization", theManagingOrganization), currentHashCode, theManagingOrganization);
        }
        {
            LocationStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            ResourceReference thePartOf;
            thePartOf = this.getPartOf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partOf", thePartOf), currentHashCode, thePartOf);
        }
        {
            LocationMode theMode;
            theMode = this.getMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mode", theMode), currentHashCode, theMode);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
