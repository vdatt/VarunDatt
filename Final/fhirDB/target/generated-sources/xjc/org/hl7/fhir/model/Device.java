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
 * <p>Java class for Device complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Device">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="manufacturer" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="expiry" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="udi" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="lotNumber" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="location" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="patient" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device", propOrder = {
    "identifiers",
    "type",
    "manufacturer",
    "model",
    "version",
    "expiry",
    "udi",
    "lotNumber",
    "owner",
    "location",
    "patient",
    "contacts",
    "url"
})
@XmlRootElement(name = "Device")
@Entity(name = "Device")
@Table(name = "DEVICE")
public class Device
    extends Resource
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "identifier")
    protected List<Identifier> identifiers;
    @XmlElement(required = true)
    protected CodeableConcept type;
    protected org.hl7.fhir.model.String manufacturer;
    protected org.hl7.fhir.model.String model;
    protected org.hl7.fhir.model.String version;
    protected Date expiry;
    protected org.hl7.fhir.model.String udi;
    protected org.hl7.fhir.model.String lotNumber;
    protected ResourceReference owner;
    protected ResourceReference location;
    protected ResourceReference patient;
    @XmlElement(name = "contact")
    protected List<Contact> contacts;
    protected Uri url;

    /**
     * Gets the value of the identifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    @OneToMany(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IDENTIFIERS_DEVICE_HJID")
    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    /**
     * 
     * 
     */
    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
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
    @JoinColumn(name = "TYPE__DEVICE_HJID")
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
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MANUFACTURER_DEVICE_HJID")
    public org.hl7.fhir.model.String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setManufacturer(org.hl7.fhir.model.String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MODEL_DEVICE_HJID")
    public org.hl7.fhir.model.String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setModel(org.hl7.fhir.model.String value) {
        this.model = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VERSION__DEVICE_HJID")
    public org.hl7.fhir.model.String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setVersion(org.hl7.fhir.model.String value) {
        this.version = value;
    }

    /**
     * Gets the value of the expiry property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    @ManyToOne(targetEntity = Date.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EXPIRY_DEVICE_HJID")
    public Date getExpiry() {
        return expiry;
    }

    /**
     * Sets the value of the expiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setExpiry(Date value) {
        this.expiry = value;
    }

    /**
     * Gets the value of the udi property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "UDI_DEVICE_HJID")
    public org.hl7.fhir.model.String getUdi() {
        return udi;
    }

    /**
     * Sets the value of the udi property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setUdi(org.hl7.fhir.model.String value) {
        this.udi = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LOTNUMBER_DEVICE_HJID")
    public org.hl7.fhir.model.String getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setLotNumber(org.hl7.fhir.model.String value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "OWNER__DEVICE_HJID")
    public ResourceReference getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setOwner(ResourceReference value) {
        this.owner = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LOCATION__DEVICE_HJID")
    public ResourceReference getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setLocation(ResourceReference value) {
        this.location = value;
    }

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PATIENT_DEVICE_HJID")
    public ResourceReference getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setPatient(ResourceReference value) {
        this.patient = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContacts().add(newItem);
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
    @JoinColumn(name = "CONTACTS_DEVICE_HJID")
    public List<Contact> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<Contact>();
        }
        return this.contacts;
    }

    /**
     * 
     * 
     */
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    @ManyToOne(targetEntity = Uri.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "URL_DEVICE_HJID")
    public Uri getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setUrl(Uri value) {
        this.url = value;
    }

    public Device withIdentifiers(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifiers().add(value);
            }
        }
        return this;
    }

    public Device withIdentifiers(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifiers().addAll(values);
        }
        return this;
    }

    public Device withIdentifiers(List<Identifier> identifiers) {
        setIdentifiers(identifiers);
        return this;
    }

    public Device withType(CodeableConcept value) {
        setType(value);
        return this;
    }

    public Device withManufacturer(org.hl7.fhir.model.String value) {
        setManufacturer(value);
        return this;
    }

    public Device withModel(org.hl7.fhir.model.String value) {
        setModel(value);
        return this;
    }

    public Device withVersion(org.hl7.fhir.model.String value) {
        setVersion(value);
        return this;
    }

    public Device withExpiry(Date value) {
        setExpiry(value);
        return this;
    }

    public Device withUdi(org.hl7.fhir.model.String value) {
        setUdi(value);
        return this;
    }

    public Device withLotNumber(org.hl7.fhir.model.String value) {
        setLotNumber(value);
        return this;
    }

    public Device withOwner(ResourceReference value) {
        setOwner(value);
        return this;
    }

    public Device withLocation(ResourceReference value) {
        setLocation(value);
        return this;
    }

    public Device withPatient(ResourceReference value) {
        setPatient(value);
        return this;
    }

    public Device withContacts(Contact... values) {
        if (values!= null) {
            for (Contact value: values) {
                getContacts().add(value);
            }
        }
        return this;
    }

    public Device withContacts(Collection<Contact> values) {
        if (values!= null) {
            getContacts().addAll(values);
        }
        return this;
    }

    public Device withContacts(List<Contact> contacts) {
        setContacts(contacts);
        return this;
    }

    public Device withUrl(Uri value) {
        setUrl(value);
        return this;
    }

    @Override
    public Device withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public Device withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public Device withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public Device withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public Device withContaineds(List<ResourceInline> containeds) {
        setContaineds(containeds);
        return this;
    }

    @Override
    public Device withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Device withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Device withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public Device withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Device withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Device withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public Device withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Device)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Device that = ((Device) object);
        {
            List<Identifier> lhsIdentifiers;
            lhsIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            List<Identifier> rhsIdentifiers;
            rhsIdentifiers = (((that.identifiers!= null)&&(!that.identifiers.isEmpty()))?that.getIdentifiers():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifiers", lhsIdentifiers), LocatorUtils.property(thatLocator, "identifiers", rhsIdentifiers), lhsIdentifiers, rhsIdentifiers)) {
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
            org.hl7.fhir.model.String lhsManufacturer;
            lhsManufacturer = this.getManufacturer();
            org.hl7.fhir.model.String rhsManufacturer;
            rhsManufacturer = that.getManufacturer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturer", lhsManufacturer), LocatorUtils.property(thatLocator, "manufacturer", rhsManufacturer), lhsManufacturer, rhsManufacturer)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsModel;
            lhsModel = this.getModel();
            org.hl7.fhir.model.String rhsModel;
            rhsModel = that.getModel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "model", lhsModel), LocatorUtils.property(thatLocator, "model", rhsModel), lhsModel, rhsModel)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsVersion;
            lhsVersion = this.getVersion();
            org.hl7.fhir.model.String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion)) {
                return false;
            }
        }
        {
            Date lhsExpiry;
            lhsExpiry = this.getExpiry();
            Date rhsExpiry;
            rhsExpiry = that.getExpiry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expiry", lhsExpiry), LocatorUtils.property(thatLocator, "expiry", rhsExpiry), lhsExpiry, rhsExpiry)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsUdi;
            lhsUdi = this.getUdi();
            org.hl7.fhir.model.String rhsUdi;
            rhsUdi = that.getUdi();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "udi", lhsUdi), LocatorUtils.property(thatLocator, "udi", rhsUdi), lhsUdi, rhsUdi)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsLotNumber;
            lhsLotNumber = this.getLotNumber();
            org.hl7.fhir.model.String rhsLotNumber;
            rhsLotNumber = that.getLotNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotNumber", lhsLotNumber), LocatorUtils.property(thatLocator, "lotNumber", rhsLotNumber), lhsLotNumber, rhsLotNumber)) {
                return false;
            }
        }
        {
            ResourceReference lhsOwner;
            lhsOwner = this.getOwner();
            ResourceReference rhsOwner;
            rhsOwner = that.getOwner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "owner", lhsOwner), LocatorUtils.property(thatLocator, "owner", rhsOwner), lhsOwner, rhsOwner)) {
                return false;
            }
        }
        {
            ResourceReference lhsLocation;
            lhsLocation = this.getLocation();
            ResourceReference rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation)) {
                return false;
            }
        }
        {
            ResourceReference lhsPatient;
            lhsPatient = this.getPatient();
            ResourceReference rhsPatient;
            rhsPatient = that.getPatient();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "patient", lhsPatient), LocatorUtils.property(thatLocator, "patient", rhsPatient), lhsPatient, rhsPatient)) {
                return false;
            }
        }
        {
            List<Contact> lhsContacts;
            lhsContacts = (((this.contacts!= null)&&(!this.contacts.isEmpty()))?this.getContacts():null);
            List<Contact> rhsContacts;
            rhsContacts = (((that.contacts!= null)&&(!that.contacts.isEmpty()))?that.getContacts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contacts", lhsContacts), LocatorUtils.property(thatLocator, "contacts", rhsContacts), lhsContacts, rhsContacts)) {
                return false;
            }
        }
        {
            Uri lhsUrl;
            lhsUrl = this.getUrl();
            Uri rhsUrl;
            rhsUrl = that.getUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl)) {
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
            List<Identifier> theIdentifiers;
            theIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifiers", theIdentifiers), currentHashCode, theIdentifiers);
        }
        {
            CodeableConcept theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            org.hl7.fhir.model.String theManufacturer;
            theManufacturer = this.getManufacturer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturer", theManufacturer), currentHashCode, theManufacturer);
        }
        {
            org.hl7.fhir.model.String theModel;
            theModel = this.getModel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "model", theModel), currentHashCode, theModel);
        }
        {
            org.hl7.fhir.model.String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion);
        }
        {
            Date theExpiry;
            theExpiry = this.getExpiry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expiry", theExpiry), currentHashCode, theExpiry);
        }
        {
            org.hl7.fhir.model.String theUdi;
            theUdi = this.getUdi();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "udi", theUdi), currentHashCode, theUdi);
        }
        {
            org.hl7.fhir.model.String theLotNumber;
            theLotNumber = this.getLotNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotNumber", theLotNumber), currentHashCode, theLotNumber);
        }
        {
            ResourceReference theOwner;
            theOwner = this.getOwner();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "owner", theOwner), currentHashCode, theOwner);
        }
        {
            ResourceReference theLocation;
            theLocation = this.getLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "location", theLocation), currentHashCode, theLocation);
        }
        {
            ResourceReference thePatient;
            thePatient = this.getPatient();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "patient", thePatient), currentHashCode, thePatient);
        }
        {
            List<Contact> theContacts;
            theContacts = (((this.contacts!= null)&&(!this.contacts.isEmpty()))?this.getContacts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contacts", theContacts), currentHashCode, theContacts);
        }
        {
            Uri theUrl;
            theUrl = this.getUrl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "url", theUrl), currentHashCode, theUrl);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
