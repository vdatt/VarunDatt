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
 * <p>Java class for Practitioner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Practitioner">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://hl7.org/fhir}HumanName" minOccurs="0"/>
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="address" type="{http://hl7.org/fhir}Address" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/>
 *         &lt;element name="photo" type="{http://hl7.org/fhir}Attachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="role" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specialty" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="location" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="qualification" type="{http://hl7.org/fhir}Practitioner.Qualification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="communication" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Practitioner", propOrder = {
    "identifiers",
    "name",
    "telecoms",
    "address",
    "gender",
    "birthDate",
    "photos",
    "organization",
    "roles",
    "specialties",
    "period",
    "locations",
    "qualifications",
    "communications"
})
@XmlRootElement(name = "Practitioner")
@Entity(name = "Practitioner")
@Table(name = "PRACTITIONER")
public class Practitioner
    extends Resource
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "identifier")
    protected List<Identifier> identifiers;
    protected HumanName name;
    @XmlElement(name = "telecom")
    protected List<Contact> telecoms;
    protected Address address;
    protected CodeableConcept gender;
    protected DateTime birthDate;
    @XmlElement(name = "photo")
    protected List<Attachment> photos;
    protected ResourceReference organization;
    @XmlElement(name = "role")
    protected List<CodeableConcept> roles;
    @XmlElement(name = "specialty")
    protected List<CodeableConcept> specialties;
    protected Period period;
    @XmlElement(name = "location")
    protected List<ResourceReference> locations;
    @XmlElement(name = "qualification")
    protected List<PractitionerQualification> qualifications;
    @XmlElement(name = "communication")
    protected List<CodeableConcept> communications;

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
    @JoinColumn(name = "IDENTIFIERS_PRACTITIONER_HJID")
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link HumanName }
     *     
     */
    @ManyToOne(targetEntity = HumanName.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NAME__PRACTITIONER_HJID")
    public HumanName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanName }
     *     
     */
    public void setName(HumanName value) {
        this.name = value;
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
    @JoinColumn(name = "TELECOMS_PRACTITIONER_HJID")
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
    @JoinColumn(name = "ADDRESS_PRACTITIONER_HJID")
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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "GENDER_PRACTITIONER_HJID")
    public CodeableConcept getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setGender(CodeableConcept value) {
        this.gender = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "BIRTHDATE_PRACTITIONER_HJID")
    public DateTime getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setBirthDate(DateTime value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the photos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the photos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhotos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    @OneToMany(targetEntity = Attachment.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PHOTOS_PRACTITIONER_HJID")
    public List<Attachment> getPhotos() {
        if (photos == null) {
            photos = new ArrayList<Attachment>();
        }
        return this.photos;
    }

    /**
     * 
     * 
     */
    public void setPhotos(List<Attachment> photos) {
        this.photos = photos;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ORGANIZATION_PRACTITIONER_HJ_0")
    public ResourceReference getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setOrganization(ResourceReference value) {
        this.organization = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    @OneToMany(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ROLES_PRACTITIONER_HJID")
    public List<CodeableConcept> getRoles() {
        if (roles == null) {
            roles = new ArrayList<CodeableConcept>();
        }
        return this.roles;
    }

    /**
     * 
     * 
     */
    public void setRoles(List<CodeableConcept> roles) {
        this.roles = roles;
    }

    /**
     * Gets the value of the specialties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    @OneToMany(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SPECIALTIES_PRACTITIONER_HJID")
    public List<CodeableConcept> getSpecialties() {
        if (specialties == null) {
            specialties = new ArrayList<CodeableConcept>();
        }
        return this.specialties;
    }

    /**
     * 
     * 
     */
    public void setSpecialties(List<CodeableConcept> specialties) {
        this.specialties = specialties;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    @ManyToOne(targetEntity = Period.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PERIOD_PRACTITIONER_HJID")
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    @OneToMany(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LOCATIONS_PRACTITIONER_HJID")
    public List<ResourceReference> getLocations() {
        if (locations == null) {
            locations = new ArrayList<ResourceReference>();
        }
        return this.locations;
    }

    /**
     * 
     * 
     */
    public void setLocations(List<ResourceReference> locations) {
        this.locations = locations;
    }

    /**
     * Gets the value of the qualifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PractitionerQualification }
     * 
     * 
     */
    @OneToMany(targetEntity = PractitionerQualification.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "QUALIFICATIONS_PRACTITIONER__0")
    public List<PractitionerQualification> getQualifications() {
        if (qualifications == null) {
            qualifications = new ArrayList<PractitionerQualification>();
        }
        return this.qualifications;
    }

    /**
     * 
     * 
     */
    public void setQualifications(List<PractitionerQualification> qualifications) {
        this.qualifications = qualifications;
    }

    /**
     * Gets the value of the communications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    @OneToMany(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COMMUNICATIONS_PRACTITIONER__0")
    public List<CodeableConcept> getCommunications() {
        if (communications == null) {
            communications = new ArrayList<CodeableConcept>();
        }
        return this.communications;
    }

    /**
     * 
     * 
     */
    public void setCommunications(List<CodeableConcept> communications) {
        this.communications = communications;
    }

    public Practitioner withIdentifiers(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifiers().add(value);
            }
        }
        return this;
    }

    public Practitioner withIdentifiers(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifiers().addAll(values);
        }
        return this;
    }

    public Practitioner withIdentifiers(List<Identifier> identifiers) {
        setIdentifiers(identifiers);
        return this;
    }

    public Practitioner withName(HumanName value) {
        setName(value);
        return this;
    }

    public Practitioner withTelecoms(Contact... values) {
        if (values!= null) {
            for (Contact value: values) {
                getTelecoms().add(value);
            }
        }
        return this;
    }

    public Practitioner withTelecoms(Collection<Contact> values) {
        if (values!= null) {
            getTelecoms().addAll(values);
        }
        return this;
    }

    public Practitioner withTelecoms(List<Contact> telecoms) {
        setTelecoms(telecoms);
        return this;
    }

    public Practitioner withAddress(Address value) {
        setAddress(value);
        return this;
    }

    public Practitioner withGender(CodeableConcept value) {
        setGender(value);
        return this;
    }

    public Practitioner withBirthDate(DateTime value) {
        setBirthDate(value);
        return this;
    }

    public Practitioner withPhotos(Attachment... values) {
        if (values!= null) {
            for (Attachment value: values) {
                getPhotos().add(value);
            }
        }
        return this;
    }

    public Practitioner withPhotos(Collection<Attachment> values) {
        if (values!= null) {
            getPhotos().addAll(values);
        }
        return this;
    }

    public Practitioner withPhotos(List<Attachment> photos) {
        setPhotos(photos);
        return this;
    }

    public Practitioner withOrganization(ResourceReference value) {
        setOrganization(value);
        return this;
    }

    public Practitioner withRoles(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getRoles().add(value);
            }
        }
        return this;
    }

    public Practitioner withRoles(Collection<CodeableConcept> values) {
        if (values!= null) {
            getRoles().addAll(values);
        }
        return this;
    }

    public Practitioner withRoles(List<CodeableConcept> roles) {
        setRoles(roles);
        return this;
    }

    public Practitioner withSpecialties(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getSpecialties().add(value);
            }
        }
        return this;
    }

    public Practitioner withSpecialties(Collection<CodeableConcept> values) {
        if (values!= null) {
            getSpecialties().addAll(values);
        }
        return this;
    }

    public Practitioner withSpecialties(List<CodeableConcept> specialties) {
        setSpecialties(specialties);
        return this;
    }

    public Practitioner withPeriod(Period value) {
        setPeriod(value);
        return this;
    }

    public Practitioner withLocations(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getLocations().add(value);
            }
        }
        return this;
    }

    public Practitioner withLocations(Collection<ResourceReference> values) {
        if (values!= null) {
            getLocations().addAll(values);
        }
        return this;
    }

    public Practitioner withLocations(List<ResourceReference> locations) {
        setLocations(locations);
        return this;
    }

    public Practitioner withQualifications(PractitionerQualification... values) {
        if (values!= null) {
            for (PractitionerQualification value: values) {
                getQualifications().add(value);
            }
        }
        return this;
    }

    public Practitioner withQualifications(Collection<PractitionerQualification> values) {
        if (values!= null) {
            getQualifications().addAll(values);
        }
        return this;
    }

    public Practitioner withQualifications(List<PractitionerQualification> qualifications) {
        setQualifications(qualifications);
        return this;
    }

    public Practitioner withCommunications(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getCommunications().add(value);
            }
        }
        return this;
    }

    public Practitioner withCommunications(Collection<CodeableConcept> values) {
        if (values!= null) {
            getCommunications().addAll(values);
        }
        return this;
    }

    public Practitioner withCommunications(List<CodeableConcept> communications) {
        setCommunications(communications);
        return this;
    }

    @Override
    public Practitioner withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public Practitioner withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public Practitioner withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public Practitioner withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public Practitioner withContaineds(List<ResourceInline> containeds) {
        setContaineds(containeds);
        return this;
    }

    @Override
    public Practitioner withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Practitioner withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Practitioner withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public Practitioner withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Practitioner withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Practitioner withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public Practitioner withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Practitioner)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Practitioner that = ((Practitioner) object);
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
            HumanName lhsName;
            lhsName = this.getName();
            HumanName rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
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
            CodeableConcept lhsGender;
            lhsGender = this.getGender();
            CodeableConcept rhsGender;
            rhsGender = that.getGender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gender", lhsGender), LocatorUtils.property(thatLocator, "gender", rhsGender), lhsGender, rhsGender)) {
                return false;
            }
        }
        {
            DateTime lhsBirthDate;
            lhsBirthDate = this.getBirthDate();
            DateTime rhsBirthDate;
            rhsBirthDate = that.getBirthDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "birthDate", lhsBirthDate), LocatorUtils.property(thatLocator, "birthDate", rhsBirthDate), lhsBirthDate, rhsBirthDate)) {
                return false;
            }
        }
        {
            List<Attachment> lhsPhotos;
            lhsPhotos = (((this.photos!= null)&&(!this.photos.isEmpty()))?this.getPhotos():null);
            List<Attachment> rhsPhotos;
            rhsPhotos = (((that.photos!= null)&&(!that.photos.isEmpty()))?that.getPhotos():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "photos", lhsPhotos), LocatorUtils.property(thatLocator, "photos", rhsPhotos), lhsPhotos, rhsPhotos)) {
                return false;
            }
        }
        {
            ResourceReference lhsOrganization;
            lhsOrganization = this.getOrganization();
            ResourceReference rhsOrganization;
            rhsOrganization = that.getOrganization();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "organization", lhsOrganization), LocatorUtils.property(thatLocator, "organization", rhsOrganization), lhsOrganization, rhsOrganization)) {
                return false;
            }
        }
        {
            List<CodeableConcept> lhsRoles;
            lhsRoles = (((this.roles!= null)&&(!this.roles.isEmpty()))?this.getRoles():null);
            List<CodeableConcept> rhsRoles;
            rhsRoles = (((that.roles!= null)&&(!that.roles.isEmpty()))?that.getRoles():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roles", lhsRoles), LocatorUtils.property(thatLocator, "roles", rhsRoles), lhsRoles, rhsRoles)) {
                return false;
            }
        }
        {
            List<CodeableConcept> lhsSpecialties;
            lhsSpecialties = (((this.specialties!= null)&&(!this.specialties.isEmpty()))?this.getSpecialties():null);
            List<CodeableConcept> rhsSpecialties;
            rhsSpecialties = (((that.specialties!= null)&&(!that.specialties.isEmpty()))?that.getSpecialties():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialties", lhsSpecialties), LocatorUtils.property(thatLocator, "specialties", rhsSpecialties), lhsSpecialties, rhsSpecialties)) {
                return false;
            }
        }
        {
            Period lhsPeriod;
            lhsPeriod = this.getPeriod();
            Period rhsPeriod;
            rhsPeriod = that.getPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "period", lhsPeriod), LocatorUtils.property(thatLocator, "period", rhsPeriod), lhsPeriod, rhsPeriod)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsLocations;
            lhsLocations = (((this.locations!= null)&&(!this.locations.isEmpty()))?this.getLocations():null);
            List<ResourceReference> rhsLocations;
            rhsLocations = (((that.locations!= null)&&(!that.locations.isEmpty()))?that.getLocations():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locations", lhsLocations), LocatorUtils.property(thatLocator, "locations", rhsLocations), lhsLocations, rhsLocations)) {
                return false;
            }
        }
        {
            List<PractitionerQualification> lhsQualifications;
            lhsQualifications = (((this.qualifications!= null)&&(!this.qualifications.isEmpty()))?this.getQualifications():null);
            List<PractitionerQualification> rhsQualifications;
            rhsQualifications = (((that.qualifications!= null)&&(!that.qualifications.isEmpty()))?that.getQualifications():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qualifications", lhsQualifications), LocatorUtils.property(thatLocator, "qualifications", rhsQualifications), lhsQualifications, rhsQualifications)) {
                return false;
            }
        }
        {
            List<CodeableConcept> lhsCommunications;
            lhsCommunications = (((this.communications!= null)&&(!this.communications.isEmpty()))?this.getCommunications():null);
            List<CodeableConcept> rhsCommunications;
            rhsCommunications = (((that.communications!= null)&&(!that.communications.isEmpty()))?that.getCommunications():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "communications", lhsCommunications), LocatorUtils.property(thatLocator, "communications", rhsCommunications), lhsCommunications, rhsCommunications)) {
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
            HumanName theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
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
            CodeableConcept theGender;
            theGender = this.getGender();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gender", theGender), currentHashCode, theGender);
        }
        {
            DateTime theBirthDate;
            theBirthDate = this.getBirthDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "birthDate", theBirthDate), currentHashCode, theBirthDate);
        }
        {
            List<Attachment> thePhotos;
            thePhotos = (((this.photos!= null)&&(!this.photos.isEmpty()))?this.getPhotos():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "photos", thePhotos), currentHashCode, thePhotos);
        }
        {
            ResourceReference theOrganization;
            theOrganization = this.getOrganization();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "organization", theOrganization), currentHashCode, theOrganization);
        }
        {
            List<CodeableConcept> theRoles;
            theRoles = (((this.roles!= null)&&(!this.roles.isEmpty()))?this.getRoles():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "roles", theRoles), currentHashCode, theRoles);
        }
        {
            List<CodeableConcept> theSpecialties;
            theSpecialties = (((this.specialties!= null)&&(!this.specialties.isEmpty()))?this.getSpecialties():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialties", theSpecialties), currentHashCode, theSpecialties);
        }
        {
            Period thePeriod;
            thePeriod = this.getPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "period", thePeriod), currentHashCode, thePeriod);
        }
        {
            List<ResourceReference> theLocations;
            theLocations = (((this.locations!= null)&&(!this.locations.isEmpty()))?this.getLocations():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locations", theLocations), currentHashCode, theLocations);
        }
        {
            List<PractitionerQualification> theQualifications;
            theQualifications = (((this.qualifications!= null)&&(!this.qualifications.isEmpty()))?this.getQualifications():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qualifications", theQualifications), currentHashCode, theQualifications);
        }
        {
            List<CodeableConcept> theCommunications;
            theCommunications = (((this.communications!= null)&&(!this.communications.isEmpty()))?this.getCommunications():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "communications", theCommunications), currentHashCode, theCommunications);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}