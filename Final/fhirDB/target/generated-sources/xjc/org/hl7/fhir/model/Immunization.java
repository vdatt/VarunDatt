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
 * <p>Java class for Immunization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Immunization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}Resource">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime"/>
 *         &lt;element name="vaccineType" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/>
 *         &lt;element name="refusedIndicator" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="reported" type="{http://hl7.org/fhir}boolean"/>
 *         &lt;element name="performer" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="requester" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="location" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="lotNumber" type="{http://hl7.org/fhir}string" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://hl7.org/fhir}date" minOccurs="0"/>
 *         &lt;element name="site" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="route" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="doseQuantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="explanation" type="{http://hl7.org/fhir}Immunization.Explanation" minOccurs="0"/>
 *         &lt;element name="reaction" type="{http://hl7.org/fhir}Immunization.Reaction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vaccinationProtocol" type="{http://hl7.org/fhir}Immunization.VaccinationProtocol" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Immunization", propOrder = {
    "identifiers",
    "date",
    "vaccineType",
    "subject",
    "refusedIndicator",
    "reported",
    "performer",
    "requester",
    "manufacturer",
    "location",
    "lotNumber",
    "expirationDate",
    "site",
    "route",
    "doseQuantity",
    "explanation",
    "reactions",
    "vaccinationProtocols"
})
@XmlRootElement(name = "Immunization")
@Entity(name = "Immunization")
@Table(name = "IMMUNIZATION")
public class Immunization
    extends Resource
    implements Serializable, Equals, HashCode
{

    @XmlElement(name = "identifier")
    protected List<Identifier> identifiers;
    @XmlElement(required = true)
    protected DateTime date;
    @XmlElement(required = true)
    protected CodeableConcept vaccineType;
    @XmlElement(required = true)
    protected ResourceReference subject;
    @XmlElement(required = true)
    protected Boolean refusedIndicator;
    @XmlElement(required = true)
    protected Boolean reported;
    protected ResourceReference performer;
    protected ResourceReference requester;
    protected ResourceReference manufacturer;
    protected ResourceReference location;
    protected org.hl7.fhir.model.String lotNumber;
    protected Date expirationDate;
    protected CodeableConcept site;
    protected CodeableConcept route;
    protected Quantity doseQuantity;
    protected ImmunizationExplanation explanation;
    @XmlElement(name = "reaction")
    protected List<ImmunizationReaction> reactions;
    @XmlElement(name = "vaccinationProtocol")
    protected List<ImmunizationVaccinationProtocol> vaccinationProtocols;

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
    @JoinColumn(name = "IDENTIFIERS_IMMUNIZATION_HJID")
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
    @JoinColumn(name = "DATE__IMMUNIZATION_HJID")
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
     * Gets the value of the vaccineType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VACCINETYPE_IMMUNIZATION_HJID")
    public CodeableConcept getVaccineType() {
        return vaccineType;
    }

    /**
     * Sets the value of the vaccineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setVaccineType(CodeableConcept value) {
        this.vaccineType = value;
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
    @JoinColumn(name = "SUBJECT_IMMUNIZATION_HJID")
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
     * Gets the value of the refusedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "REFUSEDINDICATOR_IMMUNIZATIO_0")
    public Boolean getRefusedIndicator() {
        return refusedIndicator;
    }

    /**
     * Sets the value of the refusedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefusedIndicator(Boolean value) {
        this.refusedIndicator = value;
    }

    /**
     * Gets the value of the reported property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "REPORTED_IMMUNIZATION_HJID")
    public Boolean getReported() {
        return reported;
    }

    /**
     * Sets the value of the reported property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReported(Boolean value) {
        this.reported = value;
    }

    /**
     * Gets the value of the performer property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PERFORMER_IMMUNIZATION_HJID")
    public ResourceReference getPerformer() {
        return performer;
    }

    /**
     * Sets the value of the performer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setPerformer(ResourceReference value) {
        this.performer = value;
    }

    /**
     * Gets the value of the requester property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "REQUESTER_IMMUNIZATION_HJID")
    public ResourceReference getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setRequester(ResourceReference value) {
        this.requester = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MANUFACTURER_IMMUNIZATION_HJ_0")
    public ResourceReference getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setManufacturer(ResourceReference value) {
        this.manufacturer = value;
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
    @JoinColumn(name = "LOCATION__IMMUNIZATION_HJID")
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
    @JoinColumn(name = "LOTNUMBER_IMMUNIZATION_HJID")
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
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    @ManyToOne(targetEntity = Date.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EXPIRATIONDATE_IMMUNIZATION__0")
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setExpirationDate(Date value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SITE_IMMUNIZATION_HJID")
    public CodeableConcept getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSite(CodeableConcept value) {
        this.site = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ROUTE_IMMUNIZATION_HJID")
    public CodeableConcept getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setRoute(CodeableConcept value) {
        this.route = value;
    }

    /**
     * Gets the value of the doseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    @ManyToOne(targetEntity = Quantity.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DOSEQUANTITY_IMMUNIZATION_HJ_0")
    public Quantity getDoseQuantity() {
        return doseQuantity;
    }

    /**
     * Sets the value of the doseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setDoseQuantity(Quantity value) {
        this.doseQuantity = value;
    }

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link ImmunizationExplanation }
     *     
     */
    @ManyToOne(targetEntity = ImmunizationExplanation.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EXPLANATION_IMMUNIZATION_HJID")
    public ImmunizationExplanation getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmunizationExplanation }
     *     
     */
    public void setExplanation(ImmunizationExplanation value) {
        this.explanation = value;
    }

    /**
     * Gets the value of the reactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImmunizationReaction }
     * 
     * 
     */
    @OneToMany(targetEntity = ImmunizationReaction.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "REACTIONS_IMMUNIZATION_HJID")
    public List<ImmunizationReaction> getReactions() {
        if (reactions == null) {
            reactions = new ArrayList<ImmunizationReaction>();
        }
        return this.reactions;
    }

    /**
     * 
     * 
     */
    public void setReactions(List<ImmunizationReaction> reactions) {
        this.reactions = reactions;
    }

    /**
     * Gets the value of the vaccinationProtocols property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vaccinationProtocols property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVaccinationProtocols().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImmunizationVaccinationProtocol }
     * 
     * 
     */
    @OneToMany(targetEntity = ImmunizationVaccinationProtocol.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VACCINATIONPROTOCOLS_IMMUNIZ_0")
    public List<ImmunizationVaccinationProtocol> getVaccinationProtocols() {
        if (vaccinationProtocols == null) {
            vaccinationProtocols = new ArrayList<ImmunizationVaccinationProtocol>();
        }
        return this.vaccinationProtocols;
    }

    /**
     * 
     * 
     */
    public void setVaccinationProtocols(List<ImmunizationVaccinationProtocol> vaccinationProtocols) {
        this.vaccinationProtocols = vaccinationProtocols;
    }

    public Immunization withIdentifiers(Identifier... values) {
        if (values!= null) {
            for (Identifier value: values) {
                getIdentifiers().add(value);
            }
        }
        return this;
    }

    public Immunization withIdentifiers(Collection<Identifier> values) {
        if (values!= null) {
            getIdentifiers().addAll(values);
        }
        return this;
    }

    public Immunization withIdentifiers(List<Identifier> identifiers) {
        setIdentifiers(identifiers);
        return this;
    }

    public Immunization withDate(DateTime value) {
        setDate(value);
        return this;
    }

    public Immunization withVaccineType(CodeableConcept value) {
        setVaccineType(value);
        return this;
    }

    public Immunization withSubject(ResourceReference value) {
        setSubject(value);
        return this;
    }

    public Immunization withRefusedIndicator(Boolean value) {
        setRefusedIndicator(value);
        return this;
    }

    public Immunization withReported(Boolean value) {
        setReported(value);
        return this;
    }

    public Immunization withPerformer(ResourceReference value) {
        setPerformer(value);
        return this;
    }

    public Immunization withRequester(ResourceReference value) {
        setRequester(value);
        return this;
    }

    public Immunization withManufacturer(ResourceReference value) {
        setManufacturer(value);
        return this;
    }

    public Immunization withLocation(ResourceReference value) {
        setLocation(value);
        return this;
    }

    public Immunization withLotNumber(org.hl7.fhir.model.String value) {
        setLotNumber(value);
        return this;
    }

    public Immunization withExpirationDate(Date value) {
        setExpirationDate(value);
        return this;
    }

    public Immunization withSite(CodeableConcept value) {
        setSite(value);
        return this;
    }

    public Immunization withRoute(CodeableConcept value) {
        setRoute(value);
        return this;
    }

    public Immunization withDoseQuantity(Quantity value) {
        setDoseQuantity(value);
        return this;
    }

    public Immunization withExplanation(ImmunizationExplanation value) {
        setExplanation(value);
        return this;
    }

    public Immunization withReactions(ImmunizationReaction... values) {
        if (values!= null) {
            for (ImmunizationReaction value: values) {
                getReactions().add(value);
            }
        }
        return this;
    }

    public Immunization withReactions(Collection<ImmunizationReaction> values) {
        if (values!= null) {
            getReactions().addAll(values);
        }
        return this;
    }

    public Immunization withReactions(List<ImmunizationReaction> reactions) {
        setReactions(reactions);
        return this;
    }

    public Immunization withVaccinationProtocols(ImmunizationVaccinationProtocol... values) {
        if (values!= null) {
            for (ImmunizationVaccinationProtocol value: values) {
                getVaccinationProtocols().add(value);
            }
        }
        return this;
    }

    public Immunization withVaccinationProtocols(Collection<ImmunizationVaccinationProtocol> values) {
        if (values!= null) {
            getVaccinationProtocols().addAll(values);
        }
        return this;
    }

    public Immunization withVaccinationProtocols(List<ImmunizationVaccinationProtocol> vaccinationProtocols) {
        setVaccinationProtocols(vaccinationProtocols);
        return this;
    }

    @Override
    public Immunization withLanguage(Code value) {
        setLanguage(value);
        return this;
    }

    @Override
    public Immunization withText(Narrative value) {
        setText(value);
        return this;
    }

    @Override
    public Immunization withContaineds(ResourceInline... values) {
        if (values!= null) {
            for (ResourceInline value: values) {
                getContaineds().add(value);
            }
        }
        return this;
    }

    @Override
    public Immunization withContaineds(Collection<ResourceInline> values) {
        if (values!= null) {
            getContaineds().addAll(values);
        }
        return this;
    }

    @Override
    public Immunization withContaineds(List<ResourceInline> containeds) {
        setContaineds(containeds);
        return this;
    }

    @Override
    public Immunization withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Immunization withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Immunization withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public Immunization withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public Immunization withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public Immunization withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public Immunization withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Immunization)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Immunization that = ((Immunization) object);
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
            DateTime lhsDate;
            lhsDate = this.getDate();
            DateTime rhsDate;
            rhsDate = that.getDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate)) {
                return false;
            }
        }
        {
            CodeableConcept lhsVaccineType;
            lhsVaccineType = this.getVaccineType();
            CodeableConcept rhsVaccineType;
            rhsVaccineType = that.getVaccineType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vaccineType", lhsVaccineType), LocatorUtils.property(thatLocator, "vaccineType", rhsVaccineType), lhsVaccineType, rhsVaccineType)) {
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
            Boolean lhsRefusedIndicator;
            lhsRefusedIndicator = this.getRefusedIndicator();
            Boolean rhsRefusedIndicator;
            rhsRefusedIndicator = that.getRefusedIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refusedIndicator", lhsRefusedIndicator), LocatorUtils.property(thatLocator, "refusedIndicator", rhsRefusedIndicator), lhsRefusedIndicator, rhsRefusedIndicator)) {
                return false;
            }
        }
        {
            Boolean lhsReported;
            lhsReported = this.getReported();
            Boolean rhsReported;
            rhsReported = that.getReported();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reported", lhsReported), LocatorUtils.property(thatLocator, "reported", rhsReported), lhsReported, rhsReported)) {
                return false;
            }
        }
        {
            ResourceReference lhsPerformer;
            lhsPerformer = this.getPerformer();
            ResourceReference rhsPerformer;
            rhsPerformer = that.getPerformer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "performer", lhsPerformer), LocatorUtils.property(thatLocator, "performer", rhsPerformer), lhsPerformer, rhsPerformer)) {
                return false;
            }
        }
        {
            ResourceReference lhsRequester;
            lhsRequester = this.getRequester();
            ResourceReference rhsRequester;
            rhsRequester = that.getRequester();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requester", lhsRequester), LocatorUtils.property(thatLocator, "requester", rhsRequester), lhsRequester, rhsRequester)) {
                return false;
            }
        }
        {
            ResourceReference lhsManufacturer;
            lhsManufacturer = this.getManufacturer();
            ResourceReference rhsManufacturer;
            rhsManufacturer = that.getManufacturer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturer", lhsManufacturer), LocatorUtils.property(thatLocator, "manufacturer", rhsManufacturer), lhsManufacturer, rhsManufacturer)) {
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
            org.hl7.fhir.model.String lhsLotNumber;
            lhsLotNumber = this.getLotNumber();
            org.hl7.fhir.model.String rhsLotNumber;
            rhsLotNumber = that.getLotNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotNumber", lhsLotNumber), LocatorUtils.property(thatLocator, "lotNumber", rhsLotNumber), lhsLotNumber, rhsLotNumber)) {
                return false;
            }
        }
        {
            Date lhsExpirationDate;
            lhsExpirationDate = this.getExpirationDate();
            Date rhsExpirationDate;
            rhsExpirationDate = that.getExpirationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "expirationDate", lhsExpirationDate), LocatorUtils.property(thatLocator, "expirationDate", rhsExpirationDate), lhsExpirationDate, rhsExpirationDate)) {
                return false;
            }
        }
        {
            CodeableConcept lhsSite;
            lhsSite = this.getSite();
            CodeableConcept rhsSite;
            rhsSite = that.getSite();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "site", lhsSite), LocatorUtils.property(thatLocator, "site", rhsSite), lhsSite, rhsSite)) {
                return false;
            }
        }
        {
            CodeableConcept lhsRoute;
            lhsRoute = this.getRoute();
            CodeableConcept rhsRoute;
            rhsRoute = that.getRoute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "route", lhsRoute), LocatorUtils.property(thatLocator, "route", rhsRoute), lhsRoute, rhsRoute)) {
                return false;
            }
        }
        {
            Quantity lhsDoseQuantity;
            lhsDoseQuantity = this.getDoseQuantity();
            Quantity rhsDoseQuantity;
            rhsDoseQuantity = that.getDoseQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "doseQuantity", lhsDoseQuantity), LocatorUtils.property(thatLocator, "doseQuantity", rhsDoseQuantity), lhsDoseQuantity, rhsDoseQuantity)) {
                return false;
            }
        }
        {
            ImmunizationExplanation lhsExplanation;
            lhsExplanation = this.getExplanation();
            ImmunizationExplanation rhsExplanation;
            rhsExplanation = that.getExplanation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "explanation", lhsExplanation), LocatorUtils.property(thatLocator, "explanation", rhsExplanation), lhsExplanation, rhsExplanation)) {
                return false;
            }
        }
        {
            List<ImmunizationReaction> lhsReactions;
            lhsReactions = (((this.reactions!= null)&&(!this.reactions.isEmpty()))?this.getReactions():null);
            List<ImmunizationReaction> rhsReactions;
            rhsReactions = (((that.reactions!= null)&&(!that.reactions.isEmpty()))?that.getReactions():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reactions", lhsReactions), LocatorUtils.property(thatLocator, "reactions", rhsReactions), lhsReactions, rhsReactions)) {
                return false;
            }
        }
        {
            List<ImmunizationVaccinationProtocol> lhsVaccinationProtocols;
            lhsVaccinationProtocols = (((this.vaccinationProtocols!= null)&&(!this.vaccinationProtocols.isEmpty()))?this.getVaccinationProtocols():null);
            List<ImmunizationVaccinationProtocol> rhsVaccinationProtocols;
            rhsVaccinationProtocols = (((that.vaccinationProtocols!= null)&&(!that.vaccinationProtocols.isEmpty()))?that.getVaccinationProtocols():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vaccinationProtocols", lhsVaccinationProtocols), LocatorUtils.property(thatLocator, "vaccinationProtocols", rhsVaccinationProtocols), lhsVaccinationProtocols, rhsVaccinationProtocols)) {
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
            DateTime theDate;
            theDate = this.getDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate);
        }
        {
            CodeableConcept theVaccineType;
            theVaccineType = this.getVaccineType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vaccineType", theVaccineType), currentHashCode, theVaccineType);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subject", theSubject), currentHashCode, theSubject);
        }
        {
            Boolean theRefusedIndicator;
            theRefusedIndicator = this.getRefusedIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refusedIndicator", theRefusedIndicator), currentHashCode, theRefusedIndicator);
        }
        {
            Boolean theReported;
            theReported = this.getReported();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reported", theReported), currentHashCode, theReported);
        }
        {
            ResourceReference thePerformer;
            thePerformer = this.getPerformer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "performer", thePerformer), currentHashCode, thePerformer);
        }
        {
            ResourceReference theRequester;
            theRequester = this.getRequester();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requester", theRequester), currentHashCode, theRequester);
        }
        {
            ResourceReference theManufacturer;
            theManufacturer = this.getManufacturer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturer", theManufacturer), currentHashCode, theManufacturer);
        }
        {
            ResourceReference theLocation;
            theLocation = this.getLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "location", theLocation), currentHashCode, theLocation);
        }
        {
            org.hl7.fhir.model.String theLotNumber;
            theLotNumber = this.getLotNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotNumber", theLotNumber), currentHashCode, theLotNumber);
        }
        {
            Date theExpirationDate;
            theExpirationDate = this.getExpirationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "expirationDate", theExpirationDate), currentHashCode, theExpirationDate);
        }
        {
            CodeableConcept theSite;
            theSite = this.getSite();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "site", theSite), currentHashCode, theSite);
        }
        {
            CodeableConcept theRoute;
            theRoute = this.getRoute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "route", theRoute), currentHashCode, theRoute);
        }
        {
            Quantity theDoseQuantity;
            theDoseQuantity = this.getDoseQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "doseQuantity", theDoseQuantity), currentHashCode, theDoseQuantity);
        }
        {
            ImmunizationExplanation theExplanation;
            theExplanation = this.getExplanation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "explanation", theExplanation), currentHashCode, theExplanation);
        }
        {
            List<ImmunizationReaction> theReactions;
            theReactions = (((this.reactions!= null)&&(!this.reactions.isEmpty()))?this.getReactions():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reactions", theReactions), currentHashCode, theReactions);
        }
        {
            List<ImmunizationVaccinationProtocol> theVaccinationProtocols;
            theVaccinationProtocols = (((this.vaccinationProtocols!= null)&&(!this.vaccinationProtocols.isEmpty()))?this.getVaccinationProtocols():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vaccinationProtocols", theVaccinationProtocols), currentHashCode, theVaccinationProtocols);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
