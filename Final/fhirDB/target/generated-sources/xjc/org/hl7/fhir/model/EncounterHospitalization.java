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
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 * 
 * <p>Java class for Encounter.Hospitalization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Encounter.Hospitalization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="preAdmissionIdentifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/>
 *         &lt;element name="origin" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="admitSource" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="period" type="{http://hl7.org/fhir}Period" minOccurs="0"/>
 *         &lt;element name="accomodation" type="{http://hl7.org/fhir}Encounter.Accomodation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="diet" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="specialCourtesy" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specialArrangement" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="dischargeDisposition" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="dischargeDiagnosis" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/>
 *         &lt;element name="reAdmission" type="{http://hl7.org/fhir}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Encounter.Hospitalization", propOrder = {
    "preAdmissionIdentifier",
    "origin",
    "admitSource",
    "period",
    "accomodations",
    "diet",
    "specialCourtesies",
    "specialArrangements",
    "destination",
    "dischargeDisposition",
    "dischargeDiagnosis",
    "reAdmission"
})
@Entity(name = "EncounterHospitalization")
@Table(name = "ENCOUNTERHOSPITALIZATION")
public class EncounterHospitalization
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    protected Identifier preAdmissionIdentifier;
    protected ResourceReference origin;
    protected CodeableConcept admitSource;
    protected Period period;
    @XmlElement(name = "accomodation")
    protected List<EncounterAccomodation> accomodations;
    protected CodeableConcept diet;
    @XmlElement(name = "specialCourtesy")
    protected List<CodeableConcept> specialCourtesies;
    @XmlElement(name = "specialArrangement")
    protected List<CodeableConcept> specialArrangements;
    protected ResourceReference destination;
    protected CodeableConcept dischargeDisposition;
    protected ResourceReference dischargeDiagnosis;
    protected Boolean reAdmission;

    /**
     * Gets the value of the preAdmissionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    @ManyToOne(targetEntity = Identifier.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PREADMISSIONIDENTIFIER_ENCOU_0")
    public Identifier getPreAdmissionIdentifier() {
        return preAdmissionIdentifier;
    }

    /**
     * Sets the value of the preAdmissionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setPreAdmissionIdentifier(Identifier value) {
        this.preAdmissionIdentifier = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ORIGIN_ENCOUNTERHOSPITALIZAT_0")
    public ResourceReference getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setOrigin(ResourceReference value) {
        this.origin = value;
    }

    /**
     * Gets the value of the admitSource property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ADMITSOURCE_ENCOUNTERHOSPITA_0")
    public CodeableConcept getAdmitSource() {
        return admitSource;
    }

    /**
     * Sets the value of the admitSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setAdmitSource(CodeableConcept value) {
        this.admitSource = value;
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
    @JoinColumn(name = "PERIOD_ENCOUNTERHOSPITALIZAT_0")
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
     * Gets the value of the accomodations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accomodations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccomodations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncounterAccomodation }
     * 
     * 
     */
    @OneToMany(targetEntity = EncounterAccomodation.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ACCOMODATIONS_ENCOUNTERHOSPI_0")
    public List<EncounterAccomodation> getAccomodations() {
        if (accomodations == null) {
            accomodations = new ArrayList<EncounterAccomodation>();
        }
        return this.accomodations;
    }

    /**
     * 
     * 
     */
    public void setAccomodations(List<EncounterAccomodation> accomodations) {
        this.accomodations = accomodations;
    }

    /**
     * Gets the value of the diet property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DIET_ENCOUNTERHOSPITALIZATIO_0")
    public CodeableConcept getDiet() {
        return diet;
    }

    /**
     * Sets the value of the diet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDiet(CodeableConcept value) {
        this.diet = value;
    }

    /**
     * Gets the value of the specialCourtesies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialCourtesies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialCourtesies().add(newItem);
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
    @JoinColumn(name = "SPECIALCOURTESIES_ENCOUNTERH_0")
    public List<CodeableConcept> getSpecialCourtesies() {
        if (specialCourtesies == null) {
            specialCourtesies = new ArrayList<CodeableConcept>();
        }
        return this.specialCourtesies;
    }

    /**
     * 
     * 
     */
    public void setSpecialCourtesies(List<CodeableConcept> specialCourtesies) {
        this.specialCourtesies = specialCourtesies;
    }

    /**
     * Gets the value of the specialArrangements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialArrangements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialArrangements().add(newItem);
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
    @JoinColumn(name = "SPECIALARRANGEMENTS_ENCOUNTE_0")
    public List<CodeableConcept> getSpecialArrangements() {
        if (specialArrangements == null) {
            specialArrangements = new ArrayList<CodeableConcept>();
        }
        return this.specialArrangements;
    }

    /**
     * 
     * 
     */
    public void setSpecialArrangements(List<CodeableConcept> specialArrangements) {
        this.specialArrangements = specialArrangements;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DESTINATION_ENCOUNTERHOSPITA_0")
    public ResourceReference getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setDestination(ResourceReference value) {
        this.destination = value;
    }

    /**
     * Gets the value of the dischargeDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DISCHARGEDISPOSITION_ENCOUNT_0")
    public CodeableConcept getDischargeDisposition() {
        return dischargeDisposition;
    }

    /**
     * Sets the value of the dischargeDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDischargeDisposition(CodeableConcept value) {
        this.dischargeDisposition = value;
    }

    /**
     * Gets the value of the dischargeDiagnosis property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    @ManyToOne(targetEntity = ResourceReference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "DISCHARGEDIAGNOSIS_ENCOUNTER_0")
    public ResourceReference getDischargeDiagnosis() {
        return dischargeDiagnosis;
    }

    /**
     * Sets the value of the dischargeDiagnosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setDischargeDiagnosis(ResourceReference value) {
        this.dischargeDiagnosis = value;
    }

    /**
     * Gets the value of the reAdmission property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "READMISSION_ENCOUNTERHOSPITA_0")
    public Boolean getReAdmission() {
        return reAdmission;
    }

    /**
     * Sets the value of the reAdmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReAdmission(Boolean value) {
        this.reAdmission = value;
    }

    public EncounterHospitalization withPreAdmissionIdentifier(Identifier value) {
        setPreAdmissionIdentifier(value);
        return this;
    }

    public EncounterHospitalization withOrigin(ResourceReference value) {
        setOrigin(value);
        return this;
    }

    public EncounterHospitalization withAdmitSource(CodeableConcept value) {
        setAdmitSource(value);
        return this;
    }

    public EncounterHospitalization withPeriod(Period value) {
        setPeriod(value);
        return this;
    }

    public EncounterHospitalization withAccomodations(EncounterAccomodation... values) {
        if (values!= null) {
            for (EncounterAccomodation value: values) {
                getAccomodations().add(value);
            }
        }
        return this;
    }

    public EncounterHospitalization withAccomodations(Collection<EncounterAccomodation> values) {
        if (values!= null) {
            getAccomodations().addAll(values);
        }
        return this;
    }

    public EncounterHospitalization withAccomodations(List<EncounterAccomodation> accomodations) {
        setAccomodations(accomodations);
        return this;
    }

    public EncounterHospitalization withDiet(CodeableConcept value) {
        setDiet(value);
        return this;
    }

    public EncounterHospitalization withSpecialCourtesies(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getSpecialCourtesies().add(value);
            }
        }
        return this;
    }

    public EncounterHospitalization withSpecialCourtesies(Collection<CodeableConcept> values) {
        if (values!= null) {
            getSpecialCourtesies().addAll(values);
        }
        return this;
    }

    public EncounterHospitalization withSpecialCourtesies(List<CodeableConcept> specialCourtesies) {
        setSpecialCourtesies(specialCourtesies);
        return this;
    }

    public EncounterHospitalization withSpecialArrangements(CodeableConcept... values) {
        if (values!= null) {
            for (CodeableConcept value: values) {
                getSpecialArrangements().add(value);
            }
        }
        return this;
    }

    public EncounterHospitalization withSpecialArrangements(Collection<CodeableConcept> values) {
        if (values!= null) {
            getSpecialArrangements().addAll(values);
        }
        return this;
    }

    public EncounterHospitalization withSpecialArrangements(List<CodeableConcept> specialArrangements) {
        setSpecialArrangements(specialArrangements);
        return this;
    }

    public EncounterHospitalization withDestination(ResourceReference value) {
        setDestination(value);
        return this;
    }

    public EncounterHospitalization withDischargeDisposition(CodeableConcept value) {
        setDischargeDisposition(value);
        return this;
    }

    public EncounterHospitalization withDischargeDiagnosis(ResourceReference value) {
        setDischargeDiagnosis(value);
        return this;
    }

    public EncounterHospitalization withReAdmission(Boolean value) {
        setReAdmission(value);
        return this;
    }

    @Override
    public EncounterHospitalization withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public EncounterHospitalization withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public EncounterHospitalization withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public EncounterHospitalization withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public EncounterHospitalization withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public EncounterHospitalization withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public EncounterHospitalization withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EncounterHospitalization)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final EncounterHospitalization that = ((EncounterHospitalization) object);
        {
            Identifier lhsPreAdmissionIdentifier;
            lhsPreAdmissionIdentifier = this.getPreAdmissionIdentifier();
            Identifier rhsPreAdmissionIdentifier;
            rhsPreAdmissionIdentifier = that.getPreAdmissionIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preAdmissionIdentifier", lhsPreAdmissionIdentifier), LocatorUtils.property(thatLocator, "preAdmissionIdentifier", rhsPreAdmissionIdentifier), lhsPreAdmissionIdentifier, rhsPreAdmissionIdentifier)) {
                return false;
            }
        }
        {
            ResourceReference lhsOrigin;
            lhsOrigin = this.getOrigin();
            ResourceReference rhsOrigin;
            rhsOrigin = that.getOrigin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "origin", lhsOrigin), LocatorUtils.property(thatLocator, "origin", rhsOrigin), lhsOrigin, rhsOrigin)) {
                return false;
            }
        }
        {
            CodeableConcept lhsAdmitSource;
            lhsAdmitSource = this.getAdmitSource();
            CodeableConcept rhsAdmitSource;
            rhsAdmitSource = that.getAdmitSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "admitSource", lhsAdmitSource), LocatorUtils.property(thatLocator, "admitSource", rhsAdmitSource), lhsAdmitSource, rhsAdmitSource)) {
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
            List<EncounterAccomodation> lhsAccomodations;
            lhsAccomodations = (((this.accomodations!= null)&&(!this.accomodations.isEmpty()))?this.getAccomodations():null);
            List<EncounterAccomodation> rhsAccomodations;
            rhsAccomodations = (((that.accomodations!= null)&&(!that.accomodations.isEmpty()))?that.getAccomodations():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accomodations", lhsAccomodations), LocatorUtils.property(thatLocator, "accomodations", rhsAccomodations), lhsAccomodations, rhsAccomodations)) {
                return false;
            }
        }
        {
            CodeableConcept lhsDiet;
            lhsDiet = this.getDiet();
            CodeableConcept rhsDiet;
            rhsDiet = that.getDiet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "diet", lhsDiet), LocatorUtils.property(thatLocator, "diet", rhsDiet), lhsDiet, rhsDiet)) {
                return false;
            }
        }
        {
            List<CodeableConcept> lhsSpecialCourtesies;
            lhsSpecialCourtesies = (((this.specialCourtesies!= null)&&(!this.specialCourtesies.isEmpty()))?this.getSpecialCourtesies():null);
            List<CodeableConcept> rhsSpecialCourtesies;
            rhsSpecialCourtesies = (((that.specialCourtesies!= null)&&(!that.specialCourtesies.isEmpty()))?that.getSpecialCourtesies():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialCourtesies", lhsSpecialCourtesies), LocatorUtils.property(thatLocator, "specialCourtesies", rhsSpecialCourtesies), lhsSpecialCourtesies, rhsSpecialCourtesies)) {
                return false;
            }
        }
        {
            List<CodeableConcept> lhsSpecialArrangements;
            lhsSpecialArrangements = (((this.specialArrangements!= null)&&(!this.specialArrangements.isEmpty()))?this.getSpecialArrangements():null);
            List<CodeableConcept> rhsSpecialArrangements;
            rhsSpecialArrangements = (((that.specialArrangements!= null)&&(!that.specialArrangements.isEmpty()))?that.getSpecialArrangements():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specialArrangements", lhsSpecialArrangements), LocatorUtils.property(thatLocator, "specialArrangements", rhsSpecialArrangements), lhsSpecialArrangements, rhsSpecialArrangements)) {
                return false;
            }
        }
        {
            ResourceReference lhsDestination;
            lhsDestination = this.getDestination();
            ResourceReference rhsDestination;
            rhsDestination = that.getDestination();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "destination", lhsDestination), LocatorUtils.property(thatLocator, "destination", rhsDestination), lhsDestination, rhsDestination)) {
                return false;
            }
        }
        {
            CodeableConcept lhsDischargeDisposition;
            lhsDischargeDisposition = this.getDischargeDisposition();
            CodeableConcept rhsDischargeDisposition;
            rhsDischargeDisposition = that.getDischargeDisposition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dischargeDisposition", lhsDischargeDisposition), LocatorUtils.property(thatLocator, "dischargeDisposition", rhsDischargeDisposition), lhsDischargeDisposition, rhsDischargeDisposition)) {
                return false;
            }
        }
        {
            ResourceReference lhsDischargeDiagnosis;
            lhsDischargeDiagnosis = this.getDischargeDiagnosis();
            ResourceReference rhsDischargeDiagnosis;
            rhsDischargeDiagnosis = that.getDischargeDiagnosis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dischargeDiagnosis", lhsDischargeDiagnosis), LocatorUtils.property(thatLocator, "dischargeDiagnosis", rhsDischargeDiagnosis), lhsDischargeDiagnosis, rhsDischargeDiagnosis)) {
                return false;
            }
        }
        {
            Boolean lhsReAdmission;
            lhsReAdmission = this.getReAdmission();
            Boolean rhsReAdmission;
            rhsReAdmission = that.getReAdmission();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reAdmission", lhsReAdmission), LocatorUtils.property(thatLocator, "reAdmission", rhsReAdmission), lhsReAdmission, rhsReAdmission)) {
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
            Identifier thePreAdmissionIdentifier;
            thePreAdmissionIdentifier = this.getPreAdmissionIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preAdmissionIdentifier", thePreAdmissionIdentifier), currentHashCode, thePreAdmissionIdentifier);
        }
        {
            ResourceReference theOrigin;
            theOrigin = this.getOrigin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "origin", theOrigin), currentHashCode, theOrigin);
        }
        {
            CodeableConcept theAdmitSource;
            theAdmitSource = this.getAdmitSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "admitSource", theAdmitSource), currentHashCode, theAdmitSource);
        }
        {
            Period thePeriod;
            thePeriod = this.getPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "period", thePeriod), currentHashCode, thePeriod);
        }
        {
            List<EncounterAccomodation> theAccomodations;
            theAccomodations = (((this.accomodations!= null)&&(!this.accomodations.isEmpty()))?this.getAccomodations():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accomodations", theAccomodations), currentHashCode, theAccomodations);
        }
        {
            CodeableConcept theDiet;
            theDiet = this.getDiet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "diet", theDiet), currentHashCode, theDiet);
        }
        {
            List<CodeableConcept> theSpecialCourtesies;
            theSpecialCourtesies = (((this.specialCourtesies!= null)&&(!this.specialCourtesies.isEmpty()))?this.getSpecialCourtesies():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialCourtesies", theSpecialCourtesies), currentHashCode, theSpecialCourtesies);
        }
        {
            List<CodeableConcept> theSpecialArrangements;
            theSpecialArrangements = (((this.specialArrangements!= null)&&(!this.specialArrangements.isEmpty()))?this.getSpecialArrangements():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specialArrangements", theSpecialArrangements), currentHashCode, theSpecialArrangements);
        }
        {
            ResourceReference theDestination;
            theDestination = this.getDestination();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "destination", theDestination), currentHashCode, theDestination);
        }
        {
            CodeableConcept theDischargeDisposition;
            theDischargeDisposition = this.getDischargeDisposition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dischargeDisposition", theDischargeDisposition), currentHashCode, theDischargeDisposition);
        }
        {
            ResourceReference theDischargeDiagnosis;
            theDischargeDiagnosis = this.getDischargeDiagnosis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dischargeDiagnosis", theDischargeDiagnosis), currentHashCode, theDischargeDiagnosis);
        }
        {
            Boolean theReAdmission;
            theReAdmission = this.getReAdmission();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reAdmission", theReAdmission), currentHashCode, theReAdmission);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
