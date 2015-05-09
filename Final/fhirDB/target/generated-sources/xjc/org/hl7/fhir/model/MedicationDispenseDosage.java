//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.09 at 01:15:06 AM MST 
//


package org.hl7.fhir.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * Dispensing a medication to a named patient.  This includes a description of the supply provided and the instructions for administering the medication.
 * 
 * <p>Java class for MedicationDispense.Dosage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationDispense.Dosage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement">
 *       &lt;sequence>
 *         &lt;element name="additionalInstructions" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="timingDateTime" type="{http://hl7.org/fhir}dateTime"/>
 *           &lt;element name="timingPeriod" type="{http://hl7.org/fhir}Period"/>
 *           &lt;element name="timingSchedule" type="{http://hl7.org/fhir}Schedule"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="asNeededBoolean" type="{http://hl7.org/fhir}boolean"/>
 *           &lt;element name="asNeededCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/>
 *         &lt;/choice>
 *         &lt;element name="site" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="route" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="method" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/>
 *         &lt;element name="rate" type="{http://hl7.org/fhir}Ratio" minOccurs="0"/>
 *         &lt;element name="maxDosePerPeriod" type="{http://hl7.org/fhir}Ratio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationDispense.Dosage", propOrder = {
    "additionalInstructions",
    "timingSchedule",
    "timingPeriod",
    "timingDateTime",
    "asNeededCodeableConcept",
    "asNeededBoolean",
    "site",
    "route",
    "method",
    "quantity",
    "rate",
    "maxDosePerPeriod"
})
@Entity(name = "MedicationDispenseDosage")
@Table(name = "MEDICATIONDISPENSEDOSAGE")
public class MedicationDispenseDosage
    extends BackboneElement
    implements Serializable, Equals, HashCode
{

    protected CodeableConcept additionalInstructions;
    protected Schedule timingSchedule;
    protected Period timingPeriod;
    protected DateTime timingDateTime;
    protected CodeableConcept asNeededCodeableConcept;
    protected Boolean asNeededBoolean;
    protected CodeableConcept site;
    protected CodeableConcept route;
    protected CodeableConcept method;
    protected Quantity quantity;
    protected Ratio rate;
    protected Ratio maxDosePerPeriod;

    /**
     * Gets the value of the additionalInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ADDITIONALINSTRUCTIONS_MEDIC_1")
    public CodeableConcept getAdditionalInstructions() {
        return additionalInstructions;
    }

    /**
     * Sets the value of the additionalInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setAdditionalInstructions(CodeableConcept value) {
        this.additionalInstructions = value;
    }

    /**
     * Gets the value of the timingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    @ManyToOne(targetEntity = Schedule.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TIMINGSCHEDULE_MEDICATIONDIS_0")
    public Schedule getTimingSchedule() {
        return timingSchedule;
    }

    /**
     * Sets the value of the timingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setTimingSchedule(Schedule value) {
        this.timingSchedule = value;
    }

    /**
     * Gets the value of the timingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    @ManyToOne(targetEntity = Period.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TIMINGPERIOD_MEDICATIONDISPE_0")
    public Period getTimingPeriod() {
        return timingPeriod;
    }

    /**
     * Sets the value of the timingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setTimingPeriod(Period value) {
        this.timingPeriod = value;
    }

    /**
     * Gets the value of the timingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    @ManyToOne(targetEntity = DateTime.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "TIMINGDATETIME_MEDICATIONDIS_0")
    public DateTime getTimingDateTime() {
        return timingDateTime;
    }

    /**
     * Sets the value of the timingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTimingDateTime(DateTime value) {
        this.timingDateTime = value;
    }

    /**
     * Gets the value of the asNeededCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ASNEEDEDCODEABLECONCEPT_MEDI_3")
    public CodeableConcept getAsNeededCodeableConcept() {
        return asNeededCodeableConcept;
    }

    /**
     * Sets the value of the asNeededCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setAsNeededCodeableConcept(CodeableConcept value) {
        this.asNeededCodeableConcept = value;
    }

    /**
     * Gets the value of the asNeededBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @ManyToOne(targetEntity = Boolean.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ASNEEDEDBOOLEAN_MEDICATIONDI_0")
    public Boolean getAsNeededBoolean() {
        return asNeededBoolean;
    }

    /**
     * Sets the value of the asNeededBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsNeededBoolean(Boolean value) {
        this.asNeededBoolean = value;
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
    @JoinColumn(name = "SITE_MEDICATIONDISPENSEDOSAG_0")
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
    @JoinColumn(name = "ROUTE_MEDICATIONDISPENSEDOSA_0")
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
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    @ManyToOne(targetEntity = CodeableConcept.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "METHOD__MEDICATIONDISPENSEDO_0")
    public CodeableConcept getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMethod(CodeableConcept value) {
        this.method = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    @ManyToOne(targetEntity = Quantity.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "QUANTITY_MEDICATIONDISPENSED_1")
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    @ManyToOne(targetEntity = Ratio.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "RATE_MEDICATIONDISPENSEDOSAG_0")
    public Ratio getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setRate(Ratio value) {
        this.rate = value;
    }

    /**
     * Gets the value of the maxDosePerPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    @ManyToOne(targetEntity = Ratio.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MAXDOSEPERPERIOD_MEDICATIOND_0")
    public Ratio getMaxDosePerPeriod() {
        return maxDosePerPeriod;
    }

    /**
     * Sets the value of the maxDosePerPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setMaxDosePerPeriod(Ratio value) {
        this.maxDosePerPeriod = value;
    }

    public MedicationDispenseDosage withAdditionalInstructions(CodeableConcept value) {
        setAdditionalInstructions(value);
        return this;
    }

    public MedicationDispenseDosage withTimingSchedule(Schedule value) {
        setTimingSchedule(value);
        return this;
    }

    public MedicationDispenseDosage withTimingPeriod(Period value) {
        setTimingPeriod(value);
        return this;
    }

    public MedicationDispenseDosage withTimingDateTime(DateTime value) {
        setTimingDateTime(value);
        return this;
    }

    public MedicationDispenseDosage withAsNeededCodeableConcept(CodeableConcept value) {
        setAsNeededCodeableConcept(value);
        return this;
    }

    public MedicationDispenseDosage withAsNeededBoolean(Boolean value) {
        setAsNeededBoolean(value);
        return this;
    }

    public MedicationDispenseDosage withSite(CodeableConcept value) {
        setSite(value);
        return this;
    }

    public MedicationDispenseDosage withRoute(CodeableConcept value) {
        setRoute(value);
        return this;
    }

    public MedicationDispenseDosage withMethod(CodeableConcept value) {
        setMethod(value);
        return this;
    }

    public MedicationDispenseDosage withQuantity(Quantity value) {
        setQuantity(value);
        return this;
    }

    public MedicationDispenseDosage withRate(Ratio value) {
        setRate(value);
        return this;
    }

    public MedicationDispenseDosage withMaxDosePerPeriod(Ratio value) {
        setMaxDosePerPeriod(value);
        return this;
    }

    @Override
    public MedicationDispenseDosage withModifierExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getModifierExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationDispenseDosage withModifierExtensions(Collection<Extension> values) {
        if (values!= null) {
            getModifierExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationDispenseDosage withModifierExtensions(List<Extension> modifierExtensions) {
        setModifierExtensions(modifierExtensions);
        return this;
    }

    @Override
    public MedicationDispenseDosage withExtensions(Extension... values) {
        if (values!= null) {
            for (Extension value: values) {
                getExtensions().add(value);
            }
        }
        return this;
    }

    @Override
    public MedicationDispenseDosage withExtensions(Collection<Extension> values) {
        if (values!= null) {
            getExtensions().addAll(values);
        }
        return this;
    }

    @Override
    public MedicationDispenseDosage withExtensions(List<Extension> extensions) {
        setExtensions(extensions);
        return this;
    }

    @Override
    public MedicationDispenseDosage withId(java.lang.String value) {
        setId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MedicationDispenseDosage)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MedicationDispenseDosage that = ((MedicationDispenseDosage) object);
        {
            CodeableConcept lhsAdditionalInstructions;
            lhsAdditionalInstructions = this.getAdditionalInstructions();
            CodeableConcept rhsAdditionalInstructions;
            rhsAdditionalInstructions = that.getAdditionalInstructions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalInstructions", lhsAdditionalInstructions), LocatorUtils.property(thatLocator, "additionalInstructions", rhsAdditionalInstructions), lhsAdditionalInstructions, rhsAdditionalInstructions)) {
                return false;
            }
        }
        {
            Schedule lhsTimingSchedule;
            lhsTimingSchedule = this.getTimingSchedule();
            Schedule rhsTimingSchedule;
            rhsTimingSchedule = that.getTimingSchedule();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timingSchedule", lhsTimingSchedule), LocatorUtils.property(thatLocator, "timingSchedule", rhsTimingSchedule), lhsTimingSchedule, rhsTimingSchedule)) {
                return false;
            }
        }
        {
            Period lhsTimingPeriod;
            lhsTimingPeriod = this.getTimingPeriod();
            Period rhsTimingPeriod;
            rhsTimingPeriod = that.getTimingPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timingPeriod", lhsTimingPeriod), LocatorUtils.property(thatLocator, "timingPeriod", rhsTimingPeriod), lhsTimingPeriod, rhsTimingPeriod)) {
                return false;
            }
        }
        {
            DateTime lhsTimingDateTime;
            lhsTimingDateTime = this.getTimingDateTime();
            DateTime rhsTimingDateTime;
            rhsTimingDateTime = that.getTimingDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timingDateTime", lhsTimingDateTime), LocatorUtils.property(thatLocator, "timingDateTime", rhsTimingDateTime), lhsTimingDateTime, rhsTimingDateTime)) {
                return false;
            }
        }
        {
            CodeableConcept lhsAsNeededCodeableConcept;
            lhsAsNeededCodeableConcept = this.getAsNeededCodeableConcept();
            CodeableConcept rhsAsNeededCodeableConcept;
            rhsAsNeededCodeableConcept = that.getAsNeededCodeableConcept();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "asNeededCodeableConcept", lhsAsNeededCodeableConcept), LocatorUtils.property(thatLocator, "asNeededCodeableConcept", rhsAsNeededCodeableConcept), lhsAsNeededCodeableConcept, rhsAsNeededCodeableConcept)) {
                return false;
            }
        }
        {
            Boolean lhsAsNeededBoolean;
            lhsAsNeededBoolean = this.getAsNeededBoolean();
            Boolean rhsAsNeededBoolean;
            rhsAsNeededBoolean = that.getAsNeededBoolean();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "asNeededBoolean", lhsAsNeededBoolean), LocatorUtils.property(thatLocator, "asNeededBoolean", rhsAsNeededBoolean), lhsAsNeededBoolean, rhsAsNeededBoolean)) {
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
            CodeableConcept lhsMethod;
            lhsMethod = this.getMethod();
            CodeableConcept rhsMethod;
            rhsMethod = that.getMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "method", lhsMethod), LocatorUtils.property(thatLocator, "method", rhsMethod), lhsMethod, rhsMethod)) {
                return false;
            }
        }
        {
            Quantity lhsQuantity;
            lhsQuantity = this.getQuantity();
            Quantity rhsQuantity;
            rhsQuantity = that.getQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quantity", lhsQuantity), LocatorUtils.property(thatLocator, "quantity", rhsQuantity), lhsQuantity, rhsQuantity)) {
                return false;
            }
        }
        {
            Ratio lhsRate;
            lhsRate = this.getRate();
            Ratio rhsRate;
            rhsRate = that.getRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rate", lhsRate), LocatorUtils.property(thatLocator, "rate", rhsRate), lhsRate, rhsRate)) {
                return false;
            }
        }
        {
            Ratio lhsMaxDosePerPeriod;
            lhsMaxDosePerPeriod = this.getMaxDosePerPeriod();
            Ratio rhsMaxDosePerPeriod;
            rhsMaxDosePerPeriod = that.getMaxDosePerPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxDosePerPeriod", lhsMaxDosePerPeriod), LocatorUtils.property(thatLocator, "maxDosePerPeriod", rhsMaxDosePerPeriod), lhsMaxDosePerPeriod, rhsMaxDosePerPeriod)) {
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
            CodeableConcept theAdditionalInstructions;
            theAdditionalInstructions = this.getAdditionalInstructions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalInstructions", theAdditionalInstructions), currentHashCode, theAdditionalInstructions);
        }
        {
            Schedule theTimingSchedule;
            theTimingSchedule = this.getTimingSchedule();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timingSchedule", theTimingSchedule), currentHashCode, theTimingSchedule);
        }
        {
            Period theTimingPeriod;
            theTimingPeriod = this.getTimingPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timingPeriod", theTimingPeriod), currentHashCode, theTimingPeriod);
        }
        {
            DateTime theTimingDateTime;
            theTimingDateTime = this.getTimingDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timingDateTime", theTimingDateTime), currentHashCode, theTimingDateTime);
        }
        {
            CodeableConcept theAsNeededCodeableConcept;
            theAsNeededCodeableConcept = this.getAsNeededCodeableConcept();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "asNeededCodeableConcept", theAsNeededCodeableConcept), currentHashCode, theAsNeededCodeableConcept);
        }
        {
            Boolean theAsNeededBoolean;
            theAsNeededBoolean = this.getAsNeededBoolean();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "asNeededBoolean", theAsNeededBoolean), currentHashCode, theAsNeededBoolean);
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
            CodeableConcept theMethod;
            theMethod = this.getMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "method", theMethod), currentHashCode, theMethod);
        }
        {
            Quantity theQuantity;
            theQuantity = this.getQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "quantity", theQuantity), currentHashCode, theQuantity);
        }
        {
            Ratio theRate;
            theRate = this.getRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rate", theRate), currentHashCode, theRate);
        }
        {
            Ratio theMaxDosePerPeriod;
            theMaxDosePerPeriod = this.getMaxDosePerPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxDosePerPeriod", theMaxDosePerPeriod), currentHashCode, theMaxDosePerPeriod);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
