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
 * <p>Java class for Composition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Composition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime"/>
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="class" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="title" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://hl7.org/fhir}CompositionStatus"/>
 *         &lt;element name="confidentiality" type="{http://hl7.org/fhir}Coding"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/>
 *         &lt;element name="author" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded"/>
 *         &lt;element name="attester" type="{http://hl7.org/fhir}Composition.Attester" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="custodian" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="event" type="{http://hl7.org/fhir}Composition.Event" minOccurs="0"/>
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="section" type="{http://hl7.org/fhir}Composition.Section" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Composition", propOrder = {
    "identifier",
    "date",
    "type",
    "clazz",
    "title",
    "status",
    "confidentiality",
    "subject",
    "authors",
    "attesters",
    "custodian",
    "event",
    "encounter",
    "sections"
})
@XmlRootElement(name = "Composition")
@Entity(name = "Composition")
@Table(name = "COMPOSITION")
public class Composition
    extends Resource
    implements Serializable, Equals, HashCode
{

    protected Identifier identifier;
    @XmlElement(required = true)
    protected DateTime date;
    @XmlElement(required = true)
    protected CodeableConcept type;
    @XmlElement(name = "class")
    protected CodeableConcept clazz;
    protected org.hl7.fhir.model.String title;
    @XmlElement(required = true)
    protected CompositionStatus status;
    @XmlElement(required = true)
    protected Coding confidentiality;
    @XmlElement(required = true)
    protected ResourceReference subject;
    @XmlElement(name = "author", required = true)
    protected List<ResourceReference> authors;
    @XmlElement(name = "attester")
    protected List<CompositionAttester> attesters;
    protected ResourceReference custodian;
    protected CompositionEvent event;
    protected ResourceReference encounter;
    @XmlElement(name = "section")
    protected List<CompositionSection> sections;

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
    @JoinColumn(name = "IDENTIFIER_COMPOSITION_HJID")
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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DATE__COMPOSITION_HJID")
    public DateTime getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setDate(DateTime value) {
        this.date = value;
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
    @JoinColumn(name = "TYPE__COMPOSITION_HJID")
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
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CLAZZ_COMPOSITION_HJID")
    public CodeableConcept getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setClazz(CodeableConcept value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    @ManyToOne(targetEntity = org.hl7.fhir.model.String.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TITLE_COMPOSITION_HJID")
    public org.hl7.fhir.model.String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setTitle(org.hl7.fhir.model.String value) {
        this.title = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CompositionStatus }
     *     
     */
    @ManyToOne(targetEntity = CompositionStatus.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "STATUS_COMPOSITION_HJID")
    public CompositionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositionStatus }
     *     
     */
    public void setStatus(CompositionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the confidentiality property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    @ManyToOne(targetEntity = Coding.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CONFIDENTIALITY_COMPOSITION__0")
    public Coding getConfidentiality() {
        return confidentiality;
    }

    /**
     * Sets the value of the confidentiality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setConfidentiality(Coding value) {
        this.confidentiality = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SUBJECT_COMPOSITION_HJID")
    public ResourceReference getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSubject(ResourceReference value) {
        this.subject = value;
    }

    /**
     * Gets the value of the authors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthors().add(newItem);
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
    @JoinColumn(name = "AUTHORS_COMPOSITION_HJID")
    public List<ResourceReference> getAuthors() {
        if (authors == null) {
            authors = new ArrayList<ResourceReference>();
        }
        return this.authors;
    }

    /**
     * 
     * 
     */
    public void setAuthors(List<ResourceReference> authors) {
        this.authors = authors;
    }

    /**
     * Gets the value of the attesters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attesters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttesters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositionAttester }
     * 
     * 
     */
    @OneToMany(targetEntity = CompositionAttester.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ATTESTERS_COMPOSITION_HJID")
    public List<CompositionAttester> getAttesters() {
        if (attesters == null) {
            attesters = new ArrayList<CompositionAttester>();
        }
        return this.attesters;
    }

    /**
     * 
     * 
     */
    public void setAttesters(List<CompositionAttester> attesters) {
        this.attesters = attesters;
    }

    /**
     * Gets the value of the custodian property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CUSTODIAN_COMPOSITION_HJID")
    public ResourceReference getCustodian() {
        return custodian;
    }

    /**
     * Sets the value of the custodian property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setCustodian(ResourceReference value) {
        this.custodian = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link CompositionEvent }
     *     
     */
    @ManyToOne(targetEntity = CompositionEvent.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EVENT_COMPOSITION_HJID")
    public CompositionEvent getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositionEvent }
     *     
     */
    public void setEvent(CompositionEvent value) {
        this.event = value;
    }

    /**
     * Gets the value of the encounter property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ENCOUNTER_COMPOSITION_HJID")
    public ResourceReference getEncounter() {
        return encounter;
    }

    /**
     * Sets the value of the encounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setEncounter(ResourceReference value) {
        this.encounter = value;
    }

    /**
     * Gets the value of the sections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositionSection }
     * 
     * 
     */
    @OneToMany(targetEntity = CompositionSection.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SECTIONS_COMPOSITION_HJID")
    public List<CompositionSection> getSections() {
        if (sections == null) {
            sections = new ArrayList<CompositionSection>();
        }
        return this.sections;
    }

    /**
     * 
     * 
     */
    public void setSections(List<CompositionSection> sections) {
        this.sections = sections;
    }

    public Composition withIdentifier(Identifier value) {
        setIdentifier(value);
        return this;
    }

    public Composition withDate(DateTime value) {
        setDate(value);
        return this;
    }

    public Composition withType(CodeableConcept value) {
        setType(value);
        return this;
    }

    public Composition withClazz(CodeableConcept value) {
        setClazz(value);
        return this;
    }

    public Composition withTitle(org.hl7.fhir.model.String value) {
        setTitle(value);
        return this;
    }

    public Composition withStatus(CompositionStatus value) {
        setStatus(value);
        return this;
    }

    public Composition withConfidentiality(Coding value) {
        setConfidentiality(value);
        return this;
    }

    public Composition withSubject(ResourceReference value) {
        setSubject(value);
        return this;
    }

    public Composition withAuthors(ResourceReference... values) {
        if (values!= null) {
            for (ResourceReference value: values) {
                getAuthors().add(value);
            }
        }
        return this;
    }

    public Composition withAuthors(Collection<ResourceReference> values) {
        if (values!= null) {
            getAuthors().addAll(values);
        }
        return this;
    }

    public Composition withAuthors(List<ResourceReference> authors) {
        setAuthors(authors);
        return this;
    }

    public Composition withAttesters(CompositionAttester... values) {
        if (values!= null) {
            for (CompositionAttester value: values) {
                getAttesters().add(value);
            }
        }
        return this;
    }

    public Composition withAttesters(Collection<CompositionAttester> values) {
        if (values!= null) {
            getAttesters().addAll(values);
        }
        return this;
    }

    public Composition withAttesters(List<CompositionAttester> attesters) {
        setAttesters(attesters);
        return this;
    }

    public Composition withCustodian(ResourceReference value) {
        setCustodian(value);
        return this;
    }

    public Composition withEvent(CompositionEvent value) {
        setEvent(value);
        return this;
    }

    public Composition withEncounter(ResourceReference value) {
        setEncounter(value);
        return this;
    }

    public Composition withSections(CompositionSection... values) {
        if (values!= null) {
            for (CompositionSection value: values) {
                getSections().add(value);
            }
        }
        return this;
    }

    public Composition withSections(Collection<CompositionSection> values) {
        if (values!= null) {
            getSections().addAll(values);
        }
        return this;
    }

    public Composition withSections(List<CompositionSection> sections) {
        setSections(sections);
        return this;
    }

    @Override
    public Composition withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public Composition withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public Composition withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public Composition withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public Composition withContaineds(List<ResourceInline> containeds) {
        setContaineds(containeds);
        return this;
    }

    @Override
    public Composition withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Composition withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Composition withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public Composition withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Composition withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Composition withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public Composition withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Composition)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Composition that = ((Composition) object);
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
            DateTime lhsDate;
            lhsDate = this.getDate();
            DateTime rhsDate;
            rhsDate = that.getDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate)) {
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
            CodeableConcept lhsClazz;
            lhsClazz = this.getClazz();
            CodeableConcept rhsClazz;
            rhsClazz = that.getClazz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clazz", lhsClazz), LocatorUtils.property(thatLocator, "clazz", rhsClazz), lhsClazz, rhsClazz)) {
                return false;
            }
        }
        {
            org.hl7.fhir.model.String lhsTitle;
            lhsTitle = this.getTitle();
            org.hl7.fhir.model.String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle)) {
                return false;
            }
        }
        {
            CompositionStatus lhsStatus;
            lhsStatus = this.getStatus();
            CompositionStatus rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            Coding lhsConfidentiality;
            lhsConfidentiality = this.getConfidentiality();
            Coding rhsConfidentiality;
            rhsConfidentiality = that.getConfidentiality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "confidentiality", lhsConfidentiality), LocatorUtils.property(thatLocator, "confidentiality", rhsConfidentiality), lhsConfidentiality, rhsConfidentiality)) {
                return false;
            }
        }
        {
            ResourceReference lhsSubject;
            lhsSubject = this.getSubject();
            ResourceReference rhsSubject;
            rhsSubject = that.getSubject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subject", lhsSubject), LocatorUtils.property(thatLocator, "subject", rhsSubject), lhsSubject, rhsSubject)) {
                return false;
            }
        }
        {
            List<ResourceReference> lhsAuthors;
            lhsAuthors = (((this.authors!= null)&&(!this.authors.isEmpty()))?this.getAuthors():null);
            List<ResourceReference> rhsAuthors;
            rhsAuthors = (((that.authors!= null)&&(!that.authors.isEmpty()))?that.getAuthors():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "authors", lhsAuthors), LocatorUtils.property(thatLocator, "authors", rhsAuthors), lhsAuthors, rhsAuthors)) {
                return false;
            }
        }
        {
            List<CompositionAttester> lhsAttesters;
            lhsAttesters = (((this.attesters!= null)&&(!this.attesters.isEmpty()))?this.getAttesters():null);
            List<CompositionAttester> rhsAttesters;
            rhsAttesters = (((that.attesters!= null)&&(!that.attesters.isEmpty()))?that.getAttesters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attesters", lhsAttesters), LocatorUtils.property(thatLocator, "attesters", rhsAttesters), lhsAttesters, rhsAttesters)) {
                return false;
            }
        }
        {
            ResourceReference lhsCustodian;
            lhsCustodian = this.getCustodian();
            ResourceReference rhsCustodian;
            rhsCustodian = that.getCustodian();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "custodian", lhsCustodian), LocatorUtils.property(thatLocator, "custodian", rhsCustodian), lhsCustodian, rhsCustodian)) {
                return false;
            }
        }
        {
            CompositionEvent lhsEvent;
            lhsEvent = this.getEvent();
            CompositionEvent rhsEvent;
            rhsEvent = that.getEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "event", lhsEvent), LocatorUtils.property(thatLocator, "event", rhsEvent), lhsEvent, rhsEvent)) {
                return false;
            }
        }
        {
            ResourceReference lhsEncounter;
            lhsEncounter = this.getEncounter();
            ResourceReference rhsEncounter;
            rhsEncounter = that.getEncounter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encounter", lhsEncounter), LocatorUtils.property(thatLocator, "encounter", rhsEncounter), lhsEncounter, rhsEncounter)) {
                return false;
            }
        }
        {
            List<CompositionSection> lhsSections;
            lhsSections = (((this.sections!= null)&&(!this.sections.isEmpty()))?this.getSections():null);
            List<CompositionSection> rhsSections;
            rhsSections = (((that.sections!= null)&&(!that.sections.isEmpty()))?that.getSections():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sections", lhsSections), LocatorUtils.property(thatLocator, "sections", rhsSections), lhsSections, rhsSections)) {
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
            DateTime theDate;
            theDate = this.getDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate);
        }
        {
            CodeableConcept theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            CodeableConcept theClazz;
            theClazz = this.getClazz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clazz", theClazz), currentHashCode, theClazz);
        }
        {
            org.hl7.fhir.model.String theTitle;
            theTitle = this.getTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle);
        }
        {
            CompositionStatus theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            Coding theConfidentiality;
            theConfidentiality = this.getConfidentiality();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "confidentiality", theConfidentiality), currentHashCode, theConfidentiality);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subject", theSubject), currentHashCode, theSubject);
        }
        {
            List<ResourceReference> theAuthors;
            theAuthors = (((this.authors!= null)&&(!this.authors.isEmpty()))?this.getAuthors():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "authors", theAuthors), currentHashCode, theAuthors);
        }
        {
            List<CompositionAttester> theAttesters;
            theAttesters = (((this.attesters!= null)&&(!this.attesters.isEmpty()))?this.getAttesters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attesters", theAttesters), currentHashCode, theAttesters);
        }
        {
            ResourceReference theCustodian;
            theCustodian = this.getCustodian();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "custodian", theCustodian), currentHashCode, theCustodian);
        }
        {
            CompositionEvent theEvent;
            theEvent = this.getEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "event", theEvent), currentHashCode, theEvent);
        }
        {
            ResourceReference theEncounter;
            theEncounter = this.getEncounter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encounter", theEncounter), currentHashCode, theEncounter);
        }
        {
            List<CompositionSection> theSections;
            theSections = (((this.sections!= null)&&(!this.sections.isEmpty()))?this.getSections():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sections", theSections), currentHashCode, theSections);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}